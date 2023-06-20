package t8;

import ea.o0;
import ea.r;
import j8.j2;
import java.io.IOException;
import java.io.StringReader;
import jb.s;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import t8.b;

/* compiled from: XmpMotionPhotoDescriptionParser.java */
/* loaded from: classes2.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f37183a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f37184b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f37185c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) throws IOException {
        try {
            return b(str);
        } catch (j2 | NumberFormatException | XmlPullParserException unused) {
            r.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (o0.f(newPullParser, "x:xmpmeta")) {
            long j10 = -9223372036854775807L;
            s<b.a> t10 = s.t();
            do {
                newPullParser.next();
                if (o0.f(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j10 = e(newPullParser);
                    t10 = c(newPullParser);
                } else if (o0.f(newPullParser, "Container:Directory")) {
                    t10 = f(newPullParser, "Container", "Item");
                } else if (o0.f(newPullParser, "GContainer:Directory")) {
                    t10 = f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!o0.d(newPullParser, "x:xmpmeta"));
            if (t10.isEmpty()) {
                return null;
            }
            return new b(j10, t10);
        }
        throw j2.a("Couldn't find xmp metadata", null);
    }

    private static s<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f37185c) {
            String a10 = o0.a(xmlPullParser, str);
            if (a10 != null) {
                return s.v(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(a10), 0L));
            }
        }
        return s.t();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f37183a) {
            String a10 = o0.a(xmlPullParser, str);
            if (a10 != null) {
                return Integer.parseInt(a10) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f37184b) {
            String a10 = o0.a(xmlPullParser, str);
            if (a10 != null) {
                long parseLong = Long.parseLong(a10);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static s<b.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        s.a n10 = s.n();
        String concat = String.valueOf(str).concat(":Item");
        String concat2 = String.valueOf(str).concat(":Directory");
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, concat)) {
                String concat3 = String.valueOf(str2).concat(":Mime");
                String concat4 = String.valueOf(str2).concat(":Semantic");
                String concat5 = String.valueOf(str2).concat(":Length");
                String concat6 = String.valueOf(str2).concat(":Padding");
                String a10 = o0.a(xmlPullParser, concat3);
                String a11 = o0.a(xmlPullParser, concat4);
                String a12 = o0.a(xmlPullParser, concat5);
                String a13 = o0.a(xmlPullParser, concat6);
                if (a10 != null && a11 != null) {
                    n10.a(new b.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0L, a13 != null ? Long.parseLong(a13) : 0L));
                } else {
                    return s.t();
                }
            }
        } while (!o0.d(xmlPullParser, concat2));
        return n10.h();
    }
}
