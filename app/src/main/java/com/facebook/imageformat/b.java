package com.facebook.imageformat;

/* compiled from: DefaultImageFormats.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14800a = new c("JPEG", "jpeg");

    /* renamed from: b  reason: collision with root package name */
    public static final c f14801b = new c("PNG", "png");

    /* renamed from: c  reason: collision with root package name */
    public static final c f14802c = new c("GIF", "gif");

    /* renamed from: d  reason: collision with root package name */
    public static final c f14803d = new c("BMP", "bmp");

    /* renamed from: e  reason: collision with root package name */
    public static final c f14804e = new c("ICO", "ico");

    /* renamed from: f  reason: collision with root package name */
    public static final c f14805f = new c("WEBP_SIMPLE", "webp");

    /* renamed from: g  reason: collision with root package name */
    public static final c f14806g = new c("WEBP_LOSSLESS", "webp");

    /* renamed from: h  reason: collision with root package name */
    public static final c f14807h = new c("WEBP_EXTENDED", "webp");

    /* renamed from: i  reason: collision with root package name */
    public static final c f14808i = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j  reason: collision with root package name */
    public static final c f14809j = new c("WEBP_ANIMATED", "webp");

    /* renamed from: k  reason: collision with root package name */
    public static final c f14810k = new c("HEIF", "heif");

    /* renamed from: l  reason: collision with root package name */
    public static final c f14811l = new c("DNG", "dng");

    public static boolean a(c cVar) {
        return cVar == f14805f || cVar == f14806g || cVar == f14807h || cVar == f14808i;
    }

    public static boolean b(c cVar) {
        return a(cVar) || cVar == f14809j;
    }
}
