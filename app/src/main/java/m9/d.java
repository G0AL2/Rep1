package m9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import da.g0;
import ea.l0;
import ea.n0;
import ea.o0;
import ea.r;
import ea.v;
import j8.j2;
import j8.p1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.s;
import jb.y;
import m9.k;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: DashManifestParser.java */
/* loaded from: classes2.dex */
public class d extends DefaultHandler implements g0.a<c> {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f34345b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f34346c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f34347d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f34348e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f34349a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: DashManifestParser.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final p1 f34350a;

        /* renamed from: b  reason: collision with root package name */
        public final s<b> f34351b;

        /* renamed from: c  reason: collision with root package name */
        public final k f34352c;

        /* renamed from: d  reason: collision with root package name */
        public final String f34353d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<DrmInitData.SchemeData> f34354e;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList<e> f34355f;

        /* renamed from: g  reason: collision with root package name */
        public final long f34356g;

        /* renamed from: h  reason: collision with root package name */
        public final List<e> f34357h;

        /* renamed from: i  reason: collision with root package name */
        public final List<e> f34358i;

        public a(p1 p1Var, List<b> list, k kVar, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2, List<e> list2, List<e> list3, long j10) {
            this.f34350a = p1Var;
            this.f34351b = s.p(list);
            this.f34352c = kVar;
            this.f34353d = str;
            this.f34354e = arrayList;
            this.f34355f = arrayList2;
            this.f34357h = list2;
            this.f34358i = list3;
            this.f34356g = j10;
        }
    }

    public d() {
        try {
            this.f34349a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    protected static int C(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f34359a) && (str = eVar.f34360b) != null) {
                Matcher matcher = f34346c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String valueOf = String.valueOf(eVar.f34360b);
                r.h("MpdParser", valueOf.length() != 0 ? "Unable to parse CEA-608 channel number from: ".concat(valueOf) : new String("Unable to parse CEA-608 channel number from: "));
            }
        }
        return -1;
    }

    protected static int D(List<e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f34359a) && (str = eVar.f34360b) != null) {
                Matcher matcher = f34347d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String valueOf = String.valueOf(eVar.f34360b);
                r.h("MpdParser", valueOf.length() != 0 ? "Unable to parse CEA-708 service block number from: ".concat(valueOf) : new String("Unable to parse CEA-708 service block number from: "));
            }
        }
        return -1;
    }

    protected static long G(XmlPullParser xmlPullParser, String str, long j10) throws j2 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : n0.J0(attributeValue);
    }

    protected static e H(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String o02 = o0(xmlPullParser, "schemeIdUri", "");
        String o03 = o0(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
        String o04 = o0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!o0.d(xmlPullParser, str));
        return new e(o02, o03, o04);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected static int I(XmlPullParser xmlPullParser) {
        char c10;
        String attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue == null) {
            return -1;
        }
        String e10 = ib.b.e(attributeValue);
        e10.hashCode();
        switch (e10.hashCode()) {
            case 1596796:
                if (e10.equals("4000")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 2937391:
                if (e10.equals("a000")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3094035:
                if (e10.equals("f801")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3133436:
                if (e10.equals("fa01")) {
                    c10 = 3;
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    protected static long J(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : n0.K0(attributeValue);
    }

    protected static String K(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            String str = eVar.f34359a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f34360b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f34360b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float O(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    protected static float P(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f34345b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                return !TextUtils.isEmpty(group) ? parseInt / Integer.parseInt(group) : parseInt;
            }
            return f10;
        }
        return f10;
    }

    protected static int R(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    protected static long T(List<e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            if (ib.b.a("http://dashif.org/guidelines/last-segment-number", eVar.f34359a)) {
                return Long.parseLong(eVar.f34360b);
            }
        }
        return -1L;
    }

    protected static long U(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    protected static int W(XmlPullParser xmlPullParser) {
        int R = R(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
        if (R >= 0) {
            int[] iArr = f34348e;
            if (R < iArr.length) {
                return iArr[R];
            }
            return -1;
        }
        return -1;
    }

    private long b(List<k.d> list, long j10, long j11, int i10, long j12) {
        int m10 = i10 >= 0 ? i10 + 1 : (int) n0.m(j12 - j10, j11);
        for (int i11 = 0; i11 < m10; i11++) {
            list.add(m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    protected static String o0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    private static int p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        ea.a.f(i10 == i11);
        return i10;
    }

    protected static String p0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                v(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser, str));
        return str2;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        ea.a.f(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.f()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i10).c(schemeData)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    private static long s(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    private static String t(String str, String str2) {
        if (v.p(str)) {
            return v.c(str2);
        }
        if (v.t(str)) {
            return v.o(str2);
        }
        if (v.s(str)) {
            return "application/x-rawcc".equals(str) ? v.j(str2) : str;
        } else if (v.q(str)) {
            return str;
        } else {
            if ("application/mp4".equals(str)) {
                String g10 = v.g(str2);
                return "text/vtt".equals(g10) ? "application/x-mp4-vtt" : g10;
            }
            return null;
        }
    }

    private boolean u(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void v(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (o0.e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (o0.e(xmlPullParser)) {
                    i10++;
                } else if (o0.c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    protected long A(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    protected List<b> B(XmlPullParser xmlPullParser, List<b> list, boolean z10) throws XmlPullParserException, IOException {
        int i10;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        } else {
            i10 = z10 ? 1 : RecyclerView.UNDEFINED_DURATION;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String p02 = p0(xmlPullParser, "BaseURL");
        if (l0.b(p02)) {
            if (attributeValue3 == null) {
                attributeValue3 = p02;
            }
            return y.j(new b(p02, attributeValue3, i10, parseInt));
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = list.get(i11);
            String d10 = l0.d(bVar.f34328a, p02);
            String str = attributeValue3 == null ? d10 : attributeValue3;
            if (z10) {
                i10 = bVar.f34330c;
                parseInt = bVar.f34331d;
                str = bVar.f34329b;
            }
            arrayList.add(new b(d10, str, i10, parseInt));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> E(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.E(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    protected int F(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if (DownloadResource.TYPE_VIDEO.equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    protected Pair<Long, EventMessage> L(XmlPullParser xmlPullParser, String str, String str2, long j10, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        long U = U(xmlPullParser, "id", 0L);
        long U2 = U(xmlPullParser, "duration", -9223372036854775807L);
        long U3 = U(xmlPullParser, "presentationTime", 0L);
        long O0 = n0.O0(U2, 1000L, j10);
        long O02 = n0.O0(U3, 1000000L, j10);
        String o02 = o0(xmlPullParser, "messageData", null);
        byte[] M = M(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(O02);
        if (o02 != null) {
            M = n0.p0(o02);
        }
        return Pair.create(valueOf, d(str, str2, U, O0, M));
    }

    protected byte[] M(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, ib.d.f31905c.name());
        xmlPullParser.nextToken();
        while (!o0.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected f N(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String o02 = o0(xmlPullParser, "schemeIdUri", "");
        String o03 = o0(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, "");
        long U = U(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "Event")) {
                arrayList.add(L(xmlPullParser, o02, o03, U, byteArrayOutputStream));
            } else {
                v(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            eventMessageArr[i10] = (EventMessage) pair.second;
        }
        return e(o02, o03, U, jArr, eventMessageArr);
    }

    protected i Q(XmlPullParser xmlPullParser) {
        return a0(xmlPullParser, "sourceURL", "range");
    }

    protected String S(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return p0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8 A[LOOP:0: B:25:0x00a4->B:82:0x01e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected m9.c V(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.V(org.xmlpull.v1.XmlPullParser, android.net.Uri):m9.c");
    }

    protected Pair<g, Long> X(XmlPullParser xmlPullParser, List<b> list, long j10, long j11, long j12, long j13, boolean z10) throws XmlPullParserException, IOException {
        long j14;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j15;
        k i02;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long J = J(xmlPullParser2, "start", j10);
        long j16 = -9223372036854775807L;
        long j17 = j12 != -9223372036854775807L ? j12 + J : -9223372036854775807L;
        long J2 = J(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j18 = j11;
        long j19 = -9223372036854775807L;
        k.e eVar = null;
        e eVar2 = null;
        boolean z11 = false;
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    j18 = dVar.A(xmlPullParser2, j18);
                    z11 = true;
                }
                arrayList6.addAll(dVar.B(xmlPullParser2, list, z10));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j15 = j16;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (o0.f(xmlPullParser2, "AdaptationSet")) {
                    j14 = j18;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(x(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, eVar, J2, j18, j19, j17, j13, z10));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j14 = j18;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (o0.f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(N(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (o0.f(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        eVar = g0(xmlPullParser2, null);
                        obj = null;
                        j18 = j14;
                        j15 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (o0.f(xmlPullParser2, "SegmentList")) {
                            long A = A(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            i02 = h0(xmlPullParser, null, j17, J2, j14, A, j13);
                            j19 = A;
                            j18 = j14;
                            j15 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (o0.f(xmlPullParser2, "SegmentTemplate")) {
                                long A2 = A(xmlPullParser2, -9223372036854775807L);
                                j15 = -9223372036854775807L;
                                i02 = i0(xmlPullParser, null, s.t(), j17, J2, j14, A2, j13);
                                j19 = A2;
                                j18 = j14;
                            } else {
                                j15 = -9223372036854775807L;
                                if (o0.f(xmlPullParser2, "AssetIdentifier")) {
                                    eVar2 = H(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    v(xmlPullParser);
                                }
                                j18 = j14;
                            }
                        }
                        eVar = i02;
                    }
                }
                obj = null;
                j15 = -9223372036854775807L;
                j18 = j14;
            }
            if (o0.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, J, arrayList2, arrayList3, eVar2), Long.valueOf(J2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j16 = j15;
            dVar = this;
        }
    }

    protected String[] Y(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected h Z(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String o02 = o0(xmlPullParser, "moreInformationURL", null);
        String o03 = o0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (o0.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (o0.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                v(xmlPullParser);
            }
            String str4 = str3;
            if (o0.d(xmlPullParser, "ProgramInformation")) {
                return new h(str, str2, str4, o02, o03);
            }
            str3 = str4;
        }
    }

    protected i a0(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(Constants.FILENAME_SEQUENCE_SEPARATOR);
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return i(attributeValue, j10, j11);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return i(attributeValue, j10, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee A[LOOP:0: B:3:0x006a->B:57:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[EDGE_INSN: B:58:0x0198->B:47:0x0198 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected m9.d.a b0(org.xmlpull.v1.XmlPullParser r36, java.util.List<m9.b> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<m9.e> r46, java.util.List<m9.e> r47, java.util.List<m9.e> r48, java.util.List<m9.e> r49, m9.k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.b0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, m9.k, long, long, long, long, long, boolean):m9.d$a");
    }

    protected m9.a c(int i10, int i11, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        return new m9.a(i10, i11, list, list2, list3, list4);
    }

    protected int c0(List<e> list) {
        int q02;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (ib.b.a("urn:mpeg:dash:role:2011", eVar.f34359a)) {
                q02 = d0(eVar.f34360b);
            } else if (ib.b.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f34359a)) {
                q02 = q0(eVar.f34360b);
            }
            i10 |= q02;
        }
        return i10;
    }

    protected EventMessage d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new EventMessage(str, str2, j11, j10, bArr);
    }

    protected int d0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c10 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    protected f e(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        return new f(str, str2, j10, jArr, eventMessageArr);
    }

    protected int e0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (ib.b.a("http://dashif.org/guidelines/trickmode", list.get(i11).f34359a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    protected p1 f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<e> list, List<e> list2, String str4, List<e> list3, List<e> list4) {
        String str5 = str4;
        String t10 = t(str2, str5);
        if ("audio/eac3".equals(t10)) {
            t10 = K(list4);
            if ("audio/eac3-joc".equals(t10)) {
                str5 = "ec+3";
            }
        }
        int m02 = m0(list);
        p1.b V = new p1.b().S(str).K(str2).e0(t10).I(str5).Z(i14).g0(m02).c0(f0(list) | c0(list2) | e0(list3) | e0(list4)).V(str3);
        if (v.t(t10)) {
            V.j0(i10).Q(i11).P(f10);
        } else if (v.p(t10)) {
            V.H(i12).f0(i13);
        } else if (v.s(t10)) {
            int i15 = -1;
            if ("application/cea-608".equals(t10)) {
                i15 = C(list2);
            } else if ("application/cea-708".equals(t10)) {
                i15 = D(list2);
            }
            V.F(i15);
        } else if (v.q(t10)) {
            V.j0(i10).Q(i11);
        }
        return V.E();
    }

    protected int f0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (ib.b.a("urn:mpeg:dash:role:2011", eVar.f34359a)) {
                i10 |= d0(eVar.f34360b);
            }
        }
        return i10;
    }

    protected c g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        return new c(j10, j11, j12, z10, j13, j14, j15, j16, hVar, oVar, lVar, uri, list);
    }

    protected k.e g0(XmlPullParser xmlPullParser, k.e eVar) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        long U = U(xmlPullParser, "timescale", eVar != null ? eVar.f34391b : 1L);
        long U2 = U(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f34392c : 0L);
        long j12 = eVar != null ? eVar.f34405d : 0L;
        long j13 = eVar != null ? eVar.f34406e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split(Constants.FILENAME_SEQUENCE_SEPARATOR);
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j13;
            j11 = j12;
        }
        i iVar = eVar != null ? eVar.f34390a : null;
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "Initialization")) {
                iVar = Q(xmlPullParser);
            } else {
                v(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser, "SegmentBase"));
        return n(iVar, U, U2, j11, j10);
    }

    protected g h(String str, long j10, List<m9.a> list, List<f> list2, e eVar) {
        return new g(str, j10, list, list2, eVar);
    }

    protected k.b h0(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long U = U(xmlPullParser, "timescale", bVar != null ? bVar.f34391b : 1L);
        long U2 = U(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f34392c : 0L);
        long U3 = U(xmlPullParser, "duration", bVar != null ? bVar.f34394e : -9223372036854775807L);
        long U4 = U(xmlPullParser, "startNumber", bVar != null ? bVar.f34393d : 1L);
        long s10 = s(j12, j13);
        List<k.d> list = null;
        List<i> list2 = null;
        i iVar = null;
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "Initialization")) {
                iVar = Q(xmlPullParser);
            } else if (o0.f(xmlPullParser, "SegmentTimeline")) {
                list = j0(xmlPullParser, U, j11);
            } else if (o0.f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(k0(xmlPullParser));
            } else {
                v(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.f34390a;
            }
            if (list == null) {
                list = bVar.f34395f;
            }
            if (list2 == null) {
                list2 = bVar.f34399j;
            }
        }
        return k(iVar, U, U2, U4, U3, list, s10, list2, j14, j10);
    }

    protected i i(String str, long j10, long j11) {
        return new i(str, j10, j11);
    }

    protected k.c i0(XmlPullParser xmlPullParser, k.c cVar, List<e> list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long U = U(xmlPullParser, "timescale", cVar != null ? cVar.f34391b : 1L);
        long U2 = U(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f34392c : 0L);
        long U3 = U(xmlPullParser, "duration", cVar != null ? cVar.f34394e : -9223372036854775807L);
        long U4 = U(xmlPullParser, "startNumber", cVar != null ? cVar.f34393d : 1L);
        long T = T(list);
        long s10 = s(j12, j13);
        List<k.d> list2 = null;
        n r02 = r0(xmlPullParser, "media", cVar != null ? cVar.f34401k : null);
        n r03 = r0(xmlPullParser, "initialization", cVar != null ? cVar.f34400j : null);
        i iVar = null;
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "Initialization")) {
                iVar = Q(xmlPullParser);
            } else if (o0.f(xmlPullParser, "SegmentTimeline")) {
                list2 = j0(xmlPullParser, U, j11);
            } else {
                v(xmlPullParser);
            }
            if (o0.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar != null) {
            if (iVar == null) {
                iVar = cVar.f34390a;
            }
            if (list2 == null) {
                list2 = cVar.f34395f;
            }
        }
        return l(iVar, U, U2, U4, T, U3, list2, s10, r03, r02, j14, j10);
    }

    protected j j(a aVar, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<e> arrayList2) {
        p1.b b10 = aVar.f34350a.b();
        if (str != null) {
            b10.U(str);
        }
        String str3 = aVar.f34353d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = aVar.f34354e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            b10.M(new DrmInitData(str2, arrayList3));
        }
        ArrayList<e> arrayList4 = aVar.f34355f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f34356g, b10.E(), aVar.f34351b, aVar.f34352c, arrayList4, aVar.f34357h, aVar.f34358i, null);
    }

    protected List<k.d> j0(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "S")) {
                long U = U(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    j12 = b(arrayList, j12, j13, i10, U);
                }
                if (U == -9223372036854775807L) {
                    U = j12;
                }
                j13 = U(xmlPullParser, "d", -9223372036854775807L);
                i10 = R(xmlPullParser, "r", 0);
                j12 = U;
                z10 = true;
            } else {
                v(xmlPullParser);
            }
        } while (!o0.d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, j12, j13, i10, n0.O0(j11, j10, 1000L));
        }
        return arrayList;
    }

    protected k.b k(i iVar, long j10, long j11, long j12, long j13, List<k.d> list, long j14, List<i> list2, long j15, long j16) {
        return new k.b(iVar, j10, j11, j12, j13, list, j14, list2, n0.C0(j15), n0.C0(j16));
    }

    protected i k0(XmlPullParser xmlPullParser) {
        return a0(xmlPullParser, "media", "mediaRange");
    }

    protected k.c l(i iVar, long j10, long j11, long j12, long j13, long j14, List<k.d> list, long j15, n nVar, n nVar2, long j16, long j17) {
        return new k.c(iVar, j10, j11, j12, j13, j14, list, j15, nVar, nVar2, n0.C0(j16), n0.C0(j17));
    }

    protected int l0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected k.d m(long j10, long j11) {
        return new k.d(j10, j11);
    }

    protected int m0(List<e> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            e eVar = list.get(i11);
            if (ib.b.a("urn:mpeg:dash:role:2011", eVar.f34359a)) {
                i10 |= l0(eVar.f34360b);
            }
        }
        return i10;
    }

    protected k.e n(i iVar, long j10, long j11, long j12, long j13) {
        return new k.e(iVar, j10, j11, j12, j13);
    }

    protected l n0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (o0.f(xmlPullParser, "Latency")) {
                j10 = U(xmlPullParser, Analytics.Param.TARGET, -9223372036854775807L);
                j11 = U(xmlPullParser, "min", -9223372036854775807L);
                j12 = U(xmlPullParser, "max", -9223372036854775807L);
            } else if (o0.f(xmlPullParser, "PlaybackRate")) {
                f10 = O(xmlPullParser, "min", -3.4028235E38f);
                f11 = O(xmlPullParser, "max", -3.4028235E38f);
            }
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float f12 = f10;
            float f13 = f11;
            if (o0.d(xmlPullParser, "ServiceDescription")) {
                return new l(j13, j14, j15, f12, f13);
            }
            j10 = j13;
            j11 = j14;
            j12 = j15;
            f10 = f12;
            f11 = f13;
        }
    }

    protected o o(String str, String str2) {
        return new o(str, str2);
    }

    protected int q0(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c10 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c10 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    protected n r0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    protected o s0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    @Override // da.g0.a
    /* renamed from: w */
    public c a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f34349a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return V(newPullParser, uri);
            }
            throw j2.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw j2.c(null, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x030d A[LOOP:0: B:3:0x007c->B:71:0x030d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ce A[EDGE_INSN: B:72:0x02ce->B:65:0x02ce ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected m9.a x(org.xmlpull.v1.XmlPullParser r55, java.util.List<m9.b> r56, m9.k r57, long r58, long r60, long r62, long r64, long r66, boolean r68) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d.x(org.xmlpull.v1.XmlPullParser, java.util.List, m9.k, long, long, long, long, long, boolean):m9.a");
    }

    protected void y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        v(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        char c10;
        String o02 = o0(xmlPullParser, "schemeIdUri", null);
        o02.hashCode();
        int i10 = -1;
        switch (o02.hashCode()) {
            case -1352850286:
                if (o02.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1138141449:
                if (o02.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -986633423:
                if (o02.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 2036691300:
                if (o02.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c10 = 3;
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
                i10 = R(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                break;
            case 1:
            case 3:
                i10 = I(xmlPullParser);
                break;
            case 2:
                i10 = W(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!o0.d(xmlPullParser, "AudioChannelConfiguration"));
        return i10;
    }
}
