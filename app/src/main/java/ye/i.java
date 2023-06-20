package ye;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: CipherSuite.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<String> f39677b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, i> f39678c;

    /* renamed from: d  reason: collision with root package name */
    public static final i f39679d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f39680e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f39681f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f39682g;

    /* renamed from: h  reason: collision with root package name */
    public static final i f39683h;

    /* renamed from: i  reason: collision with root package name */
    public static final i f39684i;

    /* renamed from: j  reason: collision with root package name */
    public static final i f39685j;

    /* renamed from: k  reason: collision with root package name */
    public static final i f39686k;

    /* renamed from: l  reason: collision with root package name */
    public static final i f39687l;

    /* renamed from: m  reason: collision with root package name */
    public static final i f39688m;

    /* renamed from: n  reason: collision with root package name */
    public static final i f39689n;

    /* renamed from: o  reason: collision with root package name */
    public static final i f39690o;

    /* renamed from: p  reason: collision with root package name */
    public static final i f39691p;

    /* renamed from: q  reason: collision with root package name */
    public static final i f39692q;

    /* renamed from: r  reason: collision with root package name */
    public static final i f39693r;

    /* renamed from: s  reason: collision with root package name */
    public static final i f39694s;

    /* renamed from: t  reason: collision with root package name */
    public static final b f39695t;

    /* renamed from: a  reason: collision with root package name */
    private final String f39696a;

    /* compiled from: CipherSuite.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            qe.k.f(str, "a");
            qe.k.f(str2, "b");
            int min = Math.min(str.length(), str2.length());
            for (int i10 = 4; i10 < min; i10++) {
                char charAt = str.charAt(i10);
                char charAt2 = str2.charAt(i10);
                if (charAt != charAt2) {
                    return qe.k.h(charAt, charAt2) < 0 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* compiled from: CipherSuite.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i d(String str, int i10) {
            i iVar = new i(str, null);
            i.f39678c.put(str, iVar);
            return iVar;
        }

        private final String e(String str) {
            boolean y10;
            boolean y11;
            y10 = ve.p.y(str, "TLS_", false, 2, null);
            if (y10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SSL_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(4);
                qe.k.e(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                return sb2.toString();
            }
            y11 = ve.p.y(str, "SSL_", false, 2, null);
            if (y11) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("TLS_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring2 = str.substring(4);
                qe.k.e(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                return sb3.toString();
            }
            return str;
        }

        public final synchronized i b(String str) {
            i iVar;
            qe.k.f(str, "javaName");
            iVar = (i) i.f39678c.get(str);
            if (iVar == null) {
                iVar = (i) i.f39678c.get(e(str));
                if (iVar == null) {
                    iVar = new i(str, null);
                }
                i.f39678c.put(str, iVar);
            }
            return iVar;
        }

        public final Comparator<String> c() {
            return i.f39677b;
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    static {
        b bVar = new b(null);
        f39695t = bVar;
        f39677b = new a();
        f39678c = new LinkedHashMap();
        bVar.d("SSL_RSA_WITH_NULL_MD5", 1);
        bVar.d("SSL_RSA_WITH_NULL_SHA", 2);
        bVar.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        bVar.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        bVar.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        bVar.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        bVar.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f39679d = bVar.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        bVar.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        bVar.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        bVar.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        bVar.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        bVar.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        bVar.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        bVar.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        bVar.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        bVar.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        bVar.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        bVar.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        bVar.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        bVar.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        bVar.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        bVar.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        bVar.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        bVar.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        bVar.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f39680e = bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f39681f = bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        bVar.d("TLS_RSA_WITH_NULL_SHA256", 59);
        bVar.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        bVar.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        bVar.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        bVar.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        bVar.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        bVar.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        bVar.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        bVar.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        bVar.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        bVar.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        bVar.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        bVar.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        bVar.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        bVar.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        bVar.d("TLS_PSK_WITH_AES_128_CBC_SHA", IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);
        bVar.d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        bVar.d("TLS_RSA_WITH_SEED_CBC_SHA", IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        f39682g = bVar.d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f39683h = bVar.d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        bVar.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        bVar.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        bVar.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        bVar.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        bVar.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        bVar.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        bVar.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        bVar.d("TLS_FALLBACK_SCSV", 22016);
        bVar.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        bVar.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        bVar.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        bVar.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        bVar.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        bVar.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        bVar.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        bVar.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        bVar.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        bVar.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        bVar.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        bVar.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        bVar.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        bVar.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f39684i = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f39685j = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        bVar.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        bVar.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        bVar.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        bVar.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        bVar.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        bVar.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        bVar.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        bVar.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        bVar.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f39686k = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f39687l = bVar.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        bVar.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        bVar.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f39688m = bVar.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f39689n = bVar.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        bVar.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        bVar.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        bVar.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        bVar.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f39690o = bVar.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f39691p = bVar.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        bVar.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        bVar.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f39692q = bVar.d("TLS_AES_128_GCM_SHA256", 4865);
        f39693r = bVar.d("TLS_AES_256_GCM_SHA384", 4866);
        f39694s = bVar.d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        bVar.d("TLS_AES_128_CCM_SHA256", 4868);
        bVar.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private i(String str) {
        this.f39696a = str;
    }

    public final String c() {
        return this.f39696a;
    }

    public String toString() {
        return this.f39696a;
    }

    public /* synthetic */ i(String str, qe.g gVar) {
        this(str);
    }
}
