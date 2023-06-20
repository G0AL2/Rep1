package com.fyber.inneractive.sdk.interfaces;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;

/* loaded from: classes.dex */
public interface c extends InneractiveAdRenderer {

    /* loaded from: classes.dex */
    public interface a {
        void destroy();

        void disableCloseButton();

        void dismissAd(boolean z10);

        View getCloseButton();

        ViewGroup getLayout();

        boolean isCloseButtonDisplay();

        void setActivityOrientation(boolean z10, Orientation orientation);

        void showCloseButton(boolean z10, int i10, int i11);

        void showCloseCountdown();

        void updateCloseCountdown(int i10);

        boolean wasDismissedByUser();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    void a(a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException;

    void a(b bVar);

    void b();

    void c(boolean z10);

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    void destroy();

    void m();

    void o();

    void s();

    boolean u();
}
