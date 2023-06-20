package com.amazon.device.ads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes.dex */
class DtbHttpClient {
    private String message;
    private int responseCode;
    private String url;
    private boolean secure = true;
    private boolean isQueryParamsEnabled = false;
    private String response = null;
    private HashMap<String, Object> params = new HashMap<>();
    private HashMap<String, Object> headers = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum HTTPMethod {
        POST,
        GET
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DtbHttpClient(String str) {
        this.url = str;
    }

    private static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine + "\n");
                    }
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } catch (IOException e10) {
                DtbLog.debug("Error converting stream to string. Ex=" + e10);
            }
            try {
                break;
            } catch (IOException unused2) {
                return sb2.toString();
            }
        }
        inputStream.close();
    }

    private HttpURLConnection createDefaultConnection(URL url, int i10) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setReadTimeout(i10);
        return httpURLConnection;
    }

    private void executeRequest(HTTPMethod hTTPMethod, URL url, int i10) throws JSONException, IOException {
        InputStream inputStream;
        HttpURLConnection createDefaultConnection = createDefaultConnection(url, i10);
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.headers.keySet()) {
            String obj = this.headers.get(str) != null ? this.headers.get(str).toString() : "";
            createDefaultConnection.setRequestProperty(str, obj);
            sb2.append(str + ":" + obj + " ");
        }
        DtbLog.debug("with headers:[" + sb2.toString() + "]");
        if (hTTPMethod == HTTPMethod.POST) {
            createDefaultConnection.setDoOutput(true);
            if (!this.isQueryParamsEnabled && !this.params.isEmpty()) {
                createDefaultConnection.setRequestProperty("content-type", "application/json; charset=utf-8");
                String paramsAsJsonString = getParamsAsJsonString();
                DtbLog.debug("with json params:[" + paramsAsJsonString + "]");
                OutputStream outputStream = createDefaultConnection.getOutputStream();
                outputStream.write(paramsAsJsonString.getBytes());
                outputStream.flush();
                outputStream.close();
            }
        }
        try {
            try {
                inputStream = createDefaultConnection.getInputStream();
            } catch (Exception e10) {
                this.response = null;
                DtbLog.debug("Error while connecting to remote server: " + createDefaultConnection.getURL().toString() + " with error:" + e10.getMessage());
            }
            if (inputStream == null) {
                return;
            }
            this.responseCode = createDefaultConnection.getResponseCode();
            this.message = createDefaultConnection.getResponseMessage();
            this.response = convertStreamToString(inputStream);
            inputStream.close();
            DtbLog.debug("Response :" + this.response);
        } finally {
            createDefaultConnection.disconnect();
        }
    }

    private String getParamsAsJsonString() throws JSONException {
        return DtbCommonUtils.getParamsAsJsonString(this.params);
    }

    private String getQueryParams() {
        if (this.params.isEmpty()) {
            return "";
        }
        String str = "?";
        for (String str2 : this.params.keySet()) {
            if (this.params.get(str2) != null) {
                String str3 = str2 + "=" + DtbCommonUtils.getURLEncodedString(this.params.get(str2).toString());
                str = str.length() > 1 ? str + "&" + str3 : str + str3;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    protected void addParam(String str, String str2) {
        this.params.put(str, str2);
    }

    public void enableQueryParams() {
        this.isQueryParamsEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void executeGET(int i10) throws JSONException, IOException {
        String queryParams = getQueryParams();
        String str = this.url;
        if (!str.startsWith("https://") && !this.url.startsWith("http://")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.secure ? "https://" : "http://");
            sb2.append(this.url);
            str = sb2.toString();
        }
        DtbLog.debug("GET URL:" + str);
        DtbLog.debug("with params: " + queryParams);
        executeRequest(HTTPMethod.GET, new URL(str + queryParams), i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void executePOST(int i10) throws JSONException, IOException {
        URL url;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.secure ? "https://" : "http://");
        sb2.append(this.url);
        String sb3 = sb2.toString();
        DtbLog.debug("POST URL:" + sb3);
        if (this.isQueryParamsEnabled) {
            String queryParams = getQueryParams();
            DtbLog.debug("with query params:[" + queryParams + "]");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(queryParams);
            url = new URL(sb4.toString());
        } else {
            url = new URL(sb3);
        }
        executeRequest(HTTPMethod.POST, url, i10);
    }

    protected String getErrorMessage() {
        return this.message;
    }

    protected HashMap<String, Object> getHeaders() {
        return this.headers;
    }

    protected HashMap<String, Object> getParams() {
        return this.params;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getResponse() {
        return this.response;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getResponseCode() {
        return this.responseCode;
    }

    protected String getUrl() {
        return this.url;
    }

    public boolean isHttpStatusCodeOK() {
        return this.responseCode == 200;
    }

    protected void setHeaders(HashMap<String, Object> hashMap) {
        this.headers = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setParams(HashMap<String, Object> hashMap) {
        this.params = hashMap;
    }

    protected void setUrl(String str) {
        this.url = str;
    }

    public void setUseSecure(boolean z10) {
        this.secure = z10;
    }
}
