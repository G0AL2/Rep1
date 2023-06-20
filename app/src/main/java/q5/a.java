package q5;

import com.google.android.gms.common.api.Api;
import java.util.regex.Pattern;
import y3.k;

/* compiled from: BytesRange.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static Pattern f35913c;

    /* renamed from: a  reason: collision with root package name */
    public final int f35914a;

    /* renamed from: b  reason: collision with root package name */
    public final int f35915b;

    public a(int i10, int i11) {
        this.f35914a = i10;
        this.f35915b = i11;
    }

    public static a b(int i10) {
        k.b(Boolean.valueOf(i10 >= 0));
        return new a(i10, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static a c(String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        if (f35913c == null) {
            f35913c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f35913c.split(str);
            k.b(Boolean.valueOf(split.length == 4));
            k.b(Boolean.valueOf(split[0].equals("bytes")));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            k.b(Boolean.valueOf(parseInt2 > parseInt));
            k.b(Boolean.valueOf(parseInt3 > parseInt2));
            if (parseInt2 < parseInt3 - 1) {
                return new a(parseInt, parseInt2);
            }
            return new a(parseInt, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e10);
        }
    }

    public static a e(int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        return new a(0, i10);
    }

    private static String f(int i10) {
        return i10 == Integer.MAX_VALUE ? "" : Integer.toString(i10);
    }

    public boolean a(a aVar) {
        return aVar != null && this.f35914a <= aVar.f35914a && this.f35915b >= aVar.f35915b;
    }

    public String d() {
        return String.format(null, "bytes=%s-%s", f(this.f35914a), f(this.f35915b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f35914a == aVar.f35914a && this.f35915b == aVar.f35915b;
        }
        return false;
    }

    public int hashCode() {
        return g4.b.a(this.f35914a, this.f35915b);
    }

    public String toString() {
        return String.format(null, "%s-%s", f(this.f35914a), f(this.f35915b));
    }
}
