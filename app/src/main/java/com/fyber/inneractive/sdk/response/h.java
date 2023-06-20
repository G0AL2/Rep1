package com.fyber.inneractive.sdk.response;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f20186a;

    /* renamed from: b  reason: collision with root package name */
    public String f20187b;

    public h(String str) throws Exception {
        this.f20186a = false;
        try {
            a(str);
            this.f20186a = true;
            IAlog.a("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e10) {
            IAlog.b("Error parsing Ad XML: %s", e10.getMessage());
            throw e10;
        }
    }

    public final void a(String str) throws XmlPullParserException, IOException {
        String str2;
        IAlog.a("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                int i10 = 1;
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, null, "tns:Ad");
                    IAlog.a("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.e("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.d("Ad content: %s", trim);
                    this.f20187b = trim == null ? null : g0.f20275f.a(trim);
                } else if (newPullParser.getEventType() != 2) {
                    throw new IllegalStateException();
                } else {
                    while (i10 != 0) {
                        int next = newPullParser.next();
                        if (next == 2) {
                            i10++;
                        } else if (next == 3) {
                            i10--;
                        }
                    }
                }
            }
        }
    }
}
