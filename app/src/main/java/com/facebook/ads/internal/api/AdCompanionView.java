package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: classes.dex */
public class AdCompanionView extends AdComponentFrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private AdCompanionViewApi f14437a;

    public AdCompanionView(Context context) {
        super(context);
        initializeSelf(context);
    }

    private void initializeSelf(Context context) {
        AdCompanionViewApi createAdCompanionViewApi = DynamicLoaderFactory.makeLoader(context).createAdCompanionViewApi();
        this.f14437a = createAdCompanionViewApi;
        attachAdComponentViewApi(createAdCompanionViewApi);
        this.f14437a.initialize(this);
    }

    public AdCompanionViewApi getAdCompanionViewApi() {
        return this.f14437a;
    }

    public AdCompanionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public AdCompanionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initializeSelf(context);
    }
}
