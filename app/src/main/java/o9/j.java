package o9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import da.g0;
import ea.l0;
import ea.n0;
import ea.r;
import j8.j2;
import j8.p1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.v;
import o9.g;
import o9.h;

/* compiled from: HlsPlaylistParser.java */
/* loaded from: classes2.dex */
public final class j implements g0.a<i> {

    /* renamed from: a  reason: collision with root package name */
    private final h f35160a;

    /* renamed from: b  reason: collision with root package name */
    private final g f35161b;

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f35136c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f35137d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f35138e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f35139f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f35140g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f35141h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f35142i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f35143j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f35144k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f35145l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f35146m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f35147n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o  reason: collision with root package name */
    private static final Pattern f35148o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f35149p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f35150q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f35151r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f35152s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f35153t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f35154u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f35155v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w  reason: collision with root package name */
    private static final Pattern f35156w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x  reason: collision with root package name */
    private static final Pattern f35157x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f35158y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f35159z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern T = c("AUTOSELECT");
    private static final Pattern U = c("DEFAULT");
    private static final Pattern V = c("FORCED");
    private static final Pattern W = c("INDEPENDENT");
    private static final Pattern X = c("GAP");
    private static final Pattern Y = c("PRECISE");
    private static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0  reason: collision with root package name */
    private static final Pattern f35134a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0  reason: collision with root package name */
    private static final Pattern f35135b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* compiled from: HlsPlaylistParser.java */
    /* loaded from: classes2.dex */
    public static final class a extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HlsPlaylistParser.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final BufferedReader f35162a;

        /* renamed from: b  reason: collision with root package name */
        private final Queue<String> f35163b;

