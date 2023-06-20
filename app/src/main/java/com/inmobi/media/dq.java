package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* compiled from: VastProcessor.java */
/* loaded from: classes3.dex */
public class dq {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25155b = "dq";

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f25156a;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, List<WeakReference<dr>>> f25157c;

    /* compiled from: VastProcessor.java */
    /* loaded from: classes3.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final dq f25167a = new dq((byte) 0);
    }

    /* synthetic */ dq(byte b10) {
        this();
    }

    public static dq a() {
        return a.f25167a;
    }

    private dq() {
        this.f25156a = Executors.newCachedThreadPool(new ht(f25155b));
        this.f25157c = new HashMap<>(2);
    }

    private synchronized boolean a(String str, dr drVar) {
        List<WeakReference<dr>> list = this.f25157c.get(str);
        if (list != null) {
            list.add(new WeakReference<>(drVar));
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(drVar));
        this.f25157c.put(str, arrayList);
        return true;
    }

    private synchronized void a(final au auVar, final boolean z10, final byte b10) {
        List<WeakReference<dr>> remove = this.f25157c.remove(auVar.f());
        if (remove != null) {
            for (WeakReference<dr> weakReference : remove) {
                final dr drVar = weakReference.get();
                if (drVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.dq.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            drVar.a(auVar, z10, b10);
                        }
                    });
                }
            }
        }
    }

    static /* synthetic */ void a(dq dqVar, au auVar, fq fqVar, dr drVar) {
        try {
            if (dqVar.a(auVar.f(), drVar)) {
                au a10 = ay.a(auVar, fqVar);
                if (a10 == null) {
                    dqVar.a(auVar, false, (byte) 75);
                } else {
                    dqVar.a(a10, true, (byte) 0);
                }
            }
        } catch (br e10) {
            int i10 = e10.f24806a;
            if (i10 == 100) {
                e10.f24807b = (byte) 59;
            } else if (i10 == 101) {
                e10.f24807b = (byte) 69;
            } else if (i10 == 201) {
                e10.f24807b = (byte) 71;
            } else if (i10 == 405) {
                e10.f24807b = (byte) 66;
            } else if (i10 == 900) {
                e10.f24807b = (byte) 70;
            } else if (i10 == 600) {
                e10.f24807b = (byte) 61;
            } else if (i10 == 601) {
                e10.f24807b = (byte) 23;
            } else if (i10 == 603) {
                e10.f24807b = (byte) 60;
            } else if (i10 != 604) {
                switch (i10) {
                    case ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE /* 300 */:
                        e10.f24807b = (byte) 63;
                        break;
                    case 301:
                        e10.f24807b = (byte) 72;
                        break;
                    case IronSourceConstants.OFFERWALL_AVAILABLE /* 302 */:
                        e10.f24807b = (byte) 73;
                        break;
                    case 303:
                        e10.f24807b = (byte) 74;
                        break;
                    default:
                        switch (i10) {
                            case DownloadResource.STATUS_BAD_REQUEST /* 400 */:
                                e10.f24807b = (byte) 62;
                                break;
                            case TTAdConstant.MATE_IS_NULL_CODE /* 401 */:
                                e10.f24807b = (byte) 64;
                                break;
                            case TTAdConstant.AD_ID_IS_NULL_CODE /* 402 */:
                                e10.f24807b = (byte) 65;
                                break;
                            case TTAdConstant.DEEPLINK_UNAVAILABLE_CODE /* 403 */:
                                e10.f24807b = (byte) 68;
                                break;
                            default:
                                e10.f24807b = (byte) 0;
                                break;
                        }
                }
            } else {
                e10.f24807b = (byte) 67;
            }
            dqVar.a(auVar, false, e10.f24807b);
        } catch (JSONException unused) {
            dqVar.a(auVar, false, (byte) 58);
        }
    }
}
