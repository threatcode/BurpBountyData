[
  {
    "ProfileName": "Wordpress_Config_Accessible",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,/wp-config.php",
      "true,/wp-config-sample.php",
      "true,/wp-config.php.txt",
      "true,/wp-config.php.bak",
      "true,/wp-config.php.old",
      "true,/wp-config-backup.txt",
      "true,/wp-config.php.save",
      "true,/wp-config.php~",
      "true,/wp-config.php.orig",
      "true,/wp-config.php.original",
      "true,/wp-license.php?file\u003d../..//wp-config",
      "true,/_wpeprivate/config.json",
      "true,/wp-content/debug.log"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,DB_NAME",
      "true,Or,WPENGINE_ACCOUNT"
    ],
    "Tags": [
      "All",
      "Wordpress"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Wordpress_Config_Accessible",
    "IssueSeverity": "High",
    "IssueConfidence": "Firm",
    "IssueDetail": "Wordpress_Config_Accessible\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      66,
      64
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]