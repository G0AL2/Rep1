package y9;

import android.text.Layout;
import ea.n0;
import ea.o0;
import ea.r;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: TtmlDecoder.java */
/* loaded from: classes2.dex */
public final class c extends r9.e {

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f39297o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f39298p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f39299q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r  reason: collision with root package name */
    static final Pattern f39300r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: s  reason: collision with root package name */
    static final Pattern f39301s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f39302t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f39303u = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: v  reason: collision with root package name */
    private static final b f39304v = new b(30.0f, 1, 1);

    /* renamed from: w  reason: collision with root package name */
    private static final a f39305w = new a(32, 15);

    /* renamed from: n  reason: collision with root package name */
    private final XmlPullParserFactory f39306n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f39307a;

        a(int i10, int i11) {
            this.f39307a = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final float f39308a;

        /* renamed from: b  reason: collision with root package name */
        final int f39309b;

        /* renamed from: c  reason: collision with root package name */
        final int f39310c;

        b(float f10, int i10, int i11) {
            this.f39308a = f10;
            this.f39309b = i10;
            this.f39310c = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TtmlDecoder.java */
    /* renamed from: y9.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0545c {

        /* renamed from: a  reason: collision with root package name */
        final int f39311a;

        /* renamed from: b  reason: collision with root package name */
        final int f39312b;

        C0545c(int i10, int i11) {
            this.f39311a = i10;
            this.f39312b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f39306n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g B(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment D(String str) {
        String e10 = ib.b.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case -1364013995:
                if (e10.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (e10.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (e10.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (e10.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (e10.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static a E(XmlPullParser xmlPullParser, a aVar) throws r9.h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f39303u.matcher(attributeValue);
        if (!matcher.matches()) {
            r.h("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) ea.a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) ea.a.e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new r9.h(sb2.toString());
        } catch (NumberFormatException unused) {
            r.h("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    private static void F(String str, g gVar) throws r9.h {
        Matcher matcher;
        String[] R0 = n0.R0(str, "\\s+");
        if (R0.length == 1) {
            matcher = f39299q.matcher(str);
        } else if (R0.length == 2) {
            matcher = f39299q.matcher(R0[1]);
            r.h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length = R0.length;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Invalid number of entries for fontSize: ");
            sb2.append(length);
            sb2.append(".");
            throw new r9.h(sb2.toString());
        }
        if (matcher.matches()) {
            String str2 = (String) ea.a.e(matcher.group(3));
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.z(3);
                    break;
                case 1:
                    gVar.z(2);
                    break;
                case 2:
                    gVar.z(1);
                    break;
                default:
                    StringBuilder sb3 = new StringBuilder(str2.length() + 30);
                    sb3.append("Invalid unit for fontSize: '");
                    sb3.append(str2);
                    sb3.append("'.");
                    throw new r9.h(sb3.toString());
            }
            gVar.y(Float.parseFloat((String) ea.a.e(matcher.group(1))));
            return;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 36);
        sb4.append("Invalid expression for fontSize: '");
        sb4.append(str);
        sb4.append("'.");
        throw new r9.h(sb4.toString());
    }

    private static b G(XmlPullParser xmlPullParser) throws r9.h {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] R0 = n0.R0(attributeValue2, " ");
            if (R0.length == 2) {
                f10 = Integer.parseInt(R0[0]) / Integer.parseInt(R0[1]);
            } else {
                throw new r9.h("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = f39304v;
        int i10 = bVar.f39309b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f39310c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    private static Map<String, g> H(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0545c c0545c, Map<String, e> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "style")) {
                String a10 = o0.a(xmlPullParser, "style");
                g M = M(xmlPullParser, new g());
                if (a10 != null) {
                    for (String str : N(a10)) {
                        M.a(map.get(str));
                    }
                }
                String g10 = M.g();
                if (g10 != null) {
                    map.put(g10, M);
                }
            } else if (o0.f(xmlPullParser, "region")) {
                e K = K(xmlPullParser, aVar, c0545c);
                if (K != null) {
                    map2.put(K.f39326a, K);
                }
            } else if (o0.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!o0.d(xmlPullParser, "head"));
        return map;
    }

    private static void I(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String a10;
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "image") && (a10 = o0.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!o0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static d J(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) throws r9.h {
        long j10;
        long j11;
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        g M = M(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        String[] strArr = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if (map.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j14 = O(attributeValue, bVar);
                    break;
                case 2:
                    j13 = O(attributeValue, bVar);
                    break;
                case 3:
                    j12 = O(attributeValue, bVar);
                    break;
                case 4:
                    String[] N = N(attributeValue);
                    if (N.length > 0) {
                        strArr = N;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j15 = dVar.f39316d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j16 = j12;
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j16 + j14;
            } else if (dVar != null) {
                long j17 = dVar.f39317e;
                if (j17 != j10) {
                    j11 = j17;
                }
            }
            return d.c(xmlPullParser.getName(), j16, j11, M, strArr, str2, str, dVar);
        }
        j11 = j13;
        return d.c(xmlPullParser.getName(), j16, j11, M, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ad, code lost:
        if (r0.equals("tb") == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static y9.e K(org.xmlpull.v1.XmlPullParser r17, y9.c.a r18, y9.c.C0545c r19) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.K(org.xmlpull.v1.XmlPullParser, y9.c$a, y9.c$c):y9.e");
    }

    private static float L(String str) {
        Matcher matcher = f39300r.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            r.h("TtmlDecoder", valueOf.length() != 0 ? "Invalid value for shear: ".concat(valueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) ea.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            String valueOf2 = String.valueOf(str);
            r.i("TtmlDecoder", valueOf2.length() != 0 ? "Failed to parse shear: ".concat(valueOf2) : new String("Failed to parse shear: "), e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f2, code lost:
        if (r3.equals("text") == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static y9.g M(org.xmlpull.v1.XmlPullParser r12, y9.g r13) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.M(org.xmlpull.v1.XmlPullParser, y9.g):y9.g");
    }

    private static String[] N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : n0.R0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long O(java.lang.String r13, y9.c.b r14) throws r9.h {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.c.O(java.lang.String, y9.c$b):long");
    }

    private static C0545c P(XmlPullParser xmlPullParser) {
        String a10 = o0.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f39302t.matcher(a10);
        if (!matcher.matches()) {
            r.h("TtmlDecoder", a10.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(a10) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new C0545c(Integer.parseInt((String) ea.a.e(matcher.group(1))), Integer.parseInt((String) ea.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            r.h("TtmlDecoder", a10.length() != 0 ? "Ignoring malformed tts extent: ".concat(a10) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // r9.e
    protected r9.f z(byte[] bArr, int i10, boolean z10) throws r9.h {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f39306n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            C0545c c0545c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f39304v;
            a aVar = f39305w;
            h hVar = null;
            int i11 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = G(newPullParser);
                            aVar = E(newPullParser, f39305w);
                            c0545c = P(newPullParser);
                        }
                        C0545c c0545c2 = c0545c;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!C(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            r.f("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i11++;
                            bVar2 = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                H(newPullParser, hashMap, aVar2, c0545c2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    d J = J(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(J);
                                    if (dVar != null) {
                                        dVar.a(J);
                                    }
                                } catch (r9.h e10) {
                                    r.i("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        c0545c = c0545c2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((d) ea.a.e(dVar)).a(d.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((d) ea.a.e((d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new r9.h("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new r9.h("Unable to decode source", e12);
        }
    }
}
