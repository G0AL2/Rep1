package com.apm.insight.k;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f6455a;

    /* renamed from: b  reason: collision with root package name */
    private HttpURLConnection f6456b;

    /* renamed from: c  reason: collision with root package name */
    private String f6457c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6458d;

    /* renamed from: e  reason: collision with root package name */
    private f f6459e;

    /* renamed from: f  reason: collision with root package name */
    private m f6460f;

    public j(String str, String str2, boolean z10) {
        this.f6457c = str2;
        this.f6458d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f6455a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f6456b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f6456b.setDoOutput(true);
        this.f6456b.setDoInput(true);
        this.f6456b.setRequestMethod("POST");
        this.f6456b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z10) {
            this.f6459e = new f(this.f6456b.getOutputStream());
            return;
        }
        this.f6456b.setRequestProperty("Content-Encoding", "gzip");
        this.f6460f = new m(this.f6456b.getOutputStream());
    }

    public String a() {
        ArrayList<String> arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f6455a + "--\r\n").getBytes();
        if (this.f6458d) {
            this.f6460f.write(bytes);
            this.f6460f.b();
            this.f6460f.a();
        } else {
            this.f6459e.write(bytes);
            this.f6459e.flush();
            this.f6459e.a();
        }
        int responseCode = this.f6456b.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Server returned non-OK status: " + responseCode);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f6456b.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            arrayList.add(readLine);
        }
        bufferedReader.close();
        this.f6456b.disconnect();
        StringBuilder sb2 = new StringBuilder();
        for (String str : arrayList) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public void a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f6455a);
        sb2.append("\r\n");
        sb2.append("Content-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\n");
        sb2.append("Content-Transfer-Encoding: binary");
        sb2.append("\r\n");
        sb2.append("\r\n");
        if (this.f6458d) {
            this.f6460f.write(sb2.toString().getBytes());
        } else {
            this.f6459e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[Constants.BUFFER_SIZE];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f6458d) {
                this.f6460f.write(bArr, 0, read);
            } else {
                this.f6459e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f6458d) {
            this.f6460f.write("\r\n".getBytes());
            return;
        }
        this.f6459e.write("\r\n".getBytes());
        this.f6459e.flush();
    }

    public void a(String str, String str2) {
        a(str, str2, false);
    }

    public void a(String str, String str2, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f6455a);
        sb2.append("\r\n");
        sb2.append("Content-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"");
        sb2.append("\r\n");
        sb2.append("Content-Type: text/plain; charset=");
        sb2.append(this.f6457c);
        sb2.append("\r\n");
        sb2.append("\r\n");
        try {
            if (this.f6458d) {
                this.f6460f.write(sb2.toString().getBytes());
            } else {
                this.f6459e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z10) {
            bytes = com.apm.insight.h.i().getEncryptImpl().a(bytes);
        }
        try {
            if (this.f6458d) {
                this.f6460f.write(bytes);
                this.f6460f.write("\r\n".getBytes());
                return;
            }
            this.f6459e.write(bytes);
            this.f6459e.write("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    public void a(String str, File... fileArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f6455a);
        sb2.append("\r\n");
        sb2.append("Content-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(str);
        sb2.append("\"");
        sb2.append("\r\n");
        sb2.append("Content-Transfer-Encoding: binary");
        sb2.append("\r\n");
        sb2.append("\r\n");
        if (this.f6458d) {
            this.f6460f.write(sb2.toString().getBytes());
        } else {
            this.f6459e.write(sb2.toString().getBytes());
        }
        com.apm.insight.l.i.a(this.f6458d ? this.f6460f : this.f6459e, fileArr);
        if (this.f6458d) {
            this.f6460f.write("\r\n".getBytes());
            return;
        }
        this.f6459e.write("\r\n".getBytes());
        this.f6459e.flush();
    }
}
