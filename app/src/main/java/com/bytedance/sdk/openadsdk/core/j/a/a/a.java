package com.bytedance.sdk.openadsdk.core.j.a.a;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.j.a.a.d;
import com.bytedance.sdk.openadsdk.core.j.c.a;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: CompanionAdsParser.java */
/* loaded from: classes.dex */
public class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.sdk.openadsdk.core.j.c a(Context context, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int i10;
        int i11;
        com.bytedance.sdk.openadsdk.core.j.c cVar;
        char c10;
        int i12;
        int i13;
        d.a aVar;
        int i14;
        int i15;
        a.EnumC0172a enumC0172a;
        d.a aVar2;
        if (context == null) {
            d.a(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i16 = displayMetrics.widthPixels;
        int i17 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        int i18 = (int) (i16 / f10);
        int i19 = (int) (i17 / f10);
        float f11 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.j.c cVar2 = null;
        while (true) {
            int i20 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return cVar2;
            }
            xmlPullParser.next();
            int i21 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = d.f12405f;
                int b10 = d.b(xmlPullParser.getAttributeValue(str, "width"));
                int b11 = d.b(xmlPullParser.getAttributeValue(str, "height"));
                if (b10 >= 300 && b11 >= 250) {
                    d.a aVar3 = new d.a();
                    while (true) {
                        if (xmlPullParser.getEventType() == i20 && xmlPullParser.getName().equals("Companion")) {
                            if (!TextUtils.isEmpty(aVar3.f12406a) && aVar3.f12412g >= f11) {
                                cVar2 = new com.bytedance.sdk.openadsdk.core.j.c(b10, b11, aVar3.f12407b, aVar3.f12408c, aVar3.f12406a, aVar3.f12410e, aVar3.f12411f, aVar3.f12409d);
                                f11 = aVar3.f12412g;
                            }
                        } else {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i21) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                d.a aVar4 = aVar3;
                                com.bytedance.sdk.openadsdk.core.j.c cVar3 = cVar2;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
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
                                        i12 = i19;
                                        i13 = b11;
                                        aVar = aVar4;
                                        i21 = 2;
                                        i14 = i18;
                                        i15 = b10;
                                        Point a10 = com.bytedance.sdk.openadsdk.core.j.c.a.a(context, i15, i13, a.b.HTML_RESOURCE);
                                        int i22 = a10.x;
                                        int i23 = a10.y;
                                        a.b bVar = a.b.IFRAME_RESOURCE;
                                        a.EnumC0172a enumC0172a2 = a.EnumC0172a.NONE;
                                        float a11 = com.bytedance.sdk.openadsdk.core.j.c.a(i14, i12, i22, i23, bVar, enumC0172a2);
                                        aVar.f12412g = a11;
                                        if (a11 <= f11) {
                                            d.a(xmlPullParser, "Companion", 3);
                                            break;
                                        } else {
                                            aVar.a(d.b(xmlPullParser, "IFrameResource"), enumC0172a2, bVar);
                                            break;
                                        }
                                    case 1:
                                        i12 = i19;
                                        i13 = b11;
                                        aVar = aVar4;
                                        i21 = 2;
                                        i14 = i18;
                                        i15 = b10;
                                        aVar.f12409d = d.b(xmlPullParser, "CompanionClickThrough");
                                        break;
                                    case 2:
                                        i12 = i19;
                                        i13 = b11;
                                        aVar = aVar4;
                                        int i24 = 3;
                                        i14 = i18;
                                        i15 = b10;
                                        while (true) {
                                            if (xmlPullParser.next() == i24 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                i21 = 2;
                                                break;
                                            } else {
                                                if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    aVar.b(d.b(xmlPullParser, "Tracking"));
                                                }
                                                i24 = 3;
                                            }
                                        }
                                        break;
                                    case 3:
                                        i12 = i19;
                                        i13 = b11;
                                        aVar = aVar4;
                                        i14 = i18;
                                        i15 = b10;
                                        a.EnumC0172a enumC0172a3 = a.EnumC0172a.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(d.f12405f, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.j.c.a.f12450a;
                                        if (set.contains(lowerCase)) {
                                            enumC0172a = a.EnumC0172a.IMAGE;
                                        } else {
                                            enumC0172a = a.EnumC0172a.JAVASCRIPT;
                                        }
                                        a.EnumC0172a enumC0172a4 = enumC0172a;
                                        a.b bVar2 = a.b.STATIC_RESOURCE;
                                        Point a12 = com.bytedance.sdk.openadsdk.core.j.c.a.a(context, i15, i13, bVar2);
                                        aVar.f12412g = com.bytedance.sdk.openadsdk.core.j.c.a(i14, i12, a12.x, a12.y, bVar2, enumC0172a4);
                                        String b12 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.j.c.a.f12451b.contains(lowerCase)) ? d.b(xmlPullParser, "StaticResource") : null;
                                        if (aVar.f12412g > f11 && !TextUtils.isEmpty(b12)) {
                                            aVar.a(b12, enumC0172a4, bVar2);
                                            i21 = 2;
                                        } else {
                                            d.a(xmlPullParser, "Companion", 3);
                                            i21 = 2;
                                            break;
                                        }
                                        break;
                                    case 4:
                                        i12 = i19;
                                        i13 = b11;
                                        aVar2 = aVar4;
                                        i14 = i18;
                                        i15 = b10;
                                        aVar2.a(d.b(xmlPullParser, "CompanionClickTracking"));
                                        aVar = aVar2;
                                        i21 = 2;
                                        break;
                                    case 5:
                                        a.b bVar3 = a.b.HTML_RESOURCE;
                                        Point a13 = com.bytedance.sdk.openadsdk.core.j.c.a.a(context, b10, b11, bVar3);
                                        int i25 = a13.x;
                                        int i26 = a13.y;
                                        a.EnumC0172a enumC0172a5 = a.EnumC0172a.NONE;
                                        int i27 = i18;
                                        int i28 = i19;
                                        aVar2 = aVar4;
                                        i12 = i19;
                                        i13 = b11;
                                        i14 = i18;
                                        i15 = b10;
                                        float a14 = com.bytedance.sdk.openadsdk.core.j.c.a(i27, i28, i25, i26, bVar3, enumC0172a5);
                                        aVar2.f12412g = a14;
                                        if (a14 <= f11) {
                                            d.a(xmlPullParser, "Companion", 3);
                                            aVar = aVar2;
                                            i21 = 2;
                                            break;
                                        } else {
                                            aVar2.a(d.b(xmlPullParser, "HTMLResource"), enumC0172a5, bVar3);
                                            aVar = aVar2;
                                            i21 = 2;
                                        }
                                    default:
                                        d.a(xmlPullParser);
                                        i12 = i19;
                                        i13 = b11;
                                        aVar = aVar4;
                                        i21 = 2;
                                        i14 = i18;
                                        i15 = b10;
                                        break;
                                }
                                aVar3 = aVar;
                                b11 = i13;
                                b10 = i15;
                                i19 = i12;
                                i18 = i14;
                                cVar2 = cVar3;
                                i20 = 3;
                            }
                        }
                    }
                } else {
                    i10 = i19;
                    i11 = i18;
                    cVar = cVar2;
                    d.a(xmlPullParser);
                }
            } else {
                i10 = i19;
                i11 = i18;
                cVar = cVar2;
            }
            i19 = i10;
            i18 = i11;
            cVar2 = cVar;
        }
    }
}
