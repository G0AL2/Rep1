package f0;

import android.util.Base64;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f29902a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29903b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29904c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f29905d;

    /* renamed from: e  reason: collision with root package name */
    private final int f29906e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f29907f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f29902a = (String) h0.g.f(str);
        this.f29903b = (String) h0.g.f(str2);
        this.f29904c = (String) h0.g.f(str3);
        this.f29905d = (List) h0.g.f(list);
        this.f29907f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + Constants.FILENAME_SEQUENCE_SEPARATOR + str2 + Constants.FILENAME_SEQUENCE_SEPARATOR + str3;
    }

    public List<List<byte[]>> b() {
        return this.f29905d;
    }

    public int c() {
        return this.f29906e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f29907f;
    }

    public String e() {
        return this.f29902a;
    }

    public String f() {
        return this.f29903b;
    }

    public String g() {
        return this.f29904c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f29902a + ", mProviderPackage: " + this.f29903b + ", mQuery: " + this.f29904c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f29905d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f29905d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f29906e);
        return sb2.toString();
    }
}
