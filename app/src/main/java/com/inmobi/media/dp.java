package com.inmobi.media;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.fq;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: VastParser.java */
/* loaded from: classes3.dex */
public class dp {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25149a = "dp";

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, String> f25150f;

    /* renamed from: b  reason: collision with root package name */
    private ds f25151b;

    /* renamed from: c  reason: collision with root package name */
    private fq.k f25152c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f25153d;

    /* renamed from: e  reason: collision with root package name */
    private int f25154e;

    static {
        HashMap hashMap = new HashMap();
        f25150f = hashMap;
        hashMap.put("Error", "error");
        hashMap.put("Impression", "Impression");
        hashMap.put("ClickTracking", au.CLICK_BEACON);
        hashMap.put("creativeView", "creativeView");
        hashMap.put("start", "start");
        hashMap.put("firstQuartile", "firstQuartile");
        hashMap.put("midpoint", "midpoint");
        hashMap.put("thirdQuartile", "thirdQuartile");
        hashMap.put("complete", "complete");
        hashMap.put("mute", "mute");
        hashMap.put("unmute", "unmute");
        hashMap.put("pause", "pause");
        hashMap.put("resume", "resume");
        hashMap.put("fullscreen", "fullscreen");
        hashMap.put("exitFullscreen", "exitFullscreen");
        hashMap.put("closeEndCard", "closeEndCard");
    }

