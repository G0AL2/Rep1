package com.bytedance.sdk.openadsdk.core.j.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.core.j.c.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VastXmlPullParser.java */
/* loaded from: classes.dex */
public class d extends com.bytedance.sdk.openadsdk.core.j.a.b {

    /* renamed from: f  reason: collision with root package name */
    public static final String f12405f = null;

    public d(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    private com.bytedance.sdk.openadsdk.core.j.a a(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.j.b.c> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, f12405f, "VAST");
        boolean z10 = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = b(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (a(xmlPullParser.getAttributeValue(f12405f, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            } else if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.j.a a10 = b.a(this.f12415b, xmlPullParser, list, this.f12416c, this.f12417d);
                                    if (a10 != null) {
                                        if (TextUtils.isEmpty(a10.g())) {
                                            com.bytedance.sdk.openadsdk.core.j.a.b.f12413e = -6;
                                            return null;
                                        }
                                        return a10;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.j.a b10 = b(xmlPullParser, list);
                                    if (b10 != null) {
                                        return b10;
                                    }
                                } else {
                                    a(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        a(xmlPullParser);
                    }
                    z10 = true;
                } else {
                    a(xmlPullParser);
                }
            }
        }
        if (!z10) {
            com.bytedance.sdk.openadsdk.core.j.a.b.f12413e = -4;
            c(str);
        }
        if (com.bytedance.sdk.openadsdk.core.j.a.b.f12413e == 0) {
            com.bytedance.sdk.openadsdk.core.j.a.b.f12413e = -5;
        }
        return null;
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.j.b.c.a(com.bytedance.sdk.openadsdk.core.j.b.c.a(Collections.singletonList(new c.a(str).a()), this.f12414a > 0 ? com.bytedance.sdk.openadsdk.core.j.a.a.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.j.a.a.UNDEFINED_ERROR, -1L, null));
    }

    private static List<com.bytedance.sdk.openadsdk.core.j.b.c> d(String str) {
        return a(str, false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public com.bytedance.sdk.openadsdk.core.j.a b(String str, List<com.bytedance.sdk.openadsdk.core.j.b.c> list) {
        ByteArrayInputStream byteArrayInputStream;
        com.bytedance.sdk.openadsdk.core.j.a.b.f12413e = 0;
        InputStream inputStream = null;
        if (this.f12415b == null) {
            com.bytedance.sdk.openadsdk.core.j.a.b.f12413e = -1;
            return null;
        }
        ?? isEmpty = TextUtils.isEmpty(str);
        try {
            if (isEmpty != 0) {
                com.bytedance.sdk.openadsdk.core.j.a.b.f12413e = -2;
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            } catch (Exception unused) {
                byteArrayInputStream = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                newPullParser.setInput(byteArrayInputStream, "UTF-8");
                newPullParser.nextTag();
                com.bytedance.sdk.openadsdk.core.j.a a10 = a(newPullParser, list);
                try {
                    byteArrayInputStream.close();
                } catch (IOException unused3) {
                }
                return a10;
            } catch (Exception unused4) {
                com.bytedance.sdk.openadsdk.core.j.a.b.f12413e = -3;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = isEmpty;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VastXmlPullParser.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f12406a;

        /* renamed from: b  reason: collision with root package name */
        a.EnumC0172a f12407b;

        /* renamed from: c  reason: collision with root package name */
        a.b f12408c;

        /* renamed from: d  reason: collision with root package name */
        String f12409d;

        /* renamed from: e  reason: collision with root package name */
        final List<com.bytedance.sdk.openadsdk.core.j.b.c> f12410e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        final List<com.bytedance.sdk.openadsdk.core.j.b.c> f12411f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        float f12412g = Float.MIN_VALUE;

        public a() {
        }

        public void a(String str, a.EnumC0172a enumC0172a, a.b bVar) {
            this.f12406a = str;
            this.f12407b = enumC0172a;
            this.f12408c = bVar;
        }

        public void b(String str) {
            this.f12411f.add(new c.a(str).a());
        }

        public void a(String str) {
            this.f12410e.add(new c.a(str).a());
        }

        public a(String str, a.EnumC0172a enumC0172a, a.b bVar) {
            a(str, enumC0172a, bVar);
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    public static String b(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        String str3 = f12405f;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
        if (r8.equals("TrackingEvents") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.j.a b(org.xmlpull.v1.XmlPullParser r17, java.util.List<com.bytedance.sdk.openadsdk.core.j.b.c> r18) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.j.a.a.d.b(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.j.a");
    }

    public static List<com.bytedance.sdk.openadsdk.core.j.b.c> a(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return d(b(xmlPullParser, str));
    }

    public static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void a(XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            }
            xmlPullParser.next();
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.j.b.c> a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new c.a(str).a(z10).a());
    }
}
