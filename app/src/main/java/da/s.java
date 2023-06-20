package da;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import da.f;
import ea.y;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DefaultBandwidthMeter.java */
/* loaded from: classes2.dex */
public final class s implements f, m0 {

    /* renamed from: p */
    public static final jb.s<Long> f29255p = jb.s.w(5400000L, 3300000L, 2000000L, 1300000L, 760000L);

    /* renamed from: q */
    public static final jb.s<Long> f29256q = jb.s.w(1700000L, 820000L, 450000L, 180000L, 130000L);

    /* renamed from: r */
    public static final jb.s<Long> f29257r = jb.s.w(2300000L, 1300000L, 1000000L, 820000L, 570000L);

    /* renamed from: s */
    public static final jb.s<Long> f29258s = jb.s.w(3400000L, 2000000L, 1400000L, 1000000L, 620000L);

    /* renamed from: t */
    public static final jb.s<Long> f29259t = jb.s.w(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);

    /* renamed from: u */
    public static final jb.s<Long> f29260u = jb.s.w(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);

    /* renamed from: v */
    private static s f29261v;

    /* renamed from: a */
    private final jb.t<Integer, Long> f29262a;

    /* renamed from: b */
    private final f.a.C0368a f29263b;

    /* renamed from: c */
    private final k0 f29264c;

    /* renamed from: d */
    private final ea.c f29265d;

    /* renamed from: e */
    private final boolean f29266e;

    /* renamed from: f */
    private int f29267f;

    /* renamed from: g */
    private long f29268g;

    /* renamed from: h */
    private long f29269h;

    /* renamed from: i */
    private int f29270i;

    /* renamed from: j */
    private long f29271j;

    /* renamed from: k */
    private long f29272k;

    /* renamed from: l */
    private long f29273l;

    /* renamed from: m */
    private long f29274m;

    /* renamed from: n */
    private boolean f29275n;

    /* renamed from: o */
    private int f29276o;

    /* compiled from: DefaultBandwidthMeter.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final Context f29277a;

        /* renamed from: b */
        private Map<Integer, Long> f29278b;

        /* renamed from: c */
        private int f29279c;

        /* renamed from: d */
        private ea.c f29280d;

        /* renamed from: e */
        private boolean f29281e;

        public b(Context context) {
            this.f29277a = context == null ? null : context.getApplicationContext();
            this.f29278b = b(ea.n0.N(context));
            this.f29279c = 2000;
            this.f29280d = ea.c.f29651a;
            this.f29281e = true;
        }

        private static Map<Integer, Long> b(String str) {
            int[] l10 = s.l(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            jb.s<Long> sVar = s.f29255p;
            hashMap.put(2, sVar.get(l10[0]));
            hashMap.put(3, s.f29256q.get(l10[1]));
            hashMap.put(4, s.f29257r.get(l10[2]));
            hashMap.put(5, s.f29258s.get(l10[3]));
            hashMap.put(10, s.f29259t.get(l10[4]));
            hashMap.put(9, s.f29260u.get(l10[5]));
            hashMap.put(7, sVar.get(l10[0]));
            return hashMap;
        }

        public s a() {
            return new s(this.f29277a, this.f29278b, this.f29279c, this.f29280d, this.f29281e);
        }
    }

    public static /* synthetic */ void j(s sVar, int i10) {
        sVar.q(i10);
    }

