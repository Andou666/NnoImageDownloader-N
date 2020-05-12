package jp.ed.nnn.imagedownloader

import akka.actor.Actor

import scala.io.{Codec, Source}

class UrlsFileLoader(config: Config) extends Actor {
  val urlsFileSource = Source.fromFile(config.urlsFilePath)(Codec.UTF8)
  val urlsIterator = urlsFileSource.getLines()

  override def receive = {

    case LoadUrlsFile =>
      //val urlsFileSource = Source.fromFile(config.urlsFilePath)(Codec.UTF8)
      //val urlsIterator = urlsFileSource.getLines()
      //urlsIterator.foreach((line) => {
      if (urlsIterator.hasNext) {
        val line = urlsIterator.next()
        val strs = line.split("\t")
        val id = strs.head
        val url = strs.tail.mkString("\t")
        val wnid = id.split("_").head
        val imageNetUrl = ImageNetUrl(id, url, wnid)
        sender() ! imageNetUrl
        //})
        //urlsFileSource.close()
      } else {
        sender() ! Finished
      }
    }
    override def postStop(): Unit =  {
        super.postStop()
        urlsFileSource.close()
  }
}