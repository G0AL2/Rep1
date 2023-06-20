package com.bytedance.sdk.openadsdk.core.j.a.a;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: InLineParser.java */
/* loaded from: classes.dex */
public class b {
    public static com.bytedance.sdk.openadsdk.core.j.a a(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.j.b.c> list, int i10, double d10) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, d.f12405f, "InLine");
        com.bytedance.sdk.openadsdk.core.j.a aVar = new com.bytedance.sdk.openadsdk.core.j.a();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                aVar.a().j(list);
                if (TextUtils.isEmpty(aVar.g())) {
                    return null;
                }
                return aVar;
            } else if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                char c10 = 65535;
                switch (name.hashCode()) {
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -56677412:
                        if (name.equals("Description")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 501930965:
                        if (name.equals("AdTitle")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        if (!TextUtils.isEmpty(aVar.g()) && aVar.c() != null) {
                            d.a(xmlPullParser);
                            break;
                        } else {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        a(context, xmlPullParser, aVar, i10, d10);
                                    } else {
                                        d.a(xmlPullParser);
                                    }
                                }
                            }
                            continue;
                        }
                    case 1:
                        aVar.b(d.b(xmlPullParser, name));
                        continue;
                    case 2:
                        list.addAll(d.a(xmlPullParser, name));
                        continue;
                    case 3:
                        aVar.a(d.b(xmlPullParser, name));
                        continue;
                    case 4:
                        aVar.a().a(d.a(xmlPullParser, name));
                        continue;
                    default:
                        d.a(xmlPullParser);
                        continue;
                }
            }
        }
    }

    public static void a(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.j.a aVar, int i10, double d10) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(aVar.g())) {
                    c.a(xmlPullParser, aVar, i10, d10);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && aVar.c() == null) {
                    aVar.a(a.a(context, xmlPullParser));
                } else {
                    d.a(xmlPullParser);
                }
            }
        }
    }
}