        /* renamed from: c  reason: collision with root package name */
        private String f35164c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f35163b = queue;
            this.f35162a = bufferedReader;
        }

        public boolean a() throws IOException {
            String trim;
            if (this.f35164c != null) {
                return true;
            }
            if (!this.f35163b.isEmpty()) {
                this.f35164c = (String) ea.a.e(this.f35163b.poll());
                return true;
            }
            do {
                String readLine = this.f35162a.readLine();
                this.f35164c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f35164c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (a()) {
                String str = this.f35164c;
                this.f35164c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public j() {
        this(h.f35111n, null);
    }

    private static long A(String str, Pattern pattern) throws j2 {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String B(String str, Map<String, String> map) {
        Matcher matcher = f35135b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int C(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !n0.v0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C2 = C(bufferedReader, true, read);
        for (int i10 = 0; i10 < 7; i10++) {
            if (C2 != "#EXTM3U".charAt(i10)) {
                return false;
            }
            C2 = bufferedReader.read();
        }
        return n0.v0(C(bufferedReader, false, C2));
    }

    private static Pattern c(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9);
        sb2.append(str);
        sb2.append("=(");
        sb2.append("NO");
        sb2.append("|");
        sb2.append("YES");
        sb2.append(")");
        return Pattern.compile(sb2.toString());
    }

    private static DrmInitData d(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            schemeDataArr2[i10] = schemeDataArr[i10].e(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static h.b f(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f35128d)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b g(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f35129e)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b h(ArrayList<h.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f35127c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) throws j2 {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static DrmInitData.SchemeData k(String str, String str2, Map<String, String> map) throws j2 {
        String u10 = u(str, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z10 = z(str, K, map);
            return new DrmInitData.SchemeData(j8.h.f32428d, "video/mp4", Base64.decode(z10.substring(z10.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(j8.h.f32428d, "hls", n0.p0(str));
        } else {
            if ("com.microsoft.playready".equals(str2) && "1".equals(u10)) {
                String z11 = z(str, K, map);
                byte[] decode = Base64.decode(z11.substring(z11.indexOf(44)), 0);
                UUID uuid = j8.h.f32429e;
                return new DrmInitData.SchemeData(uuid, "video/mp4", w8.l.a(uuid, decode));
            }
            return null;
        }
    }

    private static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int m(String str, Pattern pattern) throws j2 {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) throws j2 {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    private static g o(h hVar, g gVar, b bVar, String str) throws IOException {
        ArrayList arrayList;
        int i10;
        HashMap hashMap;
        ArrayList arrayList2;
        String str2;
        String str3;
        long j10;
        g.b bVar2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j11;
        long j12;
        long j13;
        HashMap hashMap2;
        DrmInitData drmInitData;
        long j14;
        String str4;
        h hVar2 = hVar;
        g gVar2 = gVar;
        boolean z10 = hVar2.f35133c;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        g.f fVar = new g.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z11 = false;
        boolean z12 = z10;
        g.f fVar2 = fVar;
        String str6 = "";
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        int i11 = 0;
        long j23 = -9223372036854775807L;
        boolean z13 = false;
        boolean z14 = false;
        int i12 = 0;
        int i13 = 1;
        long j24 = -9223372036854775807L;
        long j25 = -9223372036854775807L;
        boolean z15 = false;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        boolean z16 = false;
        String str7 = null;
        long j26 = -1;
        String str8 = null;
        String str9 = null;
        int i14 = 0;
        boolean z17 = false;
        g.d dVar = null;
        ArrayList arrayList10 = arrayList7;
        g.b bVar3 = null;
        while (bVar.a()) {
            String b10 = bVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList9.add(b10);
            }
            if (b10.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z18 = z(b10, f35150q, hashMap3);
                if ("VOD".equals(z18)) {
                    i11 = 1;
                } else if ("EVENT".equals(z18)) {
                    i11 = 2;
                }
            } else if (b10.equals("#EXT-X-I-FRAMES-ONLY")) {
                z17 = true;
            } else {
                if (b10.startsWith("#EXT-X-START")) {
                    arrayList = arrayList6;
                    z13 = q(b10, Y, z11);
                    j23 = (long) (j(b10, C) * 1000000.0d);
                } else {
                    arrayList = arrayList6;
                    if (b10.startsWith("#EXT-X-SERVER-CONTROL")) {
                        fVar2 = y(b10);
                    } else if (b10.startsWith("#EXT-X-PART-INF")) {
                        j25 = (long) (j(b10, f35148o) * 1000000.0d);
                    } else if (b10.startsWith("#EXT-X-MAP")) {
                        String z19 = z(b10, K, hashMap3);
                        String v10 = v(b10, E, hashMap3);
                        if (v10 != null) {
                            String[] R0 = n0.R0(v10, "@");
                            j26 = Long.parseLong(R0[z11 ? 1 : 0]);
                            if (R0.length > 1) {
                                j17 = Long.parseLong(R0[1]);
                            }
                        }
                        int i15 = (j26 > (-1L) ? 1 : (j26 == (-1L) ? 0 : -1));
                        if (i15 == 0) {
                            j17 = 0;
                        }
                        String str10 = str7;
                        String str11 = str8;
                        if (str10 != null && str11 == null) {
                            throw j2.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        dVar = new g.d(z19, j17, j26, str10, str11);
                        if (i15 != 0) {
                            j17 += j26;
                        }
                        str8 = str11;
                        str7 = str10;
                        arrayList6 = arrayList;
                        j26 = -1;
                    } else {
                        String str12 = str7;
                        String str13 = str8;
                        if (b10.startsWith("#EXT-X-TARGETDURATION")) {
                            j24 = 1000000 * m(b10, f35146m);
                        } else if (b10.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j20 = n(b10, f35157x);
                            str8 = str13;
                            str7 = str12;
                            j16 = j20;
                            arrayList6 = arrayList;
                            z11 = false;
                        } else if (b10.startsWith("#EXT-X-VERSION")) {
                            i13 = m(b10, f35149p);
                        } else {
                            if (b10.startsWith("#EXT-X-DEFINE")) {
                                String v11 = v(b10, f35134a0, hashMap3);
                                if (v11 != null) {
                                    String str14 = hVar2.f35120l.get(v11);
                                    if (str14 != null) {
                                        hashMap3.put(v11, str14);
                                    }
                                } else {
                                    hashMap3.put(z(b10, P, hashMap3), z(b10, Z, hashMap3));
                                }
                                i10 = i11;
                                hashMap = hashMap3;
                                arrayList2 = arrayList8;
                                str2 = str5;
                                str3 = str9;
                                j10 = j20;
                                bVar2 = bVar3;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList;
                            } else if (b10.startsWith("#EXTINF")) {
                                j21 = A(b10, f35158y);
                                str6 = u(b10, f35159z, str5, hashMap3);
                            } else if (b10.startsWith("#EXT-X-SKIP")) {
                                int m10 = m(b10, f35153t);
                                ea.a.f(gVar2 != null && arrayList.isEmpty());
                                int i16 = (int) (j16 - ((g) n0.j(gVar)).f35076k);
                                int i17 = m10 + i16;
                                if (i16 < 0 || i17 > gVar2.f35083r.size()) {
                                    throw new a();
                                }
                                String str15 = str5;
                                str8 = str13;
                                long j27 = j19;
                                while (i16 < i17) {
                                    g.d dVar2 = gVar2.f35083r.get(i16);
                                    int i18 = i17;
                                    String str16 = str15;
                                    if (j16 != gVar2.f35076k) {
                                        dVar2 = dVar2.b(j27, (gVar2.f35075j - i12) + dVar2.f35098d);
                                    }
                                    ArrayList arrayList11 = arrayList;
                                    arrayList11.add(dVar2);
                                    long j28 = j27 + dVar2.f35097c;
                                    long j29 = dVar2.f35104j;
                                    if (j29 != -1) {
                                        j17 = dVar2.f35103i + j29;
                                    }
                                    int i19 = dVar2.f35098d;
                                    g.d dVar3 = dVar2.f35096b;
                                    DrmInitData drmInitData4 = dVar2.f35100f;
                                    String str17 = dVar2.f35101g;
                                    String str18 = dVar2.f35102h;
                                    if (str18 == null || !str18.equals(Long.toHexString(j20))) {
                                        str8 = dVar2.f35102h;
                                    }
                                    j20++;
                                    i16++;
                                    dVar = dVar3;
                                    str12 = str17;
                                    arrayList = arrayList11;
                                    i14 = i19;
                                    i17 = i18;
                                    j18 = j28;
                                    str15 = str16;
                                    gVar2 = gVar;
                                    drmInitData3 = drmInitData4;
                                    j27 = j18;
                                }
                                hVar2 = hVar;
                                gVar2 = gVar;
                                j19 = j27;
                                str5 = str15;
                                str7 = str12;
                                arrayList6 = arrayList;
                                z11 = false;
                            } else {
                                str2 = str5;
                                if (b10.startsWith("#EXT-X-KEY")) {
                                    String z20 = z(b10, H, hashMap3);
                                    String u10 = u(b10, I, "identity", hashMap3);
                                    if ("NONE".equals(z20)) {
                                        treeMap.clear();
                                        str4 = null;
                                        drmInitData3 = null;
                                        str8 = null;
                                    } else {
                                        String v12 = v(b10, L, hashMap3);
                                        if ("identity".equals(u10)) {
                                            if ("AES-128".equals(z20)) {
                                                str4 = z(b10, K, hashMap3);
                                                str8 = v12;
                                            }
                                            str8 = v12;
                                            str4 = null;
                                        } else {
                                            String str19 = str9;
                                            str9 = str19 == null ? l(z20) : str19;
                                            DrmInitData.SchemeData k10 = k(b10, u10, hashMap3);
                                            if (k10 != null) {
                                                treeMap.put(u10, k10);
                                                str8 = v12;
                                                str4 = null;
                                                drmInitData3 = null;
                                            }
                                            str8 = v12;
                                            str4 = null;
                                        }
                                    }
                                    gVar2 = gVar;
                                    str7 = str4;
                                    arrayList6 = arrayList;
                                    str5 = str2;
                                    z11 = false;
                                    hVar2 = hVar;
                                } else {
                                    str3 = str9;
                                    if (b10.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] R02 = n0.R0(z(b10, D, hashMap3), "@");
                                        j26 = Long.parseLong(R02[0]);
                                        if (R02.length > 1) {
                                            j17 = Long.parseLong(R02[1]);
                                        }
                                    } else {
                                        if (b10.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i12 = Integer.parseInt(b10.substring(b10.indexOf(58) + 1));
                                            hVar2 = hVar;
                                            gVar2 = gVar;
                                            str9 = str3;
                                            str8 = str13;
                                            str7 = str12;
                                            str5 = str2;
                                            z14 = true;
                                        } else if (b10.equals("#EXT-X-DISCONTINUITY")) {
                                            i14++;
                                        } else {
                                            if (b10.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j15 == 0) {
                                                    j15 = n0.C0(n0.J0(b10.substring(b10.indexOf(58) + 1))) - j19;
                                                } else {
                                                    i10 = i11;
                                                    hashMap = hashMap3;
                                                    arrayList2 = arrayList8;
                                                    arrayList3 = arrayList9;
                                                    arrayList4 = arrayList;
                                                    j10 = j20;
                                                }
                                            } else if (b10.equals("#EXT-X-GAP")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str9 = str3;
                                                str8 = str13;
                                                str7 = str12;
                                                str5 = str2;
                                                z16 = true;
                                            } else if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str9 = str3;
                                                str8 = str13;
                                                str7 = str12;
                                                str5 = str2;
                                                z12 = true;
                                            } else if (b10.equals("#EXT-X-ENDLIST")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str9 = str3;
                                                str8 = str13;
                                                str7 = str12;
                                                str5 = str2;
                                                z15 = true;
                                            } else {
                                                if (b10.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    i10 = i11;
                                                    arrayList5 = arrayList;
                                                    arrayList8.add(new g.c(Uri.parse(l0.d(str, z(b10, K, hashMap3))), t(b10, A, -1L), s(b10, B, -1)));
                                                } else {
                                                    i10 = i11;
                                                    arrayList5 = arrayList;
                                                    if (b10.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        if (bVar3 == null && "PART".equals(z(b10, N, hashMap3))) {
                                                            String z21 = z(b10, K, hashMap3);
                                                            long t10 = t(b10, F, -1L);
                                                            long t11 = t(b10, G, -1L);
                                                            long j30 = j20;
                                                            String e10 = e(j30, str12, str13);
                                                            if (drmInitData3 != null || treeMap.isEmpty()) {
                                                                j11 = j30;
                                                            } else {
                                                                j11 = j30;
                                                                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                DrmInitData drmInitData5 = new DrmInitData(str3, schemeDataArr);
                                                                if (drmInitData2 == null) {
                                                                    drmInitData2 = d(str3, schemeDataArr);
                                                                }
                                                                drmInitData3 = drmInitData5;
                                                            }
                                                            int i20 = (t10 > (-1L) ? 1 : (t10 == (-1L) ? 0 : -1));
                                                            if (i20 == 0 || t11 != -1) {
                                                                bVar3 = new g.b(z21, dVar, 0L, i14, j18, drmInitData3, str12, e10, i20 != 0 ? t10 : 0L, t11, false, false, true);
                                                            }
                                                            hVar2 = hVar;
                                                            gVar2 = gVar;
                                                            str9 = str3;
                                                            str7 = str12;
                                                            j20 = j11;
                                                            i11 = i10;
                                                            arrayList6 = arrayList5;
                                                            str5 = str2;
                                                            z11 = false;
                                                            str8 = str13;
                                                        }
                                                    } else {
                                                        j10 = j20;
                                                        if (b10.startsWith("#EXT-X-PART")) {
                                                            String e11 = e(j10, str12, str13);
                                                            String z22 = z(b10, K, hashMap3);
                                                            g.b bVar4 = bVar3;
                                                            ArrayList arrayList12 = arrayList8;
                                                            long j31 = (long) (j(b10, f35147n) * 1000000.0d);
                                                            ArrayList arrayList13 = arrayList9;
                                                            boolean q10 = q(b10, W, false) | (z12 && arrayList10.isEmpty());
                                                            boolean q11 = q(b10, X, false);
                                                            String v13 = v(b10, E, hashMap3);
                                                            if (v13 != null) {
                                                                String[] R03 = n0.R0(v13, "@");
                                                                j14 = Long.parseLong(R03[0]);
                                                                if (R03.length > 1) {
                                                                    j22 = Long.parseLong(R03[1]);
                                                                }
                                                            } else {
                                                                j14 = -1;
                                                            }
                                                            int i21 = (j14 > (-1L) ? 1 : (j14 == (-1L) ? 0 : -1));
                                                            if (i21 == 0) {
                                                                j22 = 0;
                                                            }
                                                            if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                                DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                DrmInitData drmInitData6 = new DrmInitData(str3, schemeDataArr2);
                                                                if (drmInitData2 == null) {
                                                                    drmInitData2 = d(str3, schemeDataArr2);
                                                                }
                                                                drmInitData3 = drmInitData6;
                                                            }
                                                            arrayList10.add(new g.b(z22, dVar, j31, i14, j18, drmInitData3, str12, e11, j22, j14, q11, q10, false));
                                                            j18 += j31;
                                                            if (i21 != 0) {
                                                                j22 += j14;
                                                            }
                                                            arrayList8 = arrayList12;
                                                            str7 = str12;
                                                            i11 = i10;
                                                            arrayList9 = arrayList13;
                                                            bVar3 = bVar4;
                                                            arrayList6 = arrayList5;
                                                            z11 = false;
                                                            j20 = j10;
                                                            str9 = str3;
                                                            str8 = str13;
                                                            str5 = str2;
                                                            hVar2 = hVar;
                                                            gVar2 = gVar;
                                                        } else {
                                                            bVar2 = bVar3;
                                                            arrayList2 = arrayList8;
                                                            arrayList3 = arrayList9;
                                                            if (b10.startsWith("#")) {
                                                                hashMap = hashMap3;
                                                                arrayList4 = arrayList5;
                                                            } else {
                                                                String e12 = e(j10, str12, str13);
                                                                long j32 = j10 + 1;
                                                                String B2 = B(b10, hashMap3);
                                                                g.d dVar4 = (g.d) hashMap4.get(B2);
                                                                int i22 = (j26 > (-1L) ? 1 : (j26 == (-1L) ? 0 : -1));
                                                                if (i22 == 0) {
                                                                    j12 = 0;
                                                                } else {
                                                                    if (z17 && dVar == null && dVar4 == null) {
                                                                        dVar4 = new g.d(B2, 0L, j17, null, null);
                                                                        hashMap4.put(B2, dVar4);
                                                                    }
                                                                    j12 = j17;
                                                                }
                                                                if (drmInitData3 != null || treeMap.isEmpty()) {
                                                                    j13 = j32;
                                                                    hashMap2 = hashMap3;
                                                                    drmInitData = drmInitData3;
                                                                } else {
                                                                    j13 = j32;
                                                                    hashMap2 = hashMap3;
                                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                    drmInitData = new DrmInitData(str3, schemeDataArr3);
                                                                    if (drmInitData2 == null) {
                                                                        drmInitData2 = d(str3, schemeDataArr3);
                                                                    }
                                                                }
                                                                arrayList5.add(new g.d(B2, dVar != null ? dVar : dVar4, str6, j21, i14, j19, drmInitData, str12, e12, j12, j26, z16, arrayList10));
                                                                j18 = j19 + j21;
                                                                arrayList10 = new ArrayList();
                                                                if (i22 != 0) {
                                                                    j12 += j26;
                                                                }
                                                                j17 = j12;
                                                                hVar2 = hVar;
                                                                gVar2 = gVar;
                                                                arrayList8 = arrayList2;
                                                                drmInitData3 = drmInitData;
                                                                str7 = str12;
                                                                j21 = 0;
                                                                j19 = j18;
                                                                hashMap3 = hashMap2;
                                                                i11 = i10;
                                                                bVar3 = bVar2;
                                                                str6 = str2;
                                                                z11 = false;
                                                                z16 = false;
                                                                j26 = -1;
                                                                arrayList6 = arrayList5;
                                                                str8 = str13;
                                                                j20 = j13;
                                                                arrayList9 = arrayList3;
                                                                str9 = str3;
                                                                str5 = str6;
                                                            }
                                                        }
                                                    }
                                                }
                                                hashMap = hashMap3;
                                                arrayList2 = arrayList8;
                                                arrayList3 = arrayList9;
                                                j10 = j20;
                                                arrayList4 = arrayList5;
                                            }
                                            bVar2 = bVar3;
                                        }
                                        arrayList6 = arrayList;
                                        z11 = false;
                                    }
                                    hVar2 = hVar;
                                    gVar2 = gVar;
                                    str9 = str3;
                                    str8 = str13;
                                    str7 = str12;
                                    str5 = str2;
                                    arrayList6 = arrayList;
                                    z11 = false;
                                }
                            }
                            arrayList8 = arrayList2;
                            str7 = str12;
                            hashMap3 = hashMap;
                            i11 = i10;
                            bVar3 = bVar2;
                            z11 = false;
                            j20 = j10;
                            arrayList6 = arrayList4;
                            str8 = str13;
                            arrayList9 = arrayList3;
                            hVar2 = hVar;
                            gVar2 = gVar;
                            str9 = str3;
                            str5 = str2;
                        }
                        str8 = str13;
                        str7 = str12;
                        arrayList6 = arrayList;
                        z11 = false;
                    }
                }
                arrayList6 = arrayList;
            }
        }
        int i23 = i11;
        g.b bVar5 = bVar3;
        ArrayList arrayList14 = arrayList8;
        ArrayList arrayList15 = arrayList9;
        ArrayList arrayList16 = arrayList6;
        HashMap hashMap5 = new HashMap();
        for (int i24 = 0; i24 < arrayList14.size(); i24++) {
            g.c cVar = (g.c) arrayList14.get(i24);
            long j33 = cVar.f35091b;
            if (j33 == -1) {
                j33 = (j16 + arrayList16.size()) - (arrayList10.isEmpty() ? 1L : 0L);
            }
            int i25 = cVar.f35092c;
            if (i25 == -1 && j25 != -9223372036854775807L) {
                i25 = (arrayList10.isEmpty() ? ((g.d) v.c(arrayList16)).f35094m : arrayList10).size() - 1;
            }
            Uri uri = cVar.f35090a;
            hashMap5.put(uri, new g.c(uri, j33, i25));
        }
        if (bVar5 != null) {
            arrayList10.add(bVar5);
        }
        return new g(i23, str, arrayList15, j23, z13, j15, z14, i12, j16, i13, j24, j25, z12, z15, j15 != 0, drmInitData2, arrayList16, arrayList10, fVar2, hashMap5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    private static h p(b bVar, String str) throws IOException {
        char c10;
        p1 p1Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        boolean z10;
        int i10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i11;
        int i12;
        ArrayList arrayList8;
        ArrayList arrayList9;
        float f10;
        ArrayList arrayList10;
        Uri e10;
        HashMap hashMap;
        int i13;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (bVar.a()) {
                String b10 = bVar.b();
                if (b10.startsWith("#EXT")) {
                    arrayList18.add(b10);
                }
                boolean startsWith = b10.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                boolean z13 = z11;
                if (b10.startsWith("#EXT-X-DEFINE")) {
                    hashMap3.put(z(b10, P, hashMap3), z(b10, Z, hashMap3));
                } else {
                    if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                        hashMap = hashMap2;
                        arrayList10 = arrayList16;
                        arrayList9 = arrayList12;
                        arrayList8 = arrayList13;
                        arrayList7 = arrayList14;
                        arrayList5 = arrayList15;
                        arrayList6 = arrayList18;
                        arrayList4 = arrayList17;
                        z11 = true;
                    } else if (b10.startsWith("#EXT-X-MEDIA")) {
                        arrayList16.add(b10);
                    } else if (b10.startsWith("#EXT-X-SESSION-KEY")) {
                        DrmInitData.SchemeData k10 = k(b10, u(b10, I, "identity", hashMap3), hashMap3);
                        if (k10 != null) {
                            arrayList17.add(new DrmInitData(l(z(b10, H, hashMap3)), k10));
                        }
                    } else if (b10.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                        boolean contains = z12 | b10.contains("CLOSED-CAPTIONS=NONE");
                        if (startsWith) {
                            i10 = 16384;
                            z10 = contains;
                        } else {
                            z10 = contains;
                            i10 = 0;
                        }
                        int m10 = m(b10, f35141h);
                        arrayList4 = arrayList17;
                        arrayList5 = arrayList15;
                        int s10 = s(b10, f35136c, -1);
                        String v10 = v(b10, f35143j, hashMap3);
                        arrayList6 = arrayList18;
                        String v11 = v(b10, f35144k, hashMap3);
                        if (v11 != null) {
                            arrayList7 = arrayList14;
                            String[] R0 = n0.R0(v11, "x");
                            int parseInt2 = Integer.parseInt(R0[0]);
                            int parseInt3 = Integer.parseInt(R0[1]);
                            if (parseInt2 <= 0 || parseInt3 <= 0) {
                                parseInt3 = -1;
                                i13 = -1;
                            } else {
                                i13 = parseInt2;
                            }
                            i12 = parseInt3;
                            i11 = i13;
                        } else {
                            arrayList7 = arrayList14;
                            i11 = -1;
                            i12 = -1;
                        }
                        arrayList8 = arrayList13;
                        String v12 = v(b10, f35145l, hashMap3);
                        if (v12 != null) {
                            arrayList9 = arrayList12;
                            f10 = Float.parseFloat(v12);
                        } else {
                            arrayList9 = arrayList12;
                            f10 = -1.0f;
                        }
                        String v13 = v(b10, f35137d, hashMap3);
                        arrayList10 = arrayList16;
                        String v14 = v(b10, f35138e, hashMap3);
                        HashMap hashMap4 = hashMap2;
                        String v15 = v(b10, f35139f, hashMap3);
                        String v16 = v(b10, f35140g, hashMap3);
                        if (startsWith) {
                            e10 = l0.e(str5, z(b10, K, hashMap3));
                        } else if (bVar.a()) {
                            e10 = l0.e(str5, B(bVar.b(), hashMap3));
                        } else {
                            throw j2.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        arrayList11.add(new h.b(e10, new p1.b().R(arrayList11.size()).K("application/x-mpegURL").I(v10).G(s10).Z(m10).j0(i11).Q(i12).P(f10).c0(i10).E(), v13, v14, v15, v16));
                        hashMap = hashMap4;
                        ArrayList arrayList19 = (ArrayList) hashMap.get(e10);
                        if (arrayList19 == null) {
                            arrayList19 = new ArrayList();
                            hashMap.put(e10, arrayList19);
                        }
                        arrayList19.add(new HlsTrackMetadataEntry.VariantInfo(s10, m10, v13, v14, v15, v16));
                        z11 = z13;
                        z12 = z10;
                    }
                    hashMap2 = hashMap;
                    arrayList17 = arrayList4;
                    arrayList15 = arrayList5;
                    arrayList18 = arrayList6;
                    arrayList14 = arrayList7;
                    arrayList13 = arrayList8;
                    arrayList12 = arrayList9;
                    arrayList16 = arrayList10;
                    str5 = str;
                }
                hashMap = hashMap2;
                arrayList10 = arrayList16;
                arrayList9 = arrayList12;
                arrayList8 = arrayList13;
                arrayList7 = arrayList14;
                arrayList5 = arrayList15;
                arrayList6 = arrayList18;
                arrayList4 = arrayList17;
                z11 = z13;
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            } else {
                HashMap hashMap5 = hashMap2;
                ArrayList arrayList20 = arrayList16;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList13;
                ArrayList arrayList23 = arrayList14;
                ArrayList arrayList24 = arrayList15;
                ArrayList arrayList25 = arrayList18;
                boolean z14 = z11;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                    h.b bVar2 = (h.b) arrayList11.get(i14);
                    if (hashSet.add(bVar2.f35125a)) {
                        ea.a.f(bVar2.f35126b.f32707j == null);
                        arrayList27.add(bVar2.a(bVar2.f35126b.b().X(new Metadata(new HlsTrackMetadataEntry(null, null, (List) ea.a.e((ArrayList) hashMap5.get(bVar2.f35125a))))).E()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList28 = null;
                p1 p1Var2 = null;
                int i15 = 0;
                while (i15 < arrayList20.size()) {
                    ArrayList arrayList29 = arrayList20;
                    String str7 = (String) arrayList29.get(i15);
                    String z15 = z(str7, Q, hashMap3);
                    String z16 = z(str7, P, hashMap3);
                    p1.b bVar3 = new p1.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(z15).length() + 1 + String.valueOf(z16).length());
                    sb2.append(z15);
                    sb2.append(":");
                    sb2.append(z16);
                    p1.b V2 = bVar3.S(sb2.toString()).U(z16).K(str6).g0(x(str7)).c0(w(str7, hashMap3)).V(v(str7, O, hashMap3));
                    String v17 = v(str7, K, hashMap3);
                    Uri e11 = v17 == null ? uri : l0.e(str, v17);
                    arrayList20 = arrayList29;
                    String str8 = str6;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(z15, z16, Collections.emptyList()));
                    String z17 = z(str7, M, hashMap3);
                    z17.hashCode();
                    switch (z17.hashCode()) {
                        case -959297733:
                            if (z17.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333210994:
                            if (z17.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62628790:
                            if (z17.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 81665115:
                            if (z17.equals("VIDEO")) {
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
                            p1Var = p1Var2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            h.b g10 = g(arrayList11, z15);
                            if (g10 != null) {
                                String L2 = n0.L(g10.f35126b.f32706i, 3);
                                V2.I(L2);
                                str2 = ea.v.g(L2);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            V2.e0(str2).X(metadata);
                            if (e11 != null) {
                                h.a aVar = new h.a(e11, V2.E(), z15, z16);
                                arrayList3 = arrayList23;
                                arrayList3.add(aVar);
                                break;
                            } else {
                                arrayList3 = arrayList23;
                                r.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            p1Var = p1Var2;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            String z18 = z(str7, S, hashMap3);
                            if (z18.startsWith("CC")) {
                                parseInt = Integer.parseInt(z18.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(z18.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList28 == null) {
                                arrayList28 = new ArrayList();
                            }
                            V2.e0(str3).F(parseInt);
                            arrayList28.add(V2.E());
                            arrayList3 = arrayList23;
                            break;
                        case 2:
                            arrayList2 = arrayList21;
                            h.b f11 = f(arrayList11, z15);
                            if (f11 != null) {
                                p1Var = p1Var2;
                                String L3 = n0.L(f11.f35126b.f32706i, 1);
                                V2.I(L3);
                                str4 = ea.v.g(L3);
                            } else {
                                p1Var = p1Var2;
                                str4 = null;
                            }
                            String v18 = v(str7, f35142i, hashMap3);
                            if (v18 != null) {
                                V2.H(Integer.parseInt(n0.S0(v18, "/")[0]));
                                if ("audio/eac3".equals(str4) && v18.endsWith("/JOC")) {
                                    V2.I("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            V2.e0(str4);
                            if (e11 != null) {
                                V2.X(metadata);
                                arrayList = arrayList22;
                                arrayList.add(new h.a(e11, V2.E(), z15, z16));
                            } else {
                                arrayList = arrayList22;
                                if (f11 != null) {
                                    p1Var = V2.E();
                                }
                            }
                            arrayList3 = arrayList23;
                            break;
                        case 3:
                            h.b h10 = h(arrayList11, z15);
                            if (h10 != null) {
                                p1 p1Var3 = h10.f35126b;
                                String L4 = n0.L(p1Var3.f32706i, 2);
                                V2.I(L4).e0(ea.v.g(L4)).j0(p1Var3.f32714q).Q(p1Var3.f32715r).P(p1Var3.f32716s);
                            }
                            if (e11 != null) {
                                V2.X(metadata);
                                arrayList2 = arrayList21;
                                arrayList2.add(new h.a(e11, V2.E(), z15, z16));
                                p1Var = p1Var2;
                                arrayList3 = arrayList23;
                                arrayList = arrayList22;
                                break;
                            }
                        default:
                            p1Var = p1Var2;
                            arrayList3 = arrayList23;
                            arrayList = arrayList22;
                            arrayList2 = arrayList21;
                            break;
                    }
                    i15++;
                    arrayList23 = arrayList3;
                    arrayList22 = arrayList;
                    arrayList21 = arrayList2;
                    str6 = str8;
                    p1Var2 = p1Var;
                    uri = null;
                }
                return new h(str, arrayList25, arrayList27, arrayList21, arrayList22, arrayList23, arrayList24, p1Var2, z12 ? Collections.emptyList() : arrayList28, z14, hashMap3, arrayList26);
            }
        }
    }

    private static boolean q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) ea.a.e(matcher.group(1))) : d10;
    }

    private static int s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) ea.a.e(matcher.group(1))) : i10;
    }

    private static long t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) ea.a.e(matcher.group(1))) : j10;
    }

    private static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) ea.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    private static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    private static int w(String str, Map<String, String> map) {
        String v10 = v(str, R, map);
        if (TextUtils.isEmpty(v10)) {
            return 0;
        }
        String[] R0 = n0.R0(v10, ",");
        int i10 = n0.s(R0, "public.accessibility.describes-video") ? AdRequest.MAX_CONTENT_URL_LENGTH : 0;
        if (n0.s(R0, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (n0.s(R0, "public.accessibility.describes-music-and-sound")) {
            i10 |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        }
        return n0.s(R0, "public.easy-to-read") ? i10 | Constants.BUFFER_SIZE : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int x(String str) {
        boolean q10 = q(str, U, false);
        ?? r02 = q10;
        if (q(str, V, false)) {
            r02 = (q10 ? 1 : 0) | true;
        }
        return q(str, T, false) ? r02 | 4 : r02;
    }

    private static g.f y(String str) {
        double r10 = r(str, f35151r, -9.223372036854776E18d);
        long j10 = r10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r10 * 1000000.0d);
        boolean q10 = q(str, f35152s, false);
        double r11 = r(str, f35154u, -9.223372036854776E18d);
        long j11 = r11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r11 * 1000000.0d);
        double r12 = r(str, f35155v, -9.223372036854776E18d);
        return new g.f(j10, q10, j11, r12 != -9.223372036854776E18d ? (long) (r12 * 1000000.0d) : -9223372036854775807L, q(str, f35156w, false));
    }

    private static String z(String str, Pattern pattern, Map<String, String> map) throws j2 {
        String v10 = v(str, pattern, map);
        if (v10 != null) {
            return v10;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb2 = new StringBuilder(String.valueOf(pattern2).length() + 19 + String.valueOf(str).length());
        sb2.append("Couldn't match ");
        sb2.append(pattern2);
        sb2.append(" in ");
        sb2.append(str);
        throw j2.c(sb2.toString(), null);
    }

    @Override // da.g0.a
    /* renamed from: i */
    public i a(Uri uri, InputStream inputStream) throws IOException {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (trim.startsWith("#EXT-X-STREAM-INF")) {
                                arrayDeque.add(trim);
                                return p(new b(arrayDeque, bufferedReader), uri.toString());
                            } else if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            } else {
                                arrayDeque.add(trim);
                            }
                        }
                    } else {
                        n0.n(bufferedReader);
                        throw j2.c("Failed to parse the playlist, could not identify any tags.", null);
                    }
                }
                arrayDeque.add(trim);
                return o(this.f35160a, this.f35161b, new b(arrayDeque, bufferedReader), uri.toString());
            }
            throw j2.c("Input does not start with the #EXTM3U header.", null);
        } finally {
            n0.n(bufferedReader);
        }
    }

    public j(h hVar, g gVar) {
        this.f35160a = hVar;
        this.f35161b = gVar;
    }
}
