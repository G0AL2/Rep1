package ib;

import java.nio.charset.Charset;

/* compiled from: Charsets.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f31903a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f31904b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f31905c = Charset.forName("UTF-8");

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f31906d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f31907e;

    static {
        Charset.forName("UTF-16BE");
        f31906d = Charset.forName("UTF-16LE");
        f31907e = Charset.forName("UTF-16");
    }
}
