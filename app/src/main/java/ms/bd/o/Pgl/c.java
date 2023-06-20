package ms.bd.o.Pgl;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {
    public static final int CLIENT_TYPE_BUSINESS = 1;
    public static final int CLIENT_TYPE_INHOUSE = 0;
    public static final int CLIENT_TYPE_UNKNOWN = -1;
    public static final int COLLECT_MODE_DEFAULT = 99999;
    public static final int COLLECT_MODE_FINANCE = 300;
    public static final int COLLECT_MODE_HELO = 315;
    public static final int COLLECT_MODE_MINIMIZE = 5;
    public static final int COLLECT_MODE_ML_MINIMIZE = 290;
    public static final int COLLECT_MODE_ML_PGL_AL = 810;
    public static final int COLLECT_MODE_ML_TEEN = 280;
    public static final int COLLECT_MODE_OV_MINIMIZE = 5;
    public static final int COLLECT_MODE_RESSO = 315;
    public static final int COLLECT_MODE_TIKTOK = 503;
    public static final int COLLECT_MODE_TIKTOKLITE = 330;
    public static final int COLLECT_MODE_TIKTOK_BASE = 10;
    public static final int COLLECT_MODE_TIKTOK_GUEST = 504;
    public static final int COLLECT_MODE_TIKTOK_INIT = 5;
    public static final int COLLECT_MODE_TIKTOK_NONUSEA = 603;
    public static final int COLLECT_MODE_TIKTOK_U13 = 10;
    public static final int COLLECT_MODE_TIKTOK_USEA = 503;
    public static final int COLLECT_MODE_TIKTOK_USUNREGISTER = 10;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a  reason: collision with root package name */
    protected String f34515a = "";

    /* renamed from: b  reason: collision with root package name */
    protected String f34516b = "";

    /* renamed from: c  reason: collision with root package name */
    protected String f34517c = "";

    /* renamed from: d  reason: collision with root package name */
    protected String f34518d = "";

    /* renamed from: e  reason: collision with root package name */
    protected String f34519e = "";

    /* renamed from: f  reason: collision with root package name */
    protected String f34520f = "";

    /* renamed from: g  reason: collision with root package name */
    protected String f34521g = "";

    /* renamed from: h  reason: collision with root package name */
    protected String f34522h = "";

    /* renamed from: i  reason: collision with root package name */
    protected String f34523i = "";

    /* renamed from: j  reason: collision with root package name */
    protected int f34524j = -1;

    /* renamed from: k  reason: collision with root package name */
    protected int f34525k = -1;

    /* renamed from: l  reason: collision with root package name */
    protected int f34526l = COLLECT_MODE_DEFAULT;

    /* renamed from: m  reason: collision with root package name */
    protected Map<String, String> f34527m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    protected Map<String, String> f34528n = new HashMap();

    /* loaded from: classes3.dex */
    public interface pblb {
    }

    /* loaded from: classes3.dex */
    public static abstract class pgla<T extends pblb> extends c implements pblb {
        public pgla(String str, String str2) {
            this(str, str2, (int) c.COLLECT_MODE_DEFAULT);
        }

        public pgla(String str, String str2, int i10) {
            this.f34515a = str;
            this.f34523i = str2;
            this.f34526l = i10;
            if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("appID or license must be set.");
            }
        }

        public pgla(String str, String str2, String str3) {
            this(str, str2, str3, c.COLLECT_MODE_DEFAULT);
        }

        public pgla(String str, String str2, String str3, int i10) {
            this.f34521g = str;
            this.f34522h = str2;
            this.f34523i = str3;
            this.f34526l = i10;
            if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("sdkID or license must be set.");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public c a() {
            if (this.f34524j != -1) {
                return this;
            }
            throw new IllegalArgumentException("MSConfig init error");
        }

        public T addAdvanceInfo0(String str, String str2) {
            this.f34528n.put(str, str2);
            return this;
        }

        public T setBDDeviceID0(String str) {
            this.f34518d = str;
            return this;
        }

        public T setChannel0(String str) {
            this.f34516b = str;
            return this;
        }

        public T setClientType0(int i10) {
            this.f34524j = i10;
            return this;
        }

        public T setCustomInfo0(Map<String, String> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            this.f34527m = map;
            return this;
        }

        public T setDeviceID0(String str) {
            this.f34517c = str;
            return this;
        }

        public T setInstallID0(String str) {
            this.f34519e = str;
            return this;
        }

        public T setOVRegionType0(int i10) {
            this.f34525k = i10;
            return this;
        }

        public T setSecssionID0(String str) {
            this.f34520f = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(Object obj) {
        return (obj == null || !(obj instanceof String)) ? "" : ((String) obj).trim();
    }
}
