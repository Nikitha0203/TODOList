<?php

$url = 'https://localhost:8080/task';

$collection_name = 'RapidAPI';

$curl = curl_init($request_url);

curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);

curl_setopt($curl, CURLOPT_HTTPHEADER, [

'X-RapidAPI-Host: kvstore.p.rapidapi.com',

'X-RapidAPI-Key: 7xxxxxxxxxxxxxxxxxxxxxxx',

'Content-Type: application/json'

]);

$response = curl_exec($curl);

curl_close($curl);

echo $response . PHP_EOL;