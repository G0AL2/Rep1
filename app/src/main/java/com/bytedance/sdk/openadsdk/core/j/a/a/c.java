package com.bytedance.sdk.openadsdk.core.j.a.a;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.j.a.a.d;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.core.j.c.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: LinearParser.java */
/* loaded from: classes.dex */
public class c {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2.equals("Icons") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(org.xmlpull.v1.XmlPullParser r8, com.bytedance.sdk.openadsdk.core.j.a r9, int r10, double r11) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.next()
            r3 = 3
            if (r2 != r3) goto L17
            java.lang.String r2 = r8.getName()
            java.lang.String r4 = "Linear"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L16
            goto L17
        L16:
            return
        L17:
            int r2 = r8.getEventType()
            r4 = 2
            if (r2 == r4) goto L1f
            goto L2
        L1f:
            if (r1 == 0) goto L2e
            java.lang.String r2 = r9.g()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2e
            com.bytedance.sdk.openadsdk.core.j.a.a.d.a(r8)
        L2e:
            java.lang.String r2 = r8.getName()
            r2.hashCode()
            r5 = -1
            int r6 = r2.hashCode()
            r7 = 1
            switch(r6) {
                case -2049897434: goto L6a;
                case -1927368268: goto L5f;
                case -385055469: goto L54;
                case 70476538: goto L4b;
                case 611554000: goto L40;
                default: goto L3e;
            }
        L3e:
            r3 = -1
            goto L74
        L40:
            java.lang.String r3 = "TrackingEvents"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L49
            goto L3e
        L49:
            r3 = 4
            goto L74
        L4b:
            java.lang.String r4 = "Icons"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L74
            goto L3e
        L54:
            java.lang.String r3 = "MediaFiles"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5d
            goto L3e
        L5d:
            r3 = 2
            goto L74
        L5f:
            java.lang.String r3 = "Duration"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L68
            goto L3e
        L68:
            r3 = 1
            goto L74
        L6a:
            java.lang.String r3 = "VideoClicks"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L73
            goto L3e
        L73:
            r3 = 0
        L74:
            switch(r3) {
                case 0: goto Lae;
                case 1: goto La5;
                case 2: goto L95;
                case 3: goto L84;
                case 4: goto L7b;
                default: goto L77;
            }
        L77:
            com.bytedance.sdk.openadsdk.core.j.a.a.d.a(r8)
            goto L2
        L7b:
            com.bytedance.sdk.openadsdk.core.j.d r2 = r9.a()
            a(r8, r2)
            goto L2
        L84:
            com.bytedance.sdk.openadsdk.core.j.b r2 = a(r8)
            if (r2 == 0) goto L2
            com.bytedance.sdk.openadsdk.core.j.b r3 = r9.b()
            if (r3 != 0) goto L2
            r9.a(r2)
            goto L2
        L95:
            java.lang.String r1 = a(r8, r10, r11)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto La2
            r9.d(r1)
        La2:
            r1 = 1
            goto L2
        La5:
            double r2 = b(r8)
            r9.a(r2)
            goto L2
        Lae:
            a(r8, r9)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.j.a.a.c.a(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.j.a, int, double):void");
    }

    public static double b(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String[] split = d.b(xmlPullParser, "Duration").split(":");
        if (split.length == 3) {
            try {
                return (Integer.parseInt(split[0].trim()) * 60 * 60) + (Integer.parseInt(split[1].trim()) * 60) + Float.parseFloat(split[2].trim());
            } catch (Exception unused) {
                return 0.0d;
            }
        }
        return 0.0d;
    }

    private static List<com.bytedance.sdk.openadsdk.core.j.b.c> c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return d.a(xmlPullParser, "Tracking");
    }

    private static String a(XmlPullParser xmlPullParser, int i10, double d10) throws IOException, XmlPullParserException {
        double d11 = Double.NEGATIVE_INFINITY;
        String str = null;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                return str;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = d.f12405f;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int b10 = d.b(xmlPullParser.getAttributeValue(str2, "width"));
                int b11 = d.b(xmlPullParser.getAttributeValue(str2, "height"));
                int b12 = d.b(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String b13 = d.b(xmlPullParser, "MediaFile");
                if (b10 > 0 && b11 > 0 && com.bytedance.sdk.openadsdk.core.j.c.d.f12467a.contains(attributeValue) && !TextUtils.isEmpty(b13)) {
                    double a10 = com.bytedance.sdk.openadsdk.core.j.c.d.a(i10, d10, b10, b11, b12, attributeValue);
                    if (a10 > d11) {
                        str = b13;
                        d11 = a10;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.sdk.openadsdk.core.j.b a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        char c10;
        ArrayList arrayList;
        ArrayList arrayList2;
        a.EnumC0172a enumC0172a;
        ArrayList arrayList3;
        com.bytedance.sdk.openadsdk.core.j.b bVar = null;
        while (true) {
            int i10 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return bVar;
            }
            xmlPullParser.next();
            int i11 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = d.f12405f;
                int b10 = d.b(xmlPullParser.getAttributeValue(str, "width"));
                int b11 = d.b(xmlPullParser.getAttributeValue(str, "height"));
                if (b10 > 0 && b10 <= 300 && b11 > 0 && b11 <= 300) {
                    int a10 = com.bytedance.sdk.openadsdk.core.j.b.a.a(xmlPullParser.getAttributeValue(str, "offset"));
                    int a11 = com.bytedance.sdk.openadsdk.core.j.b.a.a(xmlPullParser.getAttributeValue(str, "duration"));
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    d.a aVar = null;
                    String str2 = null;
                    while (true) {
                        if (xmlPullParser.next() == i10 && xmlPullParser.getName().equals("Icon")) {
                            if (aVar != null && !TextUtils.isEmpty(aVar.f12406a)) {
                                bVar = new com.bytedance.sdk.openadsdk.core.j.b(b10, b11, a10, a11, aVar.f12407b, aVar.f12408c, aVar.f12406a, arrayList4, arrayList5, str2);
                                d.a(xmlPullParser, "Icons", i10);
                            }
                        } else {
                            ArrayList arrayList6 = arrayList4;
                            ArrayList arrayList7 = arrayList5;
                            if (xmlPullParser.getEventType() != i11) {
                                arrayList4 = arrayList6;
                                arrayList5 = arrayList7;
                            } else {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals("IconViewTracking")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1030746596:
                                        if (name.equals("IconClicks")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c10 = 4;
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
                                        arrayList = arrayList6;
                                        arrayList2 = arrayList7;
                                        arrayList2.add(new c.a(d.b(xmlPullParser, "IconViewTracking")).a());
                                        break;
                                    case 1:
                                        arrayList = arrayList6;
                                        if (aVar != null) {
                                            d.a(xmlPullParser);
                                        } else {
                                            aVar = new d.a(d.b(xmlPullParser, "IFrameResource"), a.EnumC0172a.NONE, a.b.IFRAME_RESOURCE);
                                        }
                                        arrayList2 = arrayList7;
                                        break;
                                    case 2:
                                        arrayList = arrayList6;
                                        a.EnumC0172a enumC0172a2 = a.EnumC0172a.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(d.f12405f, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.j.c.a.f12450a;
                                        String b12 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.j.c.a.f12451b.contains(lowerCase)) ? d.b(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0172a = a.EnumC0172a.IMAGE;
                                        } else {
                                            enumC0172a = a.EnumC0172a.JAVASCRIPT;
                                        }
                                        if (!TextUtils.isEmpty(b12)) {
                                            aVar = new d.a(b12, enumC0172a, a.b.STATIC_RESOURCE);
                                        }
                                        arrayList2 = arrayList7;
                                        break;
                                    case 3:
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                arrayList = arrayList6;
                                                arrayList2 = arrayList7;
                                                break;
                                            } else {
                                                if (xmlPullParser.getEventType() == 2) {
                                                    if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                        str2 = d.b(xmlPullParser, "IconClickThrough");
                                                    } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                        arrayList3 = arrayList6;
                                                        arrayList3.add(new c.a(d.b(xmlPullParser, "IconClickTracking")).a());
                                                        arrayList6 = arrayList3;
                                                    }
                                                }
                                                arrayList3 = arrayList6;
                                                arrayList6 = arrayList3;
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (aVar != null && aVar.f12408c != a.b.IFRAME_RESOURCE) {
                                            d.a(xmlPullParser);
                                        } else {
                                            aVar = new d.a(d.b(xmlPullParser, "HTMLResource"), a.EnumC0172a.NONE, a.b.HTML_RESOURCE);
                                        }
                                        arrayList = arrayList6;
                                        arrayList2 = arrayList7;
                                        break;
                                    default:
                                        d.a(xmlPullParser);
                                        arrayList = arrayList6;
                                        arrayList2 = arrayList7;
                                        break;
                                }
                                arrayList4 = arrayList;
                                i11 = 2;
                                arrayList5 = arrayList2;
                                i10 = 3;
                            }
                        }
                    }
                } else {
                    d.a(xmlPullParser);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
        if (r0.equals("unmute") == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(org.xmlpull.v1.XmlPullParser r7, com.bytedance.sdk.openadsdk.core.j.d r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.j.a.a.c.a(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.j.d):void");
    }

    private static void a(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.j.a aVar) throws IOException, XmlPullParserException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ClickThrough")) {
                    aVar.c(d.b(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    d.a(xmlPullParser);
                } else {
                    aVar.a().g(d.a(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }
}
