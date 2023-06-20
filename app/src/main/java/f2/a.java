package f2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f30082a;

    public a(HttpURLConnection httpURLConnection) {
        this.f30082a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // f2.d
    public String G0() {
        try {
            if (c0()) {
                return null;
            }
            return "Unable to fetch " + this.f30082a.getURL() + ". Failed with " + this.f30082a.getResponseCode() + "\n" + a(this.f30082a);
        } catch (IOException e10) {
            i2.d.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // f2.d
    public String K() {
        return this.f30082a.getContentType();
    }

    @Override // f2.d
    public InputStream R() throws IOException {
        return this.f30082a.getInputStream();
    }

    @Override // f2.d
    public boolean c0() {
        try {
            return this.f30082a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30082a.disconnect();
    }
}
