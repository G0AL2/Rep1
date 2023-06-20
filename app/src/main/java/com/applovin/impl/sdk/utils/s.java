package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final v f8949a;

    /* renamed from: b  reason: collision with root package name */
    private Stack<a> f8950b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f8951c;

    /* renamed from: d  reason: collision with root package name */
    private long f8952d;

    /* renamed from: e  reason: collision with root package name */
    private a f8953e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends r {
        a(String str, Map<String, String> map, r rVar) {
            super(str, map, rVar);
        }

        void a(r rVar) {
            if (rVar == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f8945c.add(rVar);
        }

        void d(String str) {
            this.f8944b = str;
        }
    }

    s(com.applovin.impl.sdk.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f8949a = mVar.A();
    }

    public static r a(String str, com.applovin.impl.sdk.m mVar) throws SAXException {
        return new s(mVar).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(attributes.getQName(i10), attributes.getValue(i10));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public r a(String str) throws SAXException {
        if (str != null) {
            this.f8951c = new StringBuilder();
            this.f8950b = new Stack<>();
            this.f8953e = null;
            Xml.parse(str, new ContentHandler() { // from class: com.applovin.impl.sdk.utils.s.1
                @Override // org.xml.sax.ContentHandler
                public void characters(char[] cArr, int i10, int i11) {
                    String trim = new String(Arrays.copyOfRange(cArr, i10, i11)).trim();
                    if (StringUtils.isValidString(trim)) {
                        s.this.f8951c.append(trim);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - s.this.f8952d;
                    if (v.a()) {
                        v vVar = s.this.f8949a;
                        vVar.b("XmlParser", "Finished parsing in " + seconds + " seconds");
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endElement(String str2, String str3, String str4) {
                    s sVar = s.this;
                    sVar.f8953e = (a) sVar.f8950b.pop();
                    s.this.f8953e.d(s.this.f8951c.toString().trim());
                    s.this.f8951c.setLength(0);
                }

                @Override // org.xml.sax.ContentHandler
                public void endPrefixMapping(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void ignorableWhitespace(char[] cArr, int i10, int i11) {
                }

                @Override // org.xml.sax.ContentHandler
                public void processingInstruction(String str2, String str3) {
                }

                @Override // org.xml.sax.ContentHandler
                public void setDocumentLocator(Locator locator) {
                }

                @Override // org.xml.sax.ContentHandler
                public void skippedEntity(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void startDocument() {
                    if (v.a()) {
                        s.this.f8949a.b("XmlParser", "Begin parsing...");
                    }
                    s.this.f8952d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                @Override // org.xml.sax.ContentHandler
                public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                    try {
                        a aVar = s.this.f8950b.isEmpty() ? null : (a) s.this.f8950b.peek();
                        a aVar2 = new a(str3, s.this.a(attributes), aVar);
                        if (aVar != null) {
                            aVar.a(aVar2);
                        }
                        s.this.f8950b.push(aVar2);
                    } catch (Exception e10) {
                        if (v.a()) {
                            v vVar = s.this.f8949a;
                            vVar.b("XmlParser", "Unable to process element <" + str3 + ">", e10);
                        }
                        throw new SAXException("Failed to start element", e10);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void startPrefixMapping(String str2, String str3) {
                }
            });
            a aVar = this.f8953e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