    public dp(fq.k kVar) {
        this.f25152c = kVar;
        this.f25151b = new ds(kVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
        a(101);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(org.xmlpull.v1.XmlPullParser r22) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.dp.b(org.xmlpull.v1.XmlPullParser):void");
    }

    private static boolean b(int i10) {
        return i10 == 3;
    }

    private boolean c(XmlPullParser xmlPullParser) {
        int i10 = i(xmlPullParser);
        boolean z10 = false;
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals("MediaFiles") && b(i10)) {
                if (!z10) {
                    a(TTAdConstant.MATE_IS_NULL_CODE);
                    return false;
                } else if (this.f25151b.f25168a.isEmpty()) {
                    a(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE);
                    return false;
                } else {
                    return true;
                }
            }
            if (xmlPullParser.getName() != null && "MediaFile".equals(xmlPullParser.getName()) && !b(i10)) {
                fq.c cVar = this.f25152c.bitRate;
                int attributeCount = xmlPullParser.getAttributeCount();
                String str = null;
                String str2 = null;
                int i11 = 0;
                for (int i12 = 0; i12 < attributeCount; i12++) {
                    String attributeName = xmlPullParser.getAttributeName(i12);
                    attributeName.hashCode();
                    char c10 = 65535;
                    switch (attributeName.hashCode()) {
                        case -102270099:
                            if (attributeName.equals("bitrate")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3575610:
                            if (attributeName.equals("type")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 823466996:
                            if (attributeName.equals("delivery")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            try {
                                i11 = Integer.valueOf(xmlPullParser.getAttributeValue(i12)).intValue();
                                break;
                            } catch (Exception unused) {
                                break;
                            }
                        case 1:
                            str2 = xmlPullParser.getAttributeValue(i12);
                            break;
                        case 2:
                            str = xmlPullParser.getAttributeValue(i12);
                            break;
                    }
                }
                int i13 = i(xmlPullParser);
                if (i13 == 4) {
                    String text = xmlPullParser.getText();
                    String trim = TextUtils.isEmpty(text) ? null : text.trim();
                    if (!URLUtil.isValidUrl(trim) || ((cVar.bitrate_mandatory && i11 <= 0) || str == null || !str.trim().equalsIgnoreCase("Progressive"))) {
                        i10 = i13;
                        z10 = true;
                    } else {
                        List<String> list = this.f25152c.allowedContentType;
                        if (str2 != null) {
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                if (str2.equalsIgnoreCase(list.get(i14))) {
                                    this.f25151b.f25168a.add(new dn(trim, str, str2, i11));
                                }
                            }
                        }
                    }
                }
                z10 = true;
            }
            i10 = i(xmlPullParser);
        }
    }

    private void d(XmlPullParser xmlPullParser) {
        int i10 = i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals("TrackingEvents") && b(i10)) {
                return;
            }
            if (xmlPullParser.getName() != null && "Tracking".equals(xmlPullParser.getName()) && !b(i10)) {
                int attributeCount = xmlPullParser.getAttributeCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= attributeCount) {
                        break;
                    } else if (xmlPullParser.getAttributeName(i11).equals("event")) {
                        String attributeValue = xmlPullParser.getAttributeValue(i11);
                        if (i(xmlPullParser) == 4) {
                            Map<String, String> map = f25150f;
                            if (map.containsKey(attributeValue)) {
                                a(map.get(attributeValue), xmlPullParser.getText());
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            }
            i10 = i(xmlPullParser);
        }
    }

    private void e(XmlPullParser xmlPullParser) {
        String attributeValue;
        int i10 = i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals("Extensions") && b(i10)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(i10)) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (!name.equals("CompanionAdTracking")) {
                    if (name.equals("Extension") && (attributeValue = xmlPullParser.getAttributeValue(null, "type")) != null && attributeValue.equals("AdVerifications")) {
                        g(xmlPullParser);
                    }
                } else {
                    f(xmlPullParser);
                }
            }
            i10 = i(xmlPullParser);
        }
    }

    private void f(XmlPullParser xmlPullParser) {
        int i10 = i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals("CompanionAdTracking") && b(i10)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(i10) && "TrackingEvents".equals(xmlPullParser.getName())) {
                d(xmlPullParser);
            }
            i10 = i(xmlPullParser);
        }
    }

    private void g(XmlPullParser xmlPullParser) {
        String attributeValue;
        int i10 = i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals("AdVerifications") && b(i10)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(i10)) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("Verification") && (attributeValue = xmlPullParser.getAttributeValue(null, "vendor")) != null) {
                    if (attributeValue.equals("Moat")) {
                        h(xmlPullParser);
                    } else {
                        b(xmlPullParser, attributeValue);
                    }
                }
            }
            i10 = i(xmlPullParser);
        }
    }

    private void h(XmlPullParser xmlPullParser) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int i10 = i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals("Verification") && b(i10)) {
                break;
            }
            if (xmlPullParser.getName() != null && !b(i10)) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ViewableImpression")) {
                    String name2 = xmlPullParser.getName();
                    String name3 = xmlPullParser.getName();
                    int attributeCount = xmlPullParser.getAttributeCount();
                    for (int i11 = 0; i11 < attributeCount; i11++) {
                        sb3.append(' ');
                        sb3.append(xmlPullParser.getAttributeName(i11));
                        sb3.append("=\"");
                        sb3.append(xmlPullParser.getAttributeValue(i11));
                        sb3.append("\"");
                    }
                    do {
                        try {
                            i10 = xmlPullParser.nextToken();
                        } catch (IOException | XmlPullParserException unused) {
                        }
                        if (i10 == 4) {
                            sb4.append(xmlPullParser.getText());
                        } else if (i10 == 5) {
                            sb4.append("<![CDATA[");
                            sb4.append(xmlPullParser.getText());
                            sb4.append("]]>");
                        }
                    } while (!b(i10));
                    sb2.append("<");
                    sb2.append(name2);
                    sb2.append((CharSequence) sb3);
                    sb2.append(">");
                    sb2.append((CharSequence) sb4);
                    sb2.append("<");
                    sb2.append("/");
                    sb2.append(name3);
                    sb2.append(">");
                }
            }
            i10 = i(xmlPullParser);
        }
        if (sb2.length() != 0) {
            this.f25151b.a(new cf(sb2.toString(), 0, "zMoatVASTIDs", null));
        }
    }

    private static int i(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    public final ds a(String str) {
        try {
        } catch (XmlPullParserException e10) {
            a(100);
            gg.a().a(new hg(e10));
        } catch (Exception e11) {
            a(900);
            gg.a().a(new hg(e11));
        }
        if (TextUtils.isEmpty(str)) {
            a(303);
            return this.f25151b;
        }
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        String[] strArr = {"Wrapper", "InLine"};
        a(newPullParser, "VAST");
        if (a("VAST", newPullParser)) {
            a(newPullParser, "Ad");
            if (a("Ad", newPullParser)) {
                a(newPullParser, strArr);
                if (a("InLine", newPullParser)) {
                    b(newPullParser);
                } else if (a("Wrapper", newPullParser)) {
                    a(newPullParser);
                } else {
                    a(101);
                }
            } else {
                a(303);
            }
        } else {
            a(101);
        }
        return this.f25151b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0147, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00be, code lost:
        a(101);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c1, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.dp.a(org.xmlpull.v1.XmlPullParser):void");
    }

    private void c(int i10) {
        bk a10 = bk.a();
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", String.valueOf(i10));
        for (cf cfVar : this.f25151b.f25171d) {
            if ("error".equals(cfVar.f24922d)) {
                a10.a(hv.a(cfVar.f24920b, hashMap), cfVar.f24923e, true);
            }
        }
    }

    private static void a(XmlPullParser xmlPullParser, String str) {
        int i10 = 0;
        while (true) {
            try {
                i10 = xmlPullParser.next();
            } catch (IOException | XmlPullParserException unused) {
            }
            if (i10 == 1) {
                return;
            }
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals(str)) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0027, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(org.xmlpull.v1.XmlPullParser r7, java.lang.String[] r8) {
        /*
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r1 = r7.next()     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
        L9:
            r3 = 1
            if (r1 == r3) goto L29
            java.lang.String r4 = r7.getName()
            if (r4 == 0) goto L27
            r4 = 0
        L13:
            r5 = 2
            if (r4 >= r5) goto L27
            r5 = r8[r4]
            java.lang.String r6 = r7.getName()
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L24
            r2 = 1
            goto L27
        L24:
            int r4 = r4 + 1
            goto L13
        L27:
            if (r2 == 0) goto L3
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.dp.a(org.xmlpull.v1.XmlPullParser, java.lang.String[]):void");
    }

    private void a(XmlPullParser xmlPullParser, boolean z10) {
        int i10 = i(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals("VideoClicks") && b(i10)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(i10)) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (!name.equals("ClickThrough")) {
                    if (name.equals("ClickTracking") && i(xmlPullParser) == 4) {
                        a(au.CLICK_BEACON, xmlPullParser.getText());
                    }
                } else if (z10 && i(xmlPullParser) == 4) {
                    String text = xmlPullParser.getText();
                    this.f25151b.f25170c = TextUtils.isEmpty(text) ? null : text.trim();
                }
            }
            i10 = i(xmlPullParser);
        }
    }

    private static boolean a(String str, XmlPullParser xmlPullParser) {
        return str.equals(xmlPullParser.getName());
    }

    private void a(int i10) {
        this.f25151b.f25173f = i10;
        c(i10);
    }

    private boolean a(String str, String str2) {
        String trim = TextUtils.isEmpty(str2) ? null : str2.trim();
        if (!URLUtil.isValidUrl(trim)) {
            return !str.equals("Impression");
        }
        this.f25151b.a(new cf(trim, 0, str, null));
        return true;
    }

    private void b(XmlPullParser xmlPullParser, String str) {
        int i10;
        int i11 = i(xmlPullParser);
        String str2 = null;
        String str3 = null;
        while (true) {
            if (xmlPullParser.getName() != null && xmlPullParser.getName().equals("Verification") && b(i11)) {
                break;
            }
            if (xmlPullParser.getName() != null && !b(i11)) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("JavaScriptResource")) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
                    if (attributeValue != null && attributeValue.startsWith("omid") && i(xmlPullParser) == 4) {
                        String text = xmlPullParser.getText();
                        str3 = TextUtils.isEmpty(text) ? null : text.trim();
                    }
                } else if (name.equals("VerificationParameters") && ((i10 = i(xmlPullParser)) == 5 || i10 == 4)) {
                    str2 = TextUtils.isEmpty(xmlPullParser.getText()) ? null : xmlPullParser.getText().trim();
                }
            }
            i11 = i(xmlPullParser);
        }
        if (URLUtil.isValidUrl(str3)) {
            this.f25151b.a(new em(str, str2, str3, "OMID_VIEWABILITY", null));
        }
    }
}
