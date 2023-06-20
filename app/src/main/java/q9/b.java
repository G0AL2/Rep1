package q9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import da.g0;
import ea.n0;
import j8.j2;
import j8.p1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q9.a;
import w8.l;
import w8.p;

/* compiled from: SsManifestParser.java */
/* loaded from: classes2.dex */
public class b implements g0.a<q9.a> {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f36022a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f36023a;

        /* renamed from: b  reason: collision with root package name */
        private final String f36024b;

        /* renamed from: c  reason: collision with root package name */
        private final a f36025c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Pair<String, Object>> f36026d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f36025c = aVar;
            this.f36023a = str;
            this.f36024b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i10 = 0; i10 < this.f36026d.size(); i10++) {
                Pair<String, Object> pair = this.f36026d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f36025c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f36024b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e10 = e(this, name, this.f36023a);
                            if (e10 == null) {
                                i10 = 1;
                            } else {
                                a(e10.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i10) throws j2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw j2.c(null, e10);
                }
            }
            return i10;
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j10) throws j2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw j2.c(null, e10);
                }
            }
            return j10;
        }

        protected final int k(XmlPullParser xmlPullParser, String str) throws j2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw j2.c(null, e10);
                }
            }
            throw new C0482b(str);
        }

        protected final long l(XmlPullParser xmlPullParser, String str) throws j2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw j2.c(null, e10);
                }
            }
            throw new C0482b(str);
        }

        protected final String m(XmlPullParser xmlPullParser, String str) throws C0482b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0482b(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser) throws j2;

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, Object obj) {
            this.f36026d.add(Pair.create(str, obj));
        }
    }

    /* compiled from: SsManifestParser.java */
    /* renamed from: q9.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0482b extends j2 {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C0482b(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.String r4 = java.lang.String.valueOf(r4)
                int r0 = r4.length()
                java.lang.String r1 = "Missing required field: "
                if (r0 == 0) goto L11
                java.lang.String r4 = r1.concat(r4)
                goto L16
            L11:
                java.lang.String r4 = new java.lang.String
                r4.<init>(r1)
            L16:
                r0 = 0
                r1 = 1
                r2 = 4
                r3.<init>(r4, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q9.b.C0482b.<init>(java.lang.String):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static class c extends a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f36027e;

        /* renamed from: f  reason: collision with root package name */
        private UUID f36028f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f36029g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // q9.b.a
        public Object b() {
            UUID uuid = this.f36028f;
            return new a.C0481a(uuid, l.a(uuid, this.f36029g), q(this.f36029g));
        }

        @Override // q9.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // q9.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f36027e = false;
            }
        }

        @Override // q9.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f36027e = true;
                this.f36028f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // q9.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f36027e) {
                this.f36029g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static class d extends a {

        /* renamed from: e  reason: collision with root package name */
        private p1 f36030e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] J = n0.J(str);
                byte[][] i10 = ea.d.i(J);
                if (i10 == null) {
                    arrayList.add(J);
                } else {
                    Collections.addAll(arrayList, i10);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // q9.b.a
        public Object b() {
            return this.f36030e;
        }

        @Override // q9.b.a
        public void n(XmlPullParser xmlPullParser) throws j2 {
            p1.b bVar = new p1.b();
            String r10 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, "MaxWidth")).Q(k(xmlPullParser, "MaxHeight")).T(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r10 == null) {
                    r10 = AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
                }
                int k10 = k(xmlPullParser, "Channels");
                int k11 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q10 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q10.isEmpty() && AudioTrackTranscoder.MIMETYPE_AUDIO_AAC.equals(r10)) {
                    q10 = Collections.singletonList(l8.a.a(k11, k10));
                }
                bVar.K("audio/mp4").H(k10).f0(k11).T(q10);
            } else if (intValue == 3) {
                int i10 = 0;
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
                    }
                }
                bVar.K("application/mp4").c0(i10);
            } else {
                bVar.K("application/mp4");
            }
            this.f36030e = bVar.S(xmlPullParser.getAttributeValue(null, "Index")).U((String) c("Name")).e0(r10).G(k(xmlPullParser, "Bitrate")).V((String) c("Language")).E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static class e extends a {

        /* renamed from: e  reason: collision with root package name */
        private final List<a.b> f36031e;

        /* renamed from: f  reason: collision with root package name */
        private int f36032f;

        /* renamed from: g  reason: collision with root package name */
        private int f36033g;

        /* renamed from: h  reason: collision with root package name */
        private long f36034h;

        /* renamed from: i  reason: collision with root package name */
        private long f36035i;

        /* renamed from: j  reason: collision with root package name */
        private long f36036j;

        /* renamed from: k  reason: collision with root package name */
        private int f36037k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f36038l;

        /* renamed from: m  reason: collision with root package name */
        private a.C0481a f36039m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f36037k = -1;
            this.f36039m = null;
            this.f36031e = new LinkedList();
        }

        @Override // q9.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f36031e.add((a.b) obj);
            } else if (obj instanceof a.C0481a) {
                ea.a.f(this.f36039m == null);
                this.f36039m = (a.C0481a) obj;
            }
        }

        @Override // q9.b.a
        public Object b() {
            int size = this.f36031e.size();
            a.b[] bVarArr = new a.b[size];
            this.f36031e.toArray(bVarArr);
            if (this.f36039m != null) {
                a.C0481a c0481a = this.f36039m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0481a.f36003a, "video/mp4", c0481a.f36004b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f36006a;
                    if (i11 == 2 || i11 == 1) {
                        p1[] p1VarArr = bVar.f36015j;
                        for (int i12 = 0; i12 < p1VarArr.length; i12++) {
                            p1VarArr[i12] = p1VarArr[i12].b().M(drmInitData).E();
                        }
                    }
                }
            }
            return new q9.a(this.f36032f, this.f36033g, this.f36034h, this.f36035i, this.f36036j, this.f36037k, this.f36038l, this.f36039m, bVarArr);
        }

        @Override // q9.b.a
        public void n(XmlPullParser xmlPullParser) throws j2 {
            this.f36032f = k(xmlPullParser, "MajorVersion");
            this.f36033g = k(xmlPullParser, "MinorVersion");
            this.f36034h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f36035i = l(xmlPullParser, "Duration");
            this.f36036j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f36037k = i(xmlPullParser, "LookaheadCount", -1);
            this.f36038l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f36034h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SsManifestParser.java */
    /* loaded from: classes2.dex */
    public static class f extends a {

        /* renamed from: e  reason: collision with root package name */
        private final String f36040e;

        /* renamed from: f  reason: collision with root package name */
        private final List<p1> f36041f;

        /* renamed from: g  reason: collision with root package name */
        private int f36042g;

        /* renamed from: h  reason: collision with root package name */
        private String f36043h;

        /* renamed from: i  reason: collision with root package name */
        private long f36044i;

        /* renamed from: j  reason: collision with root package name */
        private String f36045j;

        /* renamed from: k  reason: collision with root package name */
        private String f36046k;

        /* renamed from: l  reason: collision with root package name */
        private int f36047l;

        /* renamed from: m  reason: collision with root package name */
        private int f36048m;

        /* renamed from: n  reason: collision with root package name */
        private int f36049n;

        /* renamed from: o  reason: collision with root package name */
        private int f36050o;

        /* renamed from: p  reason: collision with root package name */
        private String f36051p;

        /* renamed from: q  reason: collision with root package name */
        private ArrayList<Long> f36052q;

        /* renamed from: r  reason: collision with root package name */
        private long f36053r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f36040e = str;
            this.f36041f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) throws j2 {
            int s10 = s(xmlPullParser);
            this.f36042g = s10;
            p("Type", Integer.valueOf(s10));
            if (this.f36042g == 3) {
                this.f36043h = m(xmlPullParser, "Subtype");
            } else {
                this.f36043h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.f36043h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f36045j = attributeValue;
            p("Name", attributeValue);
            this.f36046k = m(xmlPullParser, "Url");
            this.f36047l = i(xmlPullParser, "MaxWidth", -1);
            this.f36048m = i(xmlPullParser, "MaxHeight", -1);
            this.f36049n = i(xmlPullParser, "DisplayWidth", -1);
            this.f36050o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f36051p = attributeValue2;
            p("Language", attributeValue2);
            long i10 = i(xmlPullParser, "TimeScale", -1);
            this.f36044i = i10;
            if (i10 == -1) {
                this.f36044i = ((Long) c("TimeScale")).longValue();
            }
            this.f36052q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) throws j2 {
            int size = this.f36052q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else if (this.f36053r != -1) {
                    j10 = this.f36052q.get(size - 1).longValue() + this.f36053r;
                } else {
                    throw j2.c("Unable to infer start time", null);
                }
            }
            this.f36052q.add(Long.valueOf(j10));
            this.f36053r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1L);
            if (j11 > 1 && this.f36053r == -9223372036854775807L) {
                throw j2.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f36052q.add(Long.valueOf((this.f36053r * j12) + j10));
                i10++;
            }
        }

        private int s(XmlPullParser xmlPullParser) throws j2 {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if ("audio".equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if (DownloadResource.TYPE_VIDEO.equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                StringBuilder sb2 = new StringBuilder(attributeValue.length() + 19);
                sb2.append("Invalid key value[");
                sb2.append(attributeValue);
                sb2.append("]");
                throw j2.c(sb2.toString(), null);
            }
            throw new C0482b("Type");
        }

        @Override // q9.b.a
        public void a(Object obj) {
            if (obj instanceof p1) {
                this.f36041f.add((p1) obj);
            }
        }

        @Override // q9.b.a
        public Object b() {
            p1[] p1VarArr = new p1[this.f36041f.size()];
            this.f36041f.toArray(p1VarArr);
            return new a.b(this.f36040e, this.f36046k, this.f36042g, this.f36043h, this.f36044i, this.f36045j, this.f36047l, this.f36048m, this.f36049n, this.f36050o, this.f36051p, p1VarArr, this.f36052q, this.f36053r);
        }

        @Override // q9.b.a
        public boolean d(String str) {
            return l6.c.f33710i.equals(str);
        }

        @Override // q9.b.a
        public void n(XmlPullParser xmlPullParser) throws j2 {
            if (l6.c.f33710i.equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public b() {
        try {
            this.f36022a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // da.g0.a
    /* renamed from: b */
    public q9.a a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f36022a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (q9.a) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw j2.c(null, e10);
        }
    }
}
