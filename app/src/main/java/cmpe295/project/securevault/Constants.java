package cmpe295.project.securevault;

/**
 * Created by raoa on 4/24/2016.
 */
public class Constants {


       public  static int CRITICAL_INDEX = 0;
        public static int WARNING_INDEX = 1;
        public static int NOTICE_INDEX = 2;


    public static String jsonStrings = "{\n" +
            "\t\"time_finish_analyze\": {\n" +
            "    \t\"$date\": 1461543139323\n" +
            "\t},\n" +
            "\t\"package_name\": \"com.turbochilli.unrollme\",\n" +
            "\t\"notice_vectors\": [\n" +
            "    \t\"HACKER_DEBUGGABLE_CHECK\",\n" +
            "    \t\"HACKER_SIGNATURE_CHECK\",\n" +
            "    \t\"NATIVE_LIBS_LOADING\",\n" +
            "    \t\"PERMISSION_EXPORTED_GOOGLE\",\n" +
            "    \t\"DB_SQLITE_JOURNAL\",\n" +
            "    \t\"FILE_DELETE\",\n" +
            "    \t\"HACKER_INSTALL_SOURCE_CHECK\",\n" +
            "    \t\"ALLOW_BACKUP\"\n" +
            "\t],\n" +
            "\t\"scanCompareResults\": {\n" +
            "    \t\"Bkav\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.3.0.7744\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"MicroWorld-eScan\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"12.0.250.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"nProtect\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"2016-04-15.01\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"CMC\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.1.0.977\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"CAT-QuickHeal\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"14.00\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"ALYac\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0.1.9\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Malwarebytes\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"2.1.1.1115\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"VIPRE\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"48662\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"K7AntiVirus\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"9.221.19324\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"BitDefender\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"7.2\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"K7GW\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"9.221.19325\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"TheHacker\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"6.8.0.5.895\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Baidu\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0.0.2\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"F-Prot\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"4.7.1.166\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Symantec\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"20151.1.0.32\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"ESET-NOD32\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"13343\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"TrendMicro-HouseCall\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"9.800.0.1009\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Avast\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"8.0.1489.320\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"ClamAV\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"0.98.5.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Kaspersky\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"15.0.1.13\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Alibaba\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"NANO-Antivirus\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0.30.7834\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"ViRobot\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"2014.3.20.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"SUPERAntiSpyware\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"5.6.0.1032\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Tencent\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0.0.1\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Ad-Aware\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"3.0.2.1015\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Sophos\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"4.98.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Comodo\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"24813\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"F-Secure\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"11.0.19100.45\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"DrWeb\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"7.0.18.3140\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Zillya\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"2.0.0.2790\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"TrendMicro\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"9.740.0.1012\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"McAfee-GW-Edition\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"v2015\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Emsisoft\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"3.5.0.656\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Cyren\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"5.4.16.7\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Jiangmin\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"16.0.100\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Avira\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"8.3.3.4\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"Antiy-AVL\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0.0.1\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Kingsoft\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"2013.8.14.323\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Microsoft\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.1.12603.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"Arcabit\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0.0.669\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"AegisLab\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"4.2\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"AhnLab-V3\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"2016.04.16.00\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"GData\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"25\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"TotalDefense\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"37.1.62.1\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"McAfee\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"6.0.6.653\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"AVware\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.5.0.42\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"VBA32\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"3.12.26.4\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"Baidu-International\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"3.5.1.41473\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"Zoner\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Rising\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"25.0.0.18\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Yandex\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"5.5.1.3\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"Ikarus\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"T3.2.0.9.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"Fortinet\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"5.1.220.0\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"AVG\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"16.0.0.4545\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t},\n" +
            "    \t\"Panda\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"4.6.4.2\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160415\"\n" +
            "    \t},\n" +
            "    \t\"Qihoo-360\": {\n" +
            "        \t\"detected\": false,\n" +
            "        \t\"version\": \"1.0.0.1120\",\n" +
            "        \t\"result\": null,\n" +
            "        \t\"update\": \"20160416\"\n" +
            "    \t}\n" +
            "\t},\n" +
            "\t\"time_starting_analyze\": {\n" +
            "    \t\"$date\": 1461543095448\n" +
            "\t},\n" +
            "\t\"threatQ\": \"RED\",\n" +
            "\t\"apk_filepath_absolute\": \"/home/nikhil/Documents/295B/downloads/com.turbochilli.unrollme.apk\",\n" +
            "\t\"vector_total_count\": 53,\n" +
            "\t\"platform\": \"Android\",\n" +
            "\t\"critical_vectors\": [\n" +
            "    \t\"SSL_URLS_NOT_IN_HTTPS\",\n" +
            "    \t\"WEBVIEW_RCE\",\n" +
            "    \t\"SSL_CN1\"\n" +
            "\t],\n" +
            "\t\"time_loading_vm\": 32.577373,\n" +
            "\t\"details\": {\n" +
            "    \t\"EXTERNAL_STORAGE\": {\n" +
            "        \t\"count\": 3,\n" +
            "        \t\"title\": \"External storage access found (Remember DO NOT write important files to external storages):\",\n" +
            "        \t\"summary\": \"External Storage Accessing\",\n" +
            "        \t\"vector_details\": \"=> Lcom/prime31/EtceteraPlugin$19;->run()V (0x1c) ---> Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;\\n=> Lcom/prime31/EtceteraPlugin$20;->run()V (0x1c) ---> Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;\\n=> Lcom/unity3d/player/UnityPlayer;->a(Landroid/content/Context;)[Ljava/lang/String; (0x42) ---> Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;\",\n" +
            "        \t\"level\": \"Warning\"\n" +
            "    \t},\n" +
            "    \t\"HACKER_KEYSTORE_NO_PWD\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"KeyStore\",\n" +
            "            \t\"Hacker\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Ignore checking KeyStore protected by password or not because you're not using KeyStore.\",\n" +
            "        \t\"summary\": \"KeyStore Protection Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"WEBVIEW_JS_ENABLED\": {\n" +
            "        \t\"count\": 10,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"WebView\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Found \\\"setJavaScriptEnabled(true)\\\" in WebView, which could exposed to potential XSS attacks. Please check the web page code carefully and sanitize the output:\",\n" +
            "        \t\"level\": \"Warning\",\n" +
            "        \t\"summary\": \"WebView Potential XSS Attacks Checking\",\n" +
            "        \t\"vector_details\": \"=> Lcom/chartboost/sdk/impl/bs$b;-><init>(Lcom/chartboost/sdk/impl/bs; Landroid/content/Context;)V (0x2e) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/flurry/sdk/n;-><init>(Landroid/content/Context; Ljava/lang/String; Z)V (0x72) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/google/android/gms/internal/gu;-><init>(Lcom/google/android/gms/internal/gu$a; Lcom/google/android/gms/internal/ay; Z Z Lcom/google/android/gms/internal/k; Lcom/google/android/gms/internal/gs;)V (0x5a) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/inmobi/androidsdk/IMBrowserActivity;->onCreate(Landroid/os/Bundle;)V (0x1b0) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/inmobi/commons/analytics/iat/impl/net/AdTrackerWebViewLoader$1;->run()V (0x52) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/inmobi/monetization/internal/e;-><init>(Landroid/content/Context; Ljava/lang/String; Ljava/lang/String;)V (0x7a) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/inmobi/monetization/internal/imai/WebviewLoader$1;->run()V (0x5a) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/inmobi/re/container/IMWebView;->c()V (0xc2) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/playhaven/android/view/HTMLView;->setPlacement(Lcom/playhaven/android/Placement;)V (0xe) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\\n=> Lcom/prime31/WebViewActivity;->createWebView(Landroid/content/Context;)Landroid/webkit/WebView; (0x30) ---> Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V\"\n" +
            "    \t},\n" +
            "    \t\"SSL_URLS_NOT_IN_HTTPS\": {\n" +
            "        \t\"count\": 28,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"SSL_Security\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"URLs that are NOT under SSL (Total:13):\",\n" +
            "        \t\"level\": \"Critical\",\n" +
            "        \t\"summary\": \"SSL Connection Checking\",\n" +
            "        \t\"vector_details\": \"http://a.ai.inmobi.com/v2/ad.html\\n\t=> Lcom/inmobi/commons/analytics/bootstrapper/AnalyticsEndPointsConfig;-><init>()V\\nhttp://adlog.flurry.com\\n\t=> Lcom/flurry/android/impl/ads/FlurryAdModule;->x()Ljava/lang/String;\\nhttp://ads.flurry.com/v10/getAds.do\\n\t=> Lcom/flurry/android/impl/ads/FlurryAdModule;->w()Ljava/lang/String;\\nhttp://data.flurry.com/aap.do\\n\t=> Lcom/flurry/sdk/dd;-><clinit>()V\\nhttp://dock.inmobi.com/carb/v1/i\\n\t=> Lcom/inmobi/monetization/internal/carb/CarbConfigParams;->setFromMap(Ljava/util/Map;)V\\n\t=> Lcom/inmobi/monetization/internal/carb/CarbConfigParams;-><init>()V\\nhttp://dock.inmobi.com/carb/v1/o\\n\t=> Lcom/inmobi/monetization/internal/carb/CarbConfigParams;-><init>()V\\n\t=> Lcom/inmobi/monetization/internal/carb/CarbConfigParams;->setFromMap(Ljava/util/Map;)V\\nhttp://flurry.cachefly.net/vast/videocontrols/v1/android.zip\\n\t=> Lcom/flurry/sdk/t;->e()V\\nhttp://i.w.inmobi.com/showad.asm\\n\t=> Lcom/inmobi/monetization/internal/c;-><clinit>()V\\nhttp://market.android.com/\\n\t=> Lcom/chartboost/sdk/impl/bc;->a(Ljava/lang/String; Landroid/content/Context; Lcom/chartboost/sdk/d$b;)V\\nhttp://plus.google.com/\\n\t=> Lcom/google/android/gms/internal/jo;-><clinit>()V\\nhttp://twitter.com/home?status=\\n\t=> Lcom/inmobi/androidsdk/IMBrowserActivity;->a(I Ljava/lang/String; Ljava/lang/String; Ljava/lang/String; I)V\\nhttp://www.google.com\\n\t=> Lcom/google/android/gms/internal/fv;-><init>(Landroid/content/Context;)V\\nhttp://xmlpull.org/v1/doc/features.html#process-namespaces\\n\t=> Lcom/flurry/sdk/ck;->a(Ljava/lang/String;)Lcom/flurry/sdk/ci;\"\n" +
            "    \t},\n" +
            "    \t\"MASTER_KEY\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"No Master Key Type I Vulnerability in this APK.\",\n" +
            "        \t\"cve_number\": \"CVE-2013-4787\",\n" +
            "        \t\"level\": \"Info\",\n" +
            "        \t\"summary\": \"Master Key Type I Vulnerability\"\n" +
            "    \t},\n" +
            "    \t\"USE_PERMISSION_SYSTEM_APP\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"No system-level critical use-permission found.\",\n" +
            "        \t\"summary\": \"AndroidManifest System Use Permission Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"SSL_DEFAULT_SCHEME_NAME\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"SSL_Security\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"DEFAULT_SCHEME_NAME for HttpHost check: OK\",\n" +
            "        \t\"summary\": \"SSL Implementation Checking (HttpHost)\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_GROUP_EMPTY_VALUE\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"PermissionGroup in permission tag of AndroidManifest sets correctly.\",\n" +
            "        \t\"summary\": \"AndroidManifest PermissionGroup Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"FILE_DELETE\": {\n" +
            "        \t\"count\": 40,\n" +
            "        \t\"title\": \"Everything you delete may be recovered by any user or attacker, especially rooted devices.\\nPlease make sure do not use \\\"file.delete()\\\" to delete essential files.\\nCheck this video: https://www.youtube.com/watch?v=tGw1fxUD-uY\",\n" +
            "        \t\"summary\": \"File Unsafe Delete Checking\",\n" +
            "        \t\"vector_details\": \"=> Lcom/chartboost/sdk/Libraries/h;->b()V (0x48) ---> Ljava/io/File;->delete()Z\\n=> Lcom/chartboost/sdk/Libraries/h;->b()V (0x76) ---> Ljava/io/File;->delete()Z\\n=> Lcom/chartboost/sdk/Libraries/h;->c(Ljava/io/File;)V (0x12) ---> Ljava/io/File;->delete()Z\\n=> Lcom/chartboost/sdk/impl/w;->a(I)V (0xd8) ---> Ljava/io/File;->delete()Z\\n=> Lcom/chartboost/sdk/impl/w;->a()V (0xaa) ---> Ljava/io/File;->delete()Z\\n=> Lcom/chartboost/sdk/impl/w;->a(Ljava/lang/String; Lcom/chartboost/sdk/impl/b$a;)V (0x68) ---> Ljava/io/File;->delete()Z\\n=> Lcom/chartboost/sdk/impl/w;->b(Ljava/lang/String;)V (0xa) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/android/impl/ads/FlurryAdModule;->af()V (0x76) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/android/impl/ads/FlurryAdModule;->H()V (0x70) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/android/impl/ads/FlurryAdModule;->N()V (0x82) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/aa;->f()V (0xa8) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/ap;->e(Ljava/lang/String;)Z (0x54) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/at;->h()V (0xe) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/cy;->a()V (0x6) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/df;->c()Z (0x14) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/dg;->a(Ljava/io/File;)Z (0x4e) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/dj;->C()V (0xca) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/fd;->a(Ljava/io/File; Ljava/lang/String;)V (0x52) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/fd;->b(Ljava/io/File;)Z (0x44) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/fh;->a(Ljava/io/File; I I J)Lcom/flurry/sdk/fh; (0x64) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/fh;->a(Ljava/io/File;)V (0xc) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/fh;->e()V (0x1ba) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/fh;->c(Ljava/lang/String;)Z (0x7c) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/fj;->a(Ljava/io/File;)V (0x5c) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/t$1;->a(Lcom/flurry/sdk/as;)V (0x22) ---> Ljava/io/File;->delete()Z\\n=> Lcom/flurry/sdk/t;->e()V (0x110) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/analytics/ag$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase; (0x9e) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/common/data/a;->gU()Ljava/io/FileOutputStream; (0x46) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x308) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x328) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x33a) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x35a) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/tagmanager/cb$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase; (0x9e) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/tagmanager/cq;->c(Lcom/google/android/gms/internal/pu$a;)Z (0x54) ---> Ljava/io/File;->delete()Z\\n=> Lcom/google/android/gms/tagmanager/v$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase; (0x32) ---> Ljava/io/File;->delete()Z\\n=> Lcom/inmobi/re/container/IMWebView;->b()V (0x78) ---> Ljava/io/File;->delete()Z\\n=> Lcom/inmobi/re/container/IMWebView;->b()V (0x84) ---> Ljava/io/File;->delete()Z\\n=> Lcom/inmobi/re/controller/JSUtilityController;->saveContent(Ljava/lang/String; Ljava/lang/String;)V (0x4e) ---> Ljava/io/File;->delete()Z\\n=> Lcom/playhaven/android/cache/CacheCleaner;->run()V (0x36) ---> Ljava/io/File;->delete()Z\\n=> Lcom/unity3d/player/PsmMainActivity;->a(Ljava/io/File;)V (0x2c) ---> Ljava/io/File;->delete()Z\",\n" +
            "        \t\"level\": \"Notice\"\n" +
            "    \t},\n" +
            "    \t\"HACKER_DB_KEY\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Database\",\n" +
            "            \t\"Hacker\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Did not find using the symmetric key(PRAGMA key) to encrypt the SQLite databases (It's still possible that it might use but we did not find out).\",\n" +
            "        \t\"summary\": \"Key for Android SQLite Databases Encryption\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"WEBVIEW_RCE\": {\n" +
            "        \t\"count\": 10,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"WebView\",\n" +
            "            \t\"Remote Code Execution\"\n" +
            "        \t],\n" +
            "        \t\"level\": \"Critical\",\n" +
            "        \t\"title\": \"Found a critical WebView \\\"addJavascriptInterface\\\" vulnerability. This method can be used to allow JavaScript to control the host application. \\nThis is a powerful feature, but also presents a security risk for applications targeted to API level JELLY_BEAN(4.2) or below, because JavaScript could use reflection to access an injected object's public fields. Use of this method in a WebView containing untrusted content could allow an attacker to manipulate the host application in unintended ways, executing Java code with the permissions of the host application. \\nReference: \\n  1.\\\"http://developer.android.com/reference/android/webkit/WebView.html#addJavascriptInterface(java.lang.Object, java.lang.String) \\\"\\n  2.https://labs.mwrinfosecurity.com/blog/2013/09/24/webview-addjavascriptinterface-remote-code-execution/\\n  3.http://50.56.33.56/blog/?p=314\\n  4.http://blog.trustlook.com/2013/09/04/alert-android-webview-addjavascriptinterface-code-execution-vulnerability/\\nPlease modify the below code:\",\n" +
            "        \t\"summary\": \"WebView RCE Vulnerability Checking\",\n" +
            "        \t\"cve_number\": \"CVE-2013-4710\",\n" +
            "        \t\"vector_details\": \"=> Lcom/inmobi/monetization/internal/BannerAd;->i()V (0xd8) ---> Lcom/inmobi/re/container/IMWebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/inmobi/monetization/internal/BannerAd;->initialize()Z (0x88) ---> Lcom/inmobi/re/container/IMWebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/inmobi/monetization/internal/BannerAd;->initialize()Z (0xdc) ---> Lcom/inmobi/re/container/IMWebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/inmobi/monetization/internal/InterstitialAd;->f()V (0x50) ---> Lcom/inmobi/re/container/IMWebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/inmobi/re/container/IMWebView;->c()V (0xf4) ---> Lcom/inmobi/re/container/IMWebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/inmobi/re/container/IMWebView;->c()V (0x200) ---> Lcom/inmobi/re/container/IMWebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/inmobi/re/container/IMWebView;->addJavascriptObject(Ljava/lang/Object; Ljava/lang/String;)V (0x0) ---> Lcom/inmobi/re/container/IMWebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/inmobi/re/controller/JSUtilityController;-><init>(Lcom/inmobi/re/container/IMWebView; Landroid/content/Context;)V (0x50) ---> Lcom/inmobi/re/container/IMWebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/inmobi/commons/analytics/iat/impl/net/AdTrackerWebViewLoader$1;->run()V (0x8e) ---> Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\\n=> Lcom/prime31/EtceteraPlugin$31;->run()V (0x8e) ---> Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object; Ljava/lang/String;)V\"\n" +
            "    \t},\n" +
            "    \t\"COMMAND_MAYBE_SYSTEM\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Command\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Did not find codes checking \\\"root\\\" permission(su) or getting system permission (It's still possible we did not find out).\",\n" +
            "        \t\"summary\": \"Executing \\\"root\\\" or System Privilege Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"SHARED_USER_ID\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"System\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app does not use \\\"android.uid.system\\\" sharedUserId.\",\n" +
            "        \t\"summary\": \"AndroidManifest sharedUserId Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"FRAGMENT_INJECTION\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"Did not detect the vulnerability of \\\"Fragment\\\" dynamically loading into \\\"PreferenceActivity\\\" or \\\"SherlockPreferenceActivity\\\"\",\n" +
            "        \t\"cve_number\": \"BID 64208, CVE-2013-6271\",\n" +
            "        \t\"level\": \"Info\",\n" +
            "        \t\"summary\": \"Fragment Vulnerability Checking\"\n" +
            "    \t},\n" +
            "    \t\"HACKER_PREVENT_SCREENSHOT_CHECK\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Hacker\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Did not detect this app has code setting preventing screenshot capturing.\",\n" +
            "        \t\"summary\": \"Code Setting Preventing Screenshot Capturing\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_NO_PREFIX_EXPORTED\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"No exported components that forgot to add \\\"android:\\\" prefix.\",\n" +
            "        \t\"cve_number\": \"CVE-2013-6272\",\n" +
            "        \t\"level\": \"Info\",\n" +
            "        \t\"summary\": \"AndroidManifest Exported Lost Prefix Checking\"\n" +
            "    \t},\n" +
            "    \t\"SENSITIVE_DEVICE_ID\": {\n" +
            "        \t\"count\": 1,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Sensitive_Information\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app has code getting the \\\"device id(IMEI)\\\" but there are problems with this \\\"TelephonyManager.getDeviceId()\\\" approach.\\n1.Non-phones: Wifi-only devices or music players that don't have telephony hardware just don't have this kind of unique identifier.\\n2.Persistence: On devices which do have this, it persists across device data wipes and factory resets. It's not clear at all if, in this situation, your app should regard this as the same device.\\n3.Privilege:It requires READ_PHONE_STATE permission, which is irritating if you don't otherwise use or need telephony.\\n4.Bugs: We have seen a few instances of production phones for which the implementation is buggy and returns garbage, for example zeros or asterisks.\\nIf you want to get an unique id for the device, we suggest you use \\\"Installation\\\" framework in the following article.\\nPlease check the reference: http://android-developers.blogspot.tw/2011/03/identifying-app-installations.html\",\n" +
            "        \t\"level\": \"Warning\",\n" +
            "        \t\"summary\": \"Getting IMEI and Device ID\",\n" +
            "        \t\"vector_details\": \"=> Lcom/flurry/sdk/dy;->b()V (0x28) ---> Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;\"\n" +
            "    \t},\n" +
            "    \t\"MODE_WORLD_READABLE_OR_MODE_WORLD_WRITEABLE\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"No security issues \\\"MODE_WORLD_READABLE\\\" or \\\"MODE_WORLD_WRITEABLE\\\" found on 'openOrCreateDatabase' or 'openOrCreateDatabase2' or 'getDir' or 'getSharedPreferences' or 'openFileOutput'\",\n" +
            "        \t\"summary\": \"App Sandbox Permission Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"SSL_CN1\": {\n" +
            "        \t\"count\": 1,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"SSL_Security\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app allows Self-defined HOSTNAME VERIFIER to accept all Common Names(CN). \\nThis is a critical vulnerability and allows attackers to do MITM attacks with his valid certificate without your knowledge. \\nCase example: \\n(1)http://osvdb.org/96411 \\n(2)http://www.wooyun.org/bugs/wooyun-2010-042710 \\n(3)http://www.wooyun.org/bugs/wooyun-2010-052339\\nAlso check Google doc: http://developer.android.com/training/articles/security-ssl.html (Caution: Replacing HostnameVerifier can be very dangerous). \\nOWASP Mobile Top 10 doc: https://www.owasp.org/index.php/Mobile_Top_10_2014-M3\\nCheck this book to see how to solve this issue: http://goo.gl/BFb65r \\n\\nTo see what's the importance of Common Name(CN) verification.\\nUse Google Chrome to navigate:\\n - https://www.google.com   => SSL certificate is valid\\n - https://60.199.175.158/  => This is the IP address of google.com, but the CN is not match, making the certificate invalid. You still can go Google.com but now you cannot distinguish attackers from normal users\\n\\nPlease check the code inside these methods:\",\n" +
            "        \t\"level\": \"Critical\",\n" +
            "        \t\"summary\": \"SSL Implementation Checking (Verifying Host Name in Custom Classes)\",\n" +
            "        \t\"vector_details\": \"Lcom/flurry/sdk/eh;->verify(Ljava/lang/String; Ljavax/net/ssl/SSLSession;)Z\"\n" +
            "    \t},\n" +
            "    \t\"SSL_CN3\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"SSL_Security\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Did not detect SSLSocketFactory by insecure method \\\"getInsecure\\\".\",\n" +
            "        \t\"summary\": \"SSL Implementation Checking (Insecure component)\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"SSL_CN2\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"SSL_Security\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Critical vulnerability \\\"ALLOW_ALL_HOSTNAME_VERIFIER\\\" field setting or \\\"AllowAllHostnameVerifier\\\" class instance not found.\",\n" +
            "        \t\"summary\": \"SSL Implementation Checking (Verifying Host Name in Fields)\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_NORMAL\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"No default or \\\"normal\\\" protection level customized permission found (AndroidManifest.xml).\",\n" +
            "        \t\"summary\": \"AndroidManifest Normal ProtectionLevel of Permission Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"DB_DEPRECATED_USE1\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Database\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Ignore checking \\\"SQLiteDatabase:beginTransactionNonExclusive\\\" you're not using it.\",\n" +
            "        \t\"summary\": \"SQLiteDatabase Transaction Deprecated Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_IMPLICIT_SERVICE\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Implicit_Intent\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"No dangerous implicit service.\",\n" +
            "        \t\"summary\": \"Implicit Service Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_INTENT_FILTER_MISCONFIG\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"\\\"intent-filter\\\" of AndroidManifest.xml check OK.\",\n" +
            "        \t\"summary\": \"AndroidManifest \\\"intent-filter\\\" Settings Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"HTTPURLCONNECTION_BUG\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"Ignore checking \\\"http.keepAlive\\\" because you're not using \\\"HttpURLConnection\\\" and min_Sdk > 8.\",\n" +
            "        \t\"summary\": \"HttpURLConnection Android Bug Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_EXPORTED_GOOGLE\": {\n" +
            "        \t\"count\": 2,\n" +
            "        \t\"title\": \"Found \\\"exported\\\" components(except for Launcher) for receiving Google's \\\"Android\\\" actions (AndroidManifest.xml):\",\n" +
            "        \t\"summary\": \"AndroidManifest Exported Components Checking 2\",\n" +
            "        \t\"vector_details\": \"  activity => com.playhaven.android.view.FullScreen\\n  receiver => com.playhaven.android.push.PushReceiver\",\n" +
            "        \t\"level\": \"Notice\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_DANGEROUS\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"No \\\"dangerous\\\" protection level customized permission found (AndroidManifest.xml).\",\n" +
            "        \t\"summary\": \"AndroidManifest Dangerous ProtectionLevel of Permission Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"FRAMEWORK_MONODROID\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Framework\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app is NOT using MonoDroid Framework (http://xamarin.com/android).\",\n" +
            "        \t\"summary\": \"Framework - MonoDroid\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"WEBVIEW_ALLOW_FILE_ACCESS\": {\n" +
            "        \t\"count\": 22,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"WebView\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Found \\\"setAllowFileAccess(true)\\\" or not set(enabled by default) in WebView. The attackers could inject malicious script into WebView and exploit the opportunity to access local resources. This can be mitigated or prevented by disabling local file system access. (It is enabled by default)\\nNote that this enables or disables file system access only. Assets and resources are still accessible using file:///android_asset and file:///android_res.\\nThe attackers can use \\\"mWebView.loadUrl(\\\"file:///data/data/[Your_Package_Name]/[File]\\\");\\\" to access app's local file.\\nReference: (1)https://labs.mwrinfosecurity.com/blog/2012/04/23/adventures-with-android-webviews/\\n       \t(2)http://developer.android.com/reference/android/webkit/WebSettings.html#setAllowFileAccess(boolean)\\nPlease add or modify \\\"yourWebView.getSettings().setAllowFileAccess(false)\\\" to your WebView:\",\n" +
            "        \t\"level\": \"Warning\",\n" +
            "        \t\"summary\": \"WebView Local File Access Attacks Checking\",\n" +
            "        \t\"vector_details\": \"Lcom/chartboost/sdk/impl/bs$b;-><init>(Lcom/chartboost/sdk/impl/bs; Landroid/content/Context;)V\\nLcom/flurry/sdk/cg;->b(Landroid/content/Context;)Ljava/lang/String;\\nLcom/flurry/sdk/cg;->c(Landroid/content/Context;)Ljava/lang/String;\\nLcom/flurry/sdk/g;->initLayout()V\\nLcom/flurry/sdk/n;-><init>(Landroid/content/Context; Ljava/lang/String; Z)V\\nLcom/google/android/gms/internal/an$2;->run()V\\nLcom/google/android/gms/internal/gi;->a(Landroid/content/Context; Ljava/lang/String; Landroid/webkit/WebSettings;)V\\nLcom/google/android/gms/internal/gi;->r(Landroid/content/Context;)Ljava/lang/String;\\nLcom/google/android/gms/internal/gm;->a(Landroid/content/Context; Landroid/webkit/WebSettings;)V\\nLcom/google/android/gms/internal/go;->a(Landroid/content/Context; Landroid/webkit/WebSettings;)V\\nLcom/google/android/gms/internal/go;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;\\nLcom/google/android/gms/internal/gu;-><init>(Lcom/google/android/gms/internal/gu$a; Lcom/google/android/gms/internal/ay; Z Z Lcom/google/android/gms/internal/k; Lcom/google/android/gms/internal/gs;)V\\nLcom/inmobi/androidsdk/IMBrowserActivity;->onCreate(Landroid/os/Bundle;)V\\nLcom/inmobi/commons/analytics/iat/impl/net/AdTrackerWebViewLoader$1;->run()V\\nLcom/inmobi/commons/internal/InternalSDKUtil$a;->a(Landroid/content/Context;)Ljava/lang/String;\\nLcom/inmobi/commons/internal/InternalSDKUtil;->getUserAgent()Ljava/lang/String;\\nLcom/inmobi/monetization/internal/e;-><init>(Landroid/content/Context; Ljava/lang/String; Ljava/lang/String;)V\\nLcom/inmobi/monetization/internal/imai/WebviewLoader$1;->run()V\\nLcom/inmobi/re/container/IMWebView;->c()V\\nLcom/playhaven/android/view/HTMLView;->setPlacement(Lcom/playhaven/android/Placement;)V\\nLcom/prime31/WebViewActivity;->createWebView(Landroid/content/Context;)Landroid/webkit/WebView;\\nLcom/prime31/WebViewActivity;->setUpWebView(Z)V\"\n" +
            "    \t},\n" +
            "    \t\"HACKER_BASE64_STRING_DECODE\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Hacker\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"No encoded Base64 String or Urls found.\",\n" +
            "        \t\"summary\": \"Base64 String Encryption\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"DYNAMIC_CODE_LOADING\": {\n" +
            "        \t\"count\": 10,\n" +
            "        \t\"title\": \"Dynamic code loading(DexClassLoader) found:\",\n" +
            "        \t\"summary\": \"Dynamic Code Loading\",\n" +
            "        \t\"vector_details\": \"=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0xaa) ---> Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String; Ljava/lang/String; Ljava/lang/String; Ljava/lang/ClassLoader;)V\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0xc0) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0xd8) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0xf0) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x108) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x120) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x138) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x150) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x168) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\\n=> Lcom/google/android/gms/internal/i;->g(Landroid/content/Context;)V (0x180) ---> Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;\",\n" +
            "        \t\"level\": \"Warning\"\n" +
            "    \t},\n" +
            "    \t\"SSL_WEBVIEW\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"SSL_Security\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Did not detect critical usage of \\\"WebViewClient\\\"(MITM Vulnerability).\",\n" +
            "        \t\"summary\": \"SSL Implementation Checking (WebViewClient for WebView)\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"HACKER_SIGNATURE_CHECK\": {\n" +
            "        \t\"count\": 6,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Signature\",\n" +
            "            \t\"Hacker\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app has code checking the package signature in the code. It might be used to check for whether the app is hacked by the attackers.\",\n" +
            "        \t\"level\": \"Notice\",\n" +
            "        \t\"summary\": \"Getting Signature Code Checking\",\n" +
            "        \t\"vector_details\": \"=> Lcom/chartboost/sdk/Libraries/CBUtility;->a(Landroid/content/Context;)Z (0x1e) ---> Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String; I)Landroid/content/pm/PackageInfo;\\n=> Lcom/google/android/gms/common/GooglePlayServicesUtil;->b(Landroid/content/pm/PackageManager;)Z (0x1c) ---> Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String; I)Landroid/content/pm/PackageInfo;\\n=> Lcom/google/android/gms/common/GooglePlayServicesUtil;->b(Landroid/content/pm/PackageManager; Ljava/lang/String;)Z (0x4) ---> Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String; I)Landroid/content/pm/PackageInfo;\\n=> Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I (0x42) ---> Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String; I)Landroid/content/pm/PackageInfo;\\n=> Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I (0xe4) ---> Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String; I)Landroid/content/pm/PackageInfo;\\n=> Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I (0x1a8) ---> Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String; I)Landroid/content/pm/PackageInfo;\"\n" +
            "    \t},\n" +
            "    \t\"DB_SQLCIPHER\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Database\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app is \\\"NOT\\\" using SQLCipher(http://sqlcipher.net/) to encrypt or decrpyt databases.\",\n" +
            "        \t\"summary\": \"Android SQLite Databases Encryption (SQLCipher)\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"HACKER_DEBUGGABLE_CHECK\": {\n" +
            "        \t\"count\": 1,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Debug\",\n" +
            "            \t\"Hacker\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Found codes for checking \\\"ApplicationInfo.FLAG_DEBUGGABLE\\\" in AndroidManifest.xml:\",\n" +
            "        \t\"level\": \"Notice\",\n" +
            "        \t\"summary\": \"Codes for Checking Android Debug Mode\",\n" +
            "        \t\"vector_details\": \"=> Lcom/chartboost/sdk/Libraries/CBUtility;->a (Landroid/content/Context;)Z\"\n" +
            "    \t},\n" +
            "    \t\"ALLOW_BACKUP\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"ADB Backup is ENABLED for this app (default: ENABLED). ADB Backup is a good tool for backing up all of your files. If it's open for this app, people who have your phone can copy all of the sensitive data for this app in your phone (Prerequisite: 1.Unlock phone's screen 2.Open the developer mode). The sensitive data may include lifetime access token, username or password, etc.\\nSecurity case related to ADB Backup:\\n1.http://www.securityfocus.com/archive/1/530288/30/0/threaded\\n2.http://blog.c22.cc/advisories/cve-2013-5112-evernote-android-insecure-storage-of-pin-data-bypass-of-pin-protection/\\n3.http://nelenkov.blogspot.co.uk/2012/06/unpacking-android-backups.html\\nReference: http://developer.android.com/guide/topics/manifest/application-element.html#allowbackup\",\n" +
            "        \t\"summary\": \"AndroidManifest Adb Backup Checking\",\n" +
            "        \t\"level\": \"Notice\"\n" +
            "    \t},\n" +
            "    \t\"COMMAND\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Command\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app is not using critical function 'Runtime.getRuntime().exec(\\\"...\\\")'.\",\n" +
            "        \t\"summary\": \"Runtime Command Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_PROVIDER_IMPLICIT_EXPORTED\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"No exported \\\"ContentProvider\\\" found (AndroidManifest.xml).\",\n" +
            "        \t\"summary\": \"AndroidManifest ContentProvider Exported Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"DB_SQLITE_JOURNAL\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Database\"\n" +
            "        \t],\n" +
            "        \t\"level\": \"Notice\",\n" +
            "        \t\"title\": \"This app is using Android SQLite databases. \\nPrior to Android 4.0, Android has SQLite Journal Information Disclosure Vulnerability. \\nBut it can only be solved by users upgrading to Android > 4.0 and YOU CANNOT SOLVE IT BY YOURSELF (But you can use encrypt your databases and Journals by \\\"SQLCipher\\\" or other libs). \\nProof-Of-Concept Reference: \\n(1) http://blog.watchfire.com/files/androidsqlitejournal.pdf \\n(2) http://www.youtube.com/watch?v=oCXLHjmH5rY \",\n" +
            "        \t\"summary\": \"Android SQLite Databases Vulnerability Checking\",\n" +
            "        \t\"cve_number\": \"CVE-2011-3901\"\n" +
            "    \t},\n" +
            "    \t\"HACKER_KEYSTORE_LOCATION1\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"KeyStore\",\n" +
            "            \t\"Hacker\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Did not find any possible BKS keystores or certificate keystore file (Notice: It does not mean this app does not use keysotre):\",\n" +
            "        \t\"summary\": \"KeyStore File Location\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"NATIVE_LIBS_LOADING\": {\n" +
            "        \t\"count\": 2,\n" +
            "        \t\"title\": \"Native library loading codes(System.loadLibrary(...)) found:\",\n" +
            "        \t\"summary\": \"Native Library Loading Checking\",\n" +
            "        \t\"vector_details\": \"[libmain.so]\\n=> Lcom/unity3d/player/UnityPlayer;-><clinit>()V (0x20) ---> Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V\",\n" +
            "        \t\"level\": \"Notice\"\n" +
            "    \t},\n" +
            "    \t\"DB_SEE\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Database\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app is \\\"NOT\\\" using SQLite Encryption Extension (SEE) on Android (http://www.sqlite.org/android) to encrypt or decrpyt databases.\",\n" +
            "        \t\"summary\": \"Android SQLite Databases Encryption (SQLite Encryption Extension (SEE))\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"KEYSTORE_TYPE_CHECK\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"KeyStore\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"KeyStore 'BKS' type check OK\",\n" +
            "        \t\"summary\": \"KeyStore Type Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"USE_PERMISSION_ACCESS_MOCK_LOCATION\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"Permission 'android.permission.ACCESS_MOCK_LOCATION' sets correctly.\",\n" +
            "        \t\"summary\": \"Unnecessary Permission Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"PERMISSION_EXPORTED\": {\n" +
            "        \t\"count\": 1,\n" +
            "        \t\"title\": \"Found \\\"exported\\\" components(except for Launcher) for receiving outside applications' actions (AndroidManifest.xml). \\nThese components can be initilized by other apps. You should add or modify the attribute to [exported=\\\"false\\\"] if you don't want to. \\nYou can also protect it with a customized permission with \\\"signature\\\" or higher protectionLevel and specify in \\\"android:permission\\\" attribute.\",\n" +
            "        \t\"summary\": \"AndroidManifest Exported Components Checking\",\n" +
            "        \t\"vector_details\": \"  receiver => com.amazon.inapp.purchasing.ResponseReceiver\",\n" +
            "        \t\"level\": \"Warning\"\n" +
            "    \t},\n" +
            "    \t\"SENSITIVE_SECURE_ANDROID_ID\": {\n" +
            "        \t\"count\": 8,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Sensitive_Information\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app has code getting the 64-bit number \\\"Settings.Secure.ANDROID_ID\\\". \\nANDROID_ID seems a good choice for a unique device identifier. There are downsides: First, it is not 100% reliable on releases of Android prior to 2.2 (Froyo). \\nAlso, there has been at least one widely-observed bug in a popular handset from a major manufacturer, where every instance has the same ANDROID_ID. \\nIf you want to get an unique id for the device, we suggest you use \\\"Installation\\\" framework in the following article. \\nPlease check the reference: http://android-developers.blogspot.tw/2011/03/identifying-app-installations.html \",\n" +
            "        \t\"level\": \"Warning\",\n" +
            "        \t\"summary\": \"Getting ANDROID_ID\",\n" +
            "        \t\"vector_details\": \"=> Lcom/chartboost/sdk/Libraries/c;->e()Ljava/lang/String; (0x14) ---> Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver; Ljava/lang/String;)Ljava/lang/String;\\n=> Lcom/flurry/sdk/ea;->b()Ljava/lang/String; (0x1c) ---> Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver; Ljava/lang/String;)Ljava/lang/String;\\n=> Lcom/google/android/gms/fitness/data/Device;->M(Landroid/content/Context;)Ljava/lang/String; (0xc) ---> Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver; Ljava/lang/String;)Ljava/lang/String;\\n=> Lcom/google/android/gms/internal/gq;->v(Landroid/content/Context;)Ljava/lang/String; (0xc) ---> Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver; Ljava/lang/String;)Ljava/lang/String;\\n=> Lcom/google/android/gms/tagmanager/bl;->Y(Landroid/content/Context;)Ljava/lang/String; (0xc) ---> Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver; Ljava/lang/String;)Ljava/lang/String;\\n=> Lcom/google/android/gms/tagmanager/z;->Y(Landroid/content/Context;)Ljava/lang/String; (0xc) ---> Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver; Ljava/lang/String;)Ljava/lang/String;\\n=> Lcom/inmobi/commons/uid/PlatformId;->getAndroidId(Landroid/content/Context;)Ljava/lang/String; (0xe) ---> Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver; Ljava/lang/String;)Ljava/lang/String;\\n=> Lcom/playhaven/android/DeviceId;-><init>(Landroid/content/Context;)V (0x12) ---> Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver; Ljava/lang/String;)Ljava/lang/String;\"\n" +
            "    \t},\n" +
            "    \t\"DEBUGGABLE\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Debug\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"DEBUG mode is OFF(android:debuggable=\\\"false\\\") in AndroidManifest.xml.\",\n" +
            "        \t\"summary\": \"Android Debug Mode Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"SENSITIVE_SMS\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"Did not detect this app has code for sending SMS messages (sendDataMessage, sendMultipartTextMessage or sendTextMessage).\",\n" +
            "        \t\"summary\": \"Codes for Sending SMS\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"MANIFEST_GCM\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"Nothing to suggest.\",\n" +
            "        \t\"summary\": \"Google Cloud Messaging Suggestion\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"HACKER_INSTALL_SOURCE_CHECK\": {\n" +
            "        \t\"count\": 2,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"Hacker\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"This app has code checking APK installer sources(e.g. from Google Play, from Amazon, etc.). It might be used to check for whether the app is hacked by the attackers.\",\n" +
            "        \t\"level\": \"Notice\",\n" +
            "        \t\"summary\": \"APK Installing Source Checking\",\n" +
            "        \t\"vector_details\": \"=> Lcom/google/android/gms/analytics/g;-><init>(Landroid/content/Context;)V (0x1e) ---> Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;\\n=> Lcom/playhaven/android/req/PurchaseTrackingRequest;->createUrl(Landroid/content/Context;)Lorg/springframework/web/util/UriComponentsBuilder; (0xba) ---> Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;\"\n" +
            "    \t},\n" +
            "    \t\"USE_PERMISSION_INTERNET\": {\n" +
            "        \t\"count\": 0,\n" +
            "        \t\"title\": \"This app is using the Internet via HTTP protocol.\",\n" +
            "        \t\"summary\": \"Accessing the Internet Checking\",\n" +
            "        \t\"level\": \"Info\"\n" +
            "    \t},\n" +
            "    \t\"SSL_X509\": {\n" +
            "        \t\"count\": 5,\n" +
            "        \t\"special_tag\": [\n" +
            "            \t\"SSL_Security\"\n" +
            "        \t],\n" +
            "        \t\"title\": \"Please make sure this app has the conditions to check the validation of SSL Certificate. If it's not properly checked, it MAY allows self-signed, expired or mismatch CN certificates for SSL connection.\\nThis is a critical vulnerability and allows attackers to do MITM attacks without your knowledge.\\nIf you are transmitting users' username or password, these sensitive information may be leaking.\\nReference:\\n(1)OWASP Mobile Top 10 doc: https://www.owasp.org/index.php/Mobile_Top_10_2014-M3\\n(2)Android Security book: http://goo.gl/BFb65r \\n(3)https://www.securecoding.cert.org/confluence/pages/viewpage.action?pageId=134807561\\nThis vulnerability is much more severe than Apple's \\\"goto fail\\\" vulnerability: http://goo.gl/eFlovw\\nPlease do not try to create a \\\"X509Certificate\\\" and override \\\"checkClientTrusted\\\", \\\"checkServerTrusted\\\", and \\\"getAcceptedIssuers\\\" functions with blank implementation.\\nWe strongly suggest you use the existing API instead of creating your own X509Certificate class. \\nPlease modify or remove these vulnerable code: \",\n" +
            "        \t\"level\": \"Warning\",\n" +
            "        \t\"summary\": \"SSL Certificate Verification Checking\",\n" +
            "        \t\"vector_details\": \"--------------------------------------------------\\n[Maybe Vulnerable (Please manually confirm)]\\n=> Lcom/flurry/sdk/ej;\\n  \t-> used by: Lcom/flurry/sdk/ei;->a()Ljavax/net/ssl/SSLContext;\\n  \t-> used by: Lcom/flurry/sdk/en;->m()Ljavax/net/ssl/SSLContext;\"\n" +
            "    \t}\n" +
            "\t},\n" +
            "\t\"time_analyze\": 11.301417,\n" +
            "\t\"targetSdk\": 21,\n" +
            "\t\"file_sha256\": \"d9f1cf624b4259a1ad0cfff278304fc6d2f64a7e65b5ab28fe5d8eccf086d6dc\",\n" +
            "\t\"package_version_code\": 12,\n" +
            "\t\"signature_unique_analyze\": \"c25f634ac9f0729c4b9d186d5f314e572c41d79f5391b85d958eb7a4f9a23ac37265583f2a301e77b0be22f5892f492daf3aff17cce773c318eb3e076f4d8f16\",\n" +
            "\t\"analyze_mode\": \"single\",\n" +
            "\t\"permission\": [\n" +
            "    \t\"android.permission.INTERNET\",\n" +
            "    \t\"android.permission.WRITE_EXTERNAL_STORAGE\",\n" +
            "    \t\"com.android.vending.BILLING\",\n" +
            "    \t\"android.permission.ACCESS_NETWORK_STATE\",\n" +
            "    \t\"android.permission.ACCESS_WIFI_STATE\"\n" +
            "\t],\n" +
            "\t\"file_md5\": \"b1bab48a5a55bcb3bdaed0aa42e1aec3\",\n" +
            "\t\"apk_file_size\": 16.212946891784668,\n" +
            "\t\"warning_vectors\": [\n" +
            "    \t\"WEBVIEW_JS_ENABLED\",\n" +
            "    \t\"DYNAMIC_CODE_LOADING\",\n" +
            "    \t\"EXTERNAL_STORAGE\",\n" +
            "    \t\"PERMISSION_EXPORTED\",\n" +
            "    \t\"SENSITIVE_DEVICE_ID\",\n" +
            "    \t\"SENSITIVE_SECURE_ANDROID_ID\",\n" +
            "    \t\"WEBVIEW_ALLOW_FILE_ACCESS\",\n" +
            "    \t\"SSL_X509\"\n" +
            "\t],\n" +
            "\t\"analyze_engine_build\": 1,\n" +
            "\t\"package_version_name\": \"1.4.3.3\",\n" +
            "\t\"minSdk\": 10,\n" +
            "\t\"info_vectors\": [\n" +
            "    \t\"MASTER_KEY\",\n" +
            "    \t\"DEBUGGABLE\",\n" +
            "    \t\"USE_PERMISSION_ACCESS_MOCK_LOCATION\",\n" +
            "    \t\"PERMISSION_GROUP_EMPTY_VALUE\",\n" +
            "    \t\"USE_PERMISSION_SYSTEM_APP\",\n" +
            "    \t\"MANIFEST_GCM\",\n" +
            "    \t\"USE_PERMISSION_INTERNET\",\n" +
            "    \t\"HACKER_BASE64_STRING_DECODE\",\n" +
            "    \t\"HACKER_KEYSTORE_NO_PWD\",\n" +
            "    \t\"HACKER_KEYSTORE_LOCATION1\",\n" +
            "    \t\"KEYSTORE_TYPE_CHECK\",\n" +
            "    \t\"HACKER_PREVENT_SCREENSHOT_CHECK\",\n" +
            "    \t\"COMMAND\",\n" +
            "    \t\"SSL_CN2\",\n" +
            "    \t\"SSL_CN3\",\n" +
            "    \t\"SSL_DEFAULT_SCHEME_NAME\",\n" +
            "    \t\"SSL_WEBVIEW\",\n" +
            "    \t\"HTTPURLCONNECTION_BUG\",\n" +
            "    \t\"DB_DEPRECATED_USE1\",\n" +
            "    \t\"MODE_WORLD_READABLE_OR_MODE_WORLD_WRITEABLE\",\n" +
            "    \t\"FRAMEWORK_MONODROID\",\n" +
            "    \t\"FRAGMENT_INJECTION\",\n" +
            "    \t\"PERMISSION_DANGEROUS\",\n" +
            "    \t\"PERMISSION_NORMAL\",\n" +
            "    \t\"PERMISSION_NO_PREFIX_EXPORTED\",\n" +
            "    \t\"PERMISSION_PROVIDER_IMPLICIT_EXPORTED\",\n" +
            "    \t\"PERMISSION_INTENT_FILTER_MISCONFIG\",\n" +
            "    \t\"PERMISSION_IMPLICIT_SERVICE\",\n" +
            "    \t\"DB_SQLCIPHER\",\n" +
            "    \t\"DB_SEE\",\n" +
            "    \t\"HACKER_DB_KEY\",\n" +
            "    \t\"COMMAND_MAYBE_SYSTEM\",\n" +
            "    \t\"SENSITIVE_SMS\",\n" +
            "    \t\"SHARED_USER_ID\"\n" +
            "\t],\n" +
            "\t\"file_sha1\": \"9b5f0ae004f48ed342edd97d34932c1c2306c446\",\n" +
            "\t\"file_sha512\": \"39617e7a46acace9de2612cd198cadf358091161a3790ff0bb5ec3da537e3d137d86b01e48891397411502d07481ddcde6d1725d7a91caec0d3da141eda75aa3\",\n" +
            "\t\"_id\": {\n" +
            "    \t\"$oid\": \"571d60e4ecd2a30fb8517ee4\"\n" +
            "\t},\n" +
            "\t\"time_total\": 43.87879,\n" +
            "\t\"analyze_status\": \"success\"\n" +
            "}\n" +
            "";
}
