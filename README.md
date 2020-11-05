# Spring-Boot Template
<h1>利用方法</h1>
<h3>初回</h3>
<ul>
    <li>念のためgradlewファイルの改行コードがLFかどうかを確認する</li>
    <li>dockerフォルダに移動する</li>
    <li>docker-compose.ymlの中のvolumesの値を書く環境に合わせて変更</li>
    <li>コマンドで $docker-compose up を実行</li>
    <li>サーバーが起動したことを確認してから $docker-compose run --rm flyway-migrate を実行</li>
</ul>
<h3>二回目以降</h3>
<p>dockerフォルダに移動する</p>
<p>$docker-compose restart を実行</p>

<h1>デバッグの利用方法</h1>
<p><a href="https://qiita.com/Tomoyuki_Mikami/items/92f63e4e2b2241959f1e">このページ</a>に従って環境構築</p>
<p>docker-compose restartをする</p>
<p>Intellijで、デバッグボタンを押して実行</p>

<h1>構造</h1>
<p>Controller -> Service -> Mapper -> Domainsの構造をとる</p>

<h1>導入しているもの</h1>
<ul>
    <li>Spring Boot DevTools</li>
    <li>Spring Web</li>
    <li>Thymeleaf</li>
    <li>PostgreSQL Driver</li>
    <li>Flyway</li>
    <li>MyBatis</li>
    <li>JDBC</li>
</ul>
以上





