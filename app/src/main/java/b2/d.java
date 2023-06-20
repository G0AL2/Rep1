package b2;

import d2.p;
import java.util.List;

/* compiled from: FontCharacter.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<p> f4793a;

    /* renamed from: b  reason: collision with root package name */
    private final char f4794b;

    /* renamed from: c  reason: collision with root package name */
    private final double f4795c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4796d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4797e;

    public d(List<p> list, char c10, double d10, double d11, String str, String str2) {
        this.f4793a = list;
        this.f4794b = c10;
        this.f4795c = d11;
        this.f4796d = str;
        this.f4797e = str2;
    }

    public static int c(char c10, String str, String str2) {
        return ((((0 + c10) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<p> a() {
        return this.f4793a;
    }

    public double b() {
        return this.f4795c;
    }

    public int hashCode() {
        return c(this.f4794b, this.f4797e, this.f4796d);
    }
}
