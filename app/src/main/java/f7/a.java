package f7;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;

/* compiled from: ImageSource.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Uri f30096a;

    /* renamed from: b  reason: collision with root package name */
    private String f30097b;

    /* renamed from: c  reason: collision with root package name */
    private double f30098c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30099d;

    public a(Context context, String str, double d10, double d11) {
        this.f30097b = str;
        this.f30098c = d10 * d11;
        this.f30096a = b(context);
    }

    private Uri a(Context context) {
        this.f30099d = true;
        return c.b().e(context, this.f30097b);
    }

    private Uri b(Context context) {
        try {
            Uri parse = Uri.parse(this.f30097b);
            return parse.getScheme() == null ? a(context) : parse;
        } catch (Exception unused) {
            return a(context);
        }
    }

    public double c() {
        return this.f30098c;
    }

    public String d() {
        return this.f30097b;
    }

    public Uri e() {
        return (Uri) f6.a.c(this.f30096a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(aVar.f30098c, this.f30098c) == 0 && this.f30099d == aVar.f30099d && Objects.equals(this.f30096a, aVar.f30096a) && Objects.equals(this.f30097b, aVar.f30097b);
    }

    public boolean f() {
        return this.f30099d;
    }

    public int hashCode() {
        return Objects.hash(this.f30096a, this.f30097b, Double.valueOf(this.f30098c), Boolean.valueOf(this.f30099d));
    }

    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }
}
