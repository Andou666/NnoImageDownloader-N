# 概要
N予備校 実践大規模Webアプリ学習用リポジトリ

## コンポーネント図
![](http://www.plantuml.com/plantuml/png/RP51ImCn48Nl-HL3x_iNf0Sf2XQgxMrPP4p6TKooMPAfieZ_tT6L6eAtCEzzC--HRH7CSex117eMa0IPnnS1nvciS9gCcT5w70asXu0Bx396Ua_PR-330DoSJWVee8_fbMUsW_ciWEjaFUNLw53m2OjE7yXnMOS0lM3nPT2tWhLhlnplxoukNItdJ8zpJZDbOVf55Ff3TXpek1IXk79zqYuyOVZszZPDRugI-ydOtqQDkCUHhH-CkUI7hhkgm4QegLPRcpJJwcoZ_D-fFj1aQSLskzdIvFGZuGi0)

## クラス図
![](http://www.plantuml.com/plantuml/png/ZPBDRYen38NtUGgBrRqBtY1287IbYrI9gZ_Tfna3QJFno75QePPtBmmqJI65xaQsppcVCnv7CIofzShZGa08s2rN0erZjE8eADKP-soM20DBGPYyHuu3U5C0rfiOuJ-rECsjN9vFagmgzMjd9J76MekfGnPNRTwzEX7aArgwK6dVH-HIjYd06sgD2tlcNCGWJjRxuX7RhD7wmVY4C7zyGYkZqUdCWNMjzR_Ug9Z9h5MVZIef63kAJeWpIJNb9ezf_VLzy2jNTM719WgdNhxpBDEC5UBlGPDTwTQki4aUkMXCARmWom6a7pj33t_wvB-_t6BMThwoIUaj-pVCXkN3xauBWpXhFgcssX_3GByFX-TPb3ewLw2jf9fsUhz0v-nLxQelICfZlZojAh_gacICeKcj_m00)

## シーケンス図
![](http://www.plantuml.com/plantuml/png/jTFFIW9H50Rm_Jp5CAjQz08jmWY48C5oqQRDf1SPSXJ6iN0vvwRb7vYAr49QbL6ArIAYFv4FytN7r-XE3TA4e0NjxcA-t-5yd8daRTso2sP6KRHrjWdU1By6NO8UD7LkGTNY6RqOjNIJxUIiBKsTLuV7BuAxe2ElsXXU3PIVN_YXg95XYMBUPgQV07N1kw17y2fuRmIy3yv4_sGi42icLbU-JNDkm5lWVV13y3BeV1I7SmggZKNMMCh8-uYug7Xk6pG0FO5kPHOagGxuAvoUA7L0zKzaAPVTPfOTDv9smMABIJjdRMHdGhGebsOdy4uTJXVEBfoQQBZo8GxsGVBHzeS4EP-OTjx47MgWYd2ReAhOUvQDJBt9z6rBNhorfFtxefPDFSrYUjf8XWyeMEalPFZ0lg303H_6FpJXjU-zvbt0An6MJSdVvmC0)

## URL 設計

|パス|メソッド|内容|
|---|---|---|
|/|GET|トップページ|
|/login|GET|Twitterを利用したログイン|
|/logout|GET|Twitterを利用したログアウト|
|/oauth_callback|GET|TwitterからのOAuth認証のコールバックを受け取る|
|/pictures|POST|画像とプロパティ情報の投稿|
|/pictures/:pictureId|GET|変換された画像のバイナリの表示|
|/properties|GET|プロパティ情報の一覧のJSONを取得するWeb|
|/users/:twitterId/properties|GET|Twitterユーザーのプロパティ情報の一覧のJSONを取得するWebAPI|


## 備考

- mysql 5.7.19
- redis 4.0.1
- imagemagick 7.0.6.10
- [瀬戸フォント](http://setofont.osdn.jp/)
