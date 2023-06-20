package com.inmobi.unifiedId;

import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.hh;
import com.inmobi.media.ho;
import com.inmobi.media.ig;
import com.inmobi.media.jj;
import com.inmobi.media.jk;
import com.inmobi.media.jl;
import com.inmobi.media.jm;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class InMobiUnifiedIdService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26045a = "InMobiUnifiedIdService";

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f26046b = new AtomicBoolean();

    private InMobiUnifiedIdService() {
    }

    public static void a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        hh.a().a("FetchApiInvoked", new HashMap());
        if (jl.c()) {
            jl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
        } else if (jl.b()) {
            jl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
        } else if (ig.b()) {
            jl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
        } else {
            synchronized (jm.class) {
                if (jm.c()) {
                    jm.a(inMobiUnifiedIdInterface);
                } else {
                    JSONObject a10 = jk.a();
                    if (!jl.b(a10) && jl.a(a10)) {
                        jm.a(inMobiUnifiedIdInterface);
                    } else if (inMobiUnifiedIdInterface != null) {
                        if (jl.b(a10)) {
                            if (f26046b.get()) {
                                jm.a(inMobiUnifiedIdInterface);
                            } else {
                                jl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
                            }
                        } else {
                            jl.a(inMobiUnifiedIdInterface, a10, null);
                        }
                    }
                }
            }
        }
    }

    public static void fetchUnifiedIds(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (ho.a()) {
            ho.a(new Runnable() { // from class: com.inmobi.unifiedId.InMobiUnifiedIdService.2
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiUnifiedIdService.a(InMobiUnifiedIdInterface.this);
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f26045a);
    }

    public static AtomicBoolean getIsPushCalled() {
        return f26046b;
    }

    public static void push(final InMobiUserDataModel inMobiUserDataModel) {
        if (ho.a()) {
            ho.a(new Runnable() { // from class: com.inmobi.unifiedId.InMobiUnifiedIdService.1
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiUnifiedIdService.a(InMobiUserDataModel.this);
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f26045a);
    }

    public static void reset() {
        if (ho.a()) {
            ho.a(new Runnable() { // from class: com.inmobi.unifiedId.InMobiUnifiedIdService.3
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiUnifiedIdService.a();
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f26045a);
    }

    static /* synthetic */ void a(InMobiUserDataModel inMobiUserDataModel) {
        if (jl.c() || jl.b() || ig.b()) {
            return;
        }
        if (jj.b(inMobiUserDataModel) && f26046b.get()) {
            return;
        }
        jj.a(inMobiUserDataModel);
        f26046b.set(true);
        jm.a();
    }

    static /* synthetic */ void a() {
        f26046b.set(false);
        jj.a((InMobiUserDataModel) null);
        jm.b();
        jk.d();
    }
}
