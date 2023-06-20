package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.inmobi.media.er;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.Map;

/* compiled from: OmidTrackedHtmlAd.java */
/* loaded from: classes3.dex */
public class eo extends dv {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25274d = "eo";

    /* renamed from: e  reason: collision with root package name */
    private final dw f25275e;

    /* renamed from: f  reason: collision with root package name */
    private ek f25276f;

    public eo(j jVar, dw dwVar, ek ekVar) {
        super(jVar);
        this.f25275e = dwVar;
        this.f25276f = ekVar;
    }

    public static ek a(String str, q qVar, boolean z10, String str2, byte b10, String str3) {
        ImpressionType impressionType;
        AdSessionContext a10 = a(qVar, str2, str3);
        switch (b10) {
            case 1:
                impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
                break;
            case 2:
                impressionType = ImpressionType.UNSPECIFIED;
                break;
            case 3:
                impressionType = ImpressionType.LOADED;
                break;
            case 4:
                impressionType = ImpressionType.BEGIN_TO_RENDER;
                break;
            case 5:
                impressionType = ImpressionType.ONE_PIXEL;
                break;
            case 6:
                impressionType = ImpressionType.VIEWABLE;
                break;
            case 7:
                impressionType = ImpressionType.AUDIBLE;
                break;
            default:
                impressionType = ImpressionType.OTHER;
                break;
        }
        char c10 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -284840886) {
            if (hashCode != 112202875) {
                if (hashCode == 1425678798 && str.equals("nonvideo")) {
                    c10 = 2;
                }
            } else if (str.equals(DownloadResource.TYPE_VIDEO)) {
                c10 = 3;
            }
        } else if (str.equals(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN)) {
            c10 = 1;
        }
        if (c10 != 2) {
            if (c10 != 3) {
                return null;
            }
            return new el("html_video_ad", impressionType, a10, z10);
        }
        return new el("html_display_ad", impressionType, a10);
    }

    @Override // com.inmobi.media.dw
    public final View b() {
        return this.f25275e.b();
    }

    @Override // com.inmobi.media.dw
    public final View c() {
        return this.f25275e.c();
    }

    @Override // com.inmobi.media.dw
    public final void d() {
        try {
            this.f25276f.a();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f25275e.d();
            throw th;
        }
        this.f25275e.d();
    }

    @Override // com.inmobi.media.dw
    public final void e() {
        super.e();
        try {
            this.f25276f = null;
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f25275e.e();
            throw th;
        }
        this.f25275e.e();
    }

    @Override // com.inmobi.media.dw
    public final View a(View view, ViewGroup viewGroup, boolean z10) {
        return this.f25275e.a(view, viewGroup, z10);
    }

    @Override // com.inmobi.media.dw
    public final void a(byte b10) {
        this.f25275e.a(b10);
    }

    @Override // com.inmobi.media.dw
    public final void a(Context context, byte b10) {
        this.f25275e.a(context, b10);
    }

    public static AdSessionContext a(q qVar, String str, String str2) {
        if (qVar != null) {
            return er.a.f25286a.a(qVar, str, str2);
        }
        return null;
    }

    @Override // com.inmobi.media.dw
    public final void a(Map<View, FriendlyObstructionPurpose> map) {
        View view;
        try {
            if (this.f25182c.viewability.omidConfig.omidEnabled && er.a.f25286a.a()) {
                j jVar = this.f25180a;
                if (jVar instanceof n) {
                    n nVar = (n) jVar;
                    view = nVar.f25915t;
                    if (view == null) {
                        view = nVar.f25916u;
                    }
                } else {
                    view = this.f25275e.b() instanceof WebView ? (WebView) this.f25275e.b() : null;
                }
                if (view != null) {
                    this.f25276f.a(view, map, null);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f25275e.a(map);
            throw th;
        }
        this.f25275e.a(map);
    }
}