    public static int[] l(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c10 = '\f';
                    break;
                }
                break;
            case IronSourceConstants.IS_CHECK_READY_FALSE /* 2102 */:
                if (str.equals("AW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case IronSourceConstants.IS_CHECK_CAPPED_TRUE /* 2103 */:
                if (str.equals("AX")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 15;
                    break;
                }
                break;
            case IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR /* 2111 */:
                if (str.equals("BA")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = '*';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = ',';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = ':';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ';';
                    break;
                }
                break;
            case IronSourceConstants.IS_INSTANCE_INIT_FAILED /* 2206 */:
                if (str.equals("EC")) {
                    c10 = '<';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '=';
                    break;
                }
                break;
            case IronSourceConstants.IS_INSTANCE_VISIBLE /* 2210 */:
                if (str.equals("EG")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL /* 2310 */:
                if (str.equals("HN")) {
                    c10 = '[';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = ']';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2346:
                if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 's';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = '{';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = '}';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = 128;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 129;
                    break;
                }
                break;
            case 2452:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    c10 = 130;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = 160;
                    break;
                }
                break;
            case IronSourceConstants.IS_INSTANCE_NOT_FOUND /* 2500 */:
                if (str.equals("NR")) {
                    c10 = 161;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c10 = 162;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = 163;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = 167;
                    break;
                }
                break;
            case 2551:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    c10 = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = 169;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = 174;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = 176;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c10 = 177;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = 182;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = 183;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = 189;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = 215;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 236;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 237;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 26:
            case 'P':
            case 'y':
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 3, 2};
            case 2:
            case ']':
            case 155:
            case 187:
            case DownloadResource.STATUS_QUEUED_FOR_WIFI /* 196 */:
            case 206:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 3:
                return new int[]{2, 3, 1, 2, 2, 2};
            case 4:
            case 25:
            case '3':
            case '9':
            case 'J':
            case 145:
            case 224:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 5:
            case 16:
            case 'u':
                return new int[]{1, 2, 0, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 4, 2, 2};
            case 7:
            case ',':
                return new int[]{3, 4, 3, 2, 2, 2};
            case '\b':
            case '?':
            case 'd':
            case 162:
            case DownloadResource.STATUS_PENDING /* 190 */:
            case DownloadResource.STATUS_DEVICE_NOT_FOUND_ERROR /* 199 */:
            case 216:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 4, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 2, 3, 2, 2};
            case 11:
            case '(':
            case 'g':
            case 188:
            case DownloadResource.STATUS_PAUSED_BY_APP /* 193 */:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 1, 0, 1, 2, 2};
            case '\r':
            case 'W':
                return new int[]{1, 2, 4, 4, 2, 2};
            case 14:
            case 'O':
            case 'z':
            case 142:
            case 172:
            case DownloadResource.STATUS_RUNNING /* 192 */:
            case DownloadResource.STATUS_WAITING_FOR_NETWORK /* 195 */:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 154:
                return new int[]{3, 2, 4, 4, 2, 2};
            case 17:
            case 'F':
            case 'M':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
            case 151:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 0, 3, 3, 2, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case '5':
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 2, 4, 4, 2};
            case 23:
            case ';':
            case 203:
            case 210:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 27:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 28:
                return new int[]{1, 3, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 30:
            case DownloadResource.STATUS_INSUFFICIENT_SPACE_ERROR /* 198 */:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 31:
                return new int[]{4, 2, 2, 3, 2, 2};
            case ' ':
                return new int[]{3, 1, 3, 2, 2, 2};
            case '!':
            case 'Y':
                return new int[]{3, 4, 1, 0, 2, 2};
            case '\"':
                return new int[]{0, 1, 1, 3, 2, 2};
            case '#':
                return new int[]{2, 4, 2, 2, 2, 2};
            case '$':
                return new int[]{0, 2, 1, 2, 4, 1};
            case '%':
                return new int[]{4, 2, 3, 1, 2, 2};
            case '&':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '\'':
            case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
                return new int[]{2, 4, 3, 4, 2, 2};
            case ')':
                return new int[]{3, 3, 3, 4, 2, 2};
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '+':
            case 171:
            case 221:
                return new int[]{1, 1, 2, 2, 3, 2};
            case '-':
                return new int[]{2, 0, 2, 2, 3, 1};
            case '.':
                return new int[]{2, 2, 4, 2, 2, 2};
            case '/':
                return new int[]{2, 2, 4, 4, 2, 2};
            case '0':
            case 168:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '1':
                return new int[]{2, 3, 1, 0, 2, 2};
            case '2':
                return new int[]{2, 2, 0, 0, 2, 2};
            case '4':
                return new int[]{1, 0, 0, 0, 1, 2};
            case '6':
                return new int[]{0, 0, 2, 2, 1, 2};
            case '7':
                return new int[]{4, 1, 4, 4, 2, 2};
            case '8':
                return new int[]{0, 0, 1, 0, 0, 2};
            case ':':
            case 'j':
                return new int[]{3, 4, 4, 4, 2, 2};
            case '<':
                return new int[]{2, 4, 2, 1, 2, 2};
            case '=':
            case '~':
            case 128:
            case 146:
                return new int[]{0, 0, 0, 0, 2, 2};
            case '>':
                return new int[]{3, 4, 2, 3, 2, 2};
            case '@':
            case '`':
                return new int[]{0, 1, 1, 1, 2, 2};
            case 'A':
                return new int[]{4, 4, 3, 1, 2, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 1, 3, 3, 2, 2};
            case 'D':
            case 'r':
            case 130:
            case 152:
            case 200:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{3, 2, 4, 2, 2, 2};
            case 'G':
                return new int[]{1, 1, 2, 1, 1, 1};
            case 'H':
                return new int[]{2, 3, 1, 1, 2, 2};
            case 'I':
                return new int[]{0, 0, 1, 1, 2, 3};
            case 'K':
                return new int[]{1, 1, 1, 3, 2, 2};
            case 'L':
            case 'S':
            case 143:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 'N':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'Q':
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'R':
                return new int[]{4, 3, 4, 2, 2, 2};
            case 'T':
                return new int[]{4, 2, 3, 4, 2, 2};
            case 'U':
            case '\\':
            case 132:
            case 137:
            case 181:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 'V':
                return new int[]{2, 3, 2, 1, 2, 2};
            case 'X':
            case 218:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 2, 3, 2, 0};
            case '[':
            case 170:
            case 197:
                return new int[]{3, 2, 3, 3, 2, 2};
            case '^':
                return new int[]{0, 0, 0, 1, 3, 2};
            case '_':
                return new int[]{3, 2, 3, 3, 3, 2};
            case 'a':
                return new int[]{1, 1, 2, 3, 4, 2};
            case 'b':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'c':
                return new int[]{1, 1, 3, 2, 4, 3};
            case 'e':
            case 220:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 'f':
                return new int[]{3, 0, 1, 1, 3, 0};
            case 'h':
                return new int[]{0, 1, 0, 1, 1, 2};
            case 'i':
                return new int[]{3, 2, 1, 2, 2, 2};
            case 'k':
            case 133:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 'l':
                return new int[]{0, 1, 0, 1, 1, 1};
            case 'm':
                return new int[]{3, 3, 2, 2, 2, 2};
            case 'n':
                return new int[]{2, 1, 1, 1, 2, 2};
            case 'o':
                return new int[]{1, 1, 4, 2, 2, 2};
            case 'p':
            case 'q':
            case 129:
            case 185:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 's':
                return new int[]{0, 0, 1, 3, 4, 4};
            case 't':
                return new int[]{1, 1, 0, 0, 0, 2};
            case 'v':
                return new int[]{1, 1, 2, 2, 2, 2};
            case 'w':
            case 222:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 'x':
                return new int[]{3, 2, 1, 4, 2, 2};
            case '{':
                return new int[]{3, 1, 3, 4, 4, 2};
            case '|':
                return new int[]{3, 4, 4, 3, 2, 2};
            case '}':
                return new int[]{3, 3, 4, 3, 2, 2};
            case 127:
                return new int[]{1, 0, 2, 2, 2, 2};
            case 131:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 134:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 135:
                return new int[]{3, 4, 2, 2, 2, 2};
            case 136:
                return new int[]{3, 2, 2, 4, 2, 2};
            case 138:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 139:
                return new int[]{2, 4, 3, 3, 2, 2};
            case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 144:
                return new int[]{4, 1, 3, 4, 2, 2};
            case 147:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 148:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 149:
                return new int[]{4, 2, 1, 0, 2, 2};
            case 153:
                return new int[]{4, 3, 2, 2, 2, 2};
            case 156:
                return new int[]{3, 4, 1, 1, 2, 2};
            case 157:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 158:
                return new int[]{0, 0, 3, 2, 0, 4};
            case 159:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 160:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 161:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 163:
                return new int[]{1, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 165:
                return new int[]{1, 3, 3, 3, 2, 2};
            case 166:
                return new int[]{2, 3, 4, 4, 4, 2};
            case 167:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 2, 3, 3, 3, 2};
            case 173:
                return new int[]{2, 3, 2, 2, 3, 3};
            case 174:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{0, 1, 0, 0, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 177:
                return new int[]{2, 2, 3, 2, 2, 2};
            case 178:
                return new int[]{2, 4, 2, 4, 4, 2};
            case 179:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 182:
                return new int[]{0, 0, 0, 1, 2, 2};
            case 183:
                return new int[]{3, 4, 3, 0, 2, 2};
            case 184:
            case 212:
            case 226:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 186:
                return new int[]{4, 3, 0, 2, 2, 2};
            case 189:
                return new int[]{1, 1, 2, 3, 1, 4};
            case DownloadResource.STATUS_WAITING_TO_RETRY /* 194 */:
                return new int[]{4, 3, 4, 1, 2, 2};
            case 201:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 202:
            case 205:
                return new int[]{2, 2, 1, 0, 2, 2};
            case 204:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 207:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 208:
                return new int[]{0, 3, 2, 3, 3, 0};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 213:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 214:
                return new int[]{1, 1, 0, 1, 2, 2};
            case 215:
                return new int[]{1, 4, 1, 1, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 219:
                return new int[]{0, 3, 1, 1, 2, 2};
            case 223:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 227:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 228:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 229:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 232:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 234:
                return new int[]{4, 1, 1, 1, 2, 2};
            case 235:
                return new int[]{3, 3, 1, 1, 1, 2};
            case 236:
                return new int[]{3, 3, 4, 2, 2, 2};
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long m(int i10) {
        Long l10 = this.f29262a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f29262a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized s n(Context context) {
        s sVar;
        synchronized (s.class) {
            if (f29261v == null) {
                f29261v = new b(context).a();
            }
            sVar = f29261v;
        }
        return sVar;
    }

    private static boolean o(p pVar, boolean z10) {
        return z10 && !pVar.d(8);
    }

    private void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f29274m) {
            return;
        }
        this.f29274m = j11;
        this.f29263b.c(i10, j10, j11);
    }

    public synchronized void q(int i10) {
        int i11 = this.f29270i;
        if (i11 == 0 || this.f29266e) {
            if (this.f29275n) {
                i10 = this.f29276o;
            }
            if (i11 == i10) {
                return;
            }
            this.f29270i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f29273l = m(i10);
                long elapsedRealtime = this.f29265d.elapsedRealtime();
                p(this.f29267f > 0 ? (int) (elapsedRealtime - this.f29268g) : 0, this.f29269h, this.f29273l);
                this.f29268g = elapsedRealtime;
                this.f29269h = 0L;
                this.f29272k = 0L;
                this.f29271j = 0L;
                this.f29264c.i();
            }
        }
    }

    @Override // da.f
    public /* synthetic */ long a() {
        return d.a(this);
    }

    @Override // da.m0
    public synchronized void b(l lVar, p pVar, boolean z10, int i10) {
        if (o(pVar, z10)) {
            this.f29269h += i10;
        }
    }

    @Override // da.f
    public m0 c() {
        return this;
    }

    @Override // da.m0
    public synchronized void d(l lVar, p pVar, boolean z10) {
        if (o(pVar, z10)) {
            ea.a.f(this.f29267f > 0);
            long elapsedRealtime = this.f29265d.elapsedRealtime();
            int i10 = (int) (elapsedRealtime - this.f29268g);
            this.f29271j += i10;
            long j10 = this.f29272k;
            long j11 = this.f29269h;
            this.f29272k = j10 + j11;
            if (i10 > 0) {
                this.f29264c.c((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
                if (this.f29271j >= Constants.MIN_PROGRESS_TIME || this.f29272k >= 524288) {
                    this.f29273l = this.f29264c.f(0.5f);
                }
                p(i10, this.f29269h, this.f29273l);
                this.f29268g = elapsedRealtime;
                this.f29269h = 0L;
            }
            this.f29267f--;
        }
    }

    @Override // da.m0
    public synchronized void e(l lVar, p pVar, boolean z10) {
        if (o(pVar, z10)) {
            if (this.f29267f == 0) {
                this.f29268g = this.f29265d.elapsedRealtime();
            }
            this.f29267f++;
        }
    }

    @Override // da.f
    public synchronized long f() {
        return this.f29273l;
    }

    @Override // da.f
    public void g(f.a aVar) {
        this.f29263b.e(aVar);
    }

    @Override // da.f
    public void h(Handler handler, f.a aVar) {
        ea.a.e(handler);
        ea.a.e(aVar);
        this.f29263b.b(handler, aVar);
    }

    @Override // da.m0
    public void i(l lVar, p pVar, boolean z10) {
    }

    private s(Context context, Map<Integer, Long> map, int i10, ea.c cVar, boolean z10) {
        this.f29262a = jb.t.d(map);
        this.f29263b = new f.a.C0368a();
        this.f29264c = new k0(i10);
        this.f29265d = cVar;
        this.f29266e = z10;
        if (context != null) {
            ea.y d10 = ea.y.d(context);
            int f10 = d10.f();
            this.f29270i = f10;
            this.f29273l = m(f10);
            d10.i(new y.c() { // from class: da.r
                @Override // ea.y.c
                public final void a(int i11) {
                    s.j(s.this, i11);
                }
            });
            return;
        }
        this.f29270i = 0;
        this.f29273l = m(0);
    }
}
