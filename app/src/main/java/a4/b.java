package a4;

import android.webkit.MimeTypeMap;
import java.util.Map;
import y3.g;

/* compiled from: MimeTypeMapWrapper.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final MimeTypeMap f66a = MimeTypeMap.getSingleton();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f67b = g.of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f68c = g.of("heif", "image/heif", "heic", "image/heic");

    public static String a(String str) {
        String str2 = f68c.get(str);
        return str2 != null ? str2 : f66a.getMimeTypeFromExtension(str);
    }
}
