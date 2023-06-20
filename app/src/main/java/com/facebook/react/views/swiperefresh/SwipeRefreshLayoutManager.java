package com.facebook.react.views.swiperefresh;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c7.e;
import c7.f;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a1;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import fm.castbox.mediation.BuildConfig;
import java.util.HashMap;
import java.util.Map;

@o6.a(name = SwipeRefreshLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager<com.facebook.react.views.swiperefresh.a> implements f<com.facebook.react.views.swiperefresh.a> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final a1<com.facebook.react.views.swiperefresh.a> mDelegate = new e(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements SwipeRefreshLayout.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n0 f16178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.swiperefresh.a f16179b;

        a(SwipeRefreshLayoutManager swipeRefreshLayoutManager, n0 n0Var, com.facebook.react.views.swiperefresh.a aVar) {
            this.f16178a = n0Var;
            this.f16179b = aVar;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            d c10 = t0.c(this.f16178a, this.f16179b.getId());
            if (c10 != null) {
                c10.g(new b(t0.f(this.f16179b), this.f16179b.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a1<com.facebook.react.views.swiperefresh.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(h6.e.a().b("topRefresh", h6.e.d("registrationName", "onRefresh")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return h6.e.d("SIZE", h6.e.e("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.swiperefresh.a aVar) {
        aVar.setOnRefreshListener(new a(this, n0Var, aVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.swiperefresh.a createViewInstance(n0 n0Var) {
        return new com.facebook.react.views.swiperefresh.a(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.swiperefresh.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing") && readableArray != null) {
            setRefreshing(aVar, readableArray.getBoolean(0));
        }
    }

    @Override // c7.f
    @w6.a(customType = "ColorArray", name = "colors")
    public void setColors(com.facebook.react.views.swiperefresh.a aVar, ReadableArray readableArray) {
        if (readableArray != null) {
            int[] iArr = new int[readableArray.size()];
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                if (readableArray.getType(i10) == ReadableType.Map) {
                    iArr[i10] = ColorPropConverter.getColor(readableArray.getMap(i10), aVar.getContext()).intValue();
                } else {
                    iArr[i10] = readableArray.getInt(i10);
                }
            }
            aVar.setColorSchemeColors(iArr);
            return;
        }
        aVar.setColorSchemeColors(new int[0]);
    }

    @Override // c7.f
    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "enabled")
    public void setEnabled(com.facebook.react.views.swiperefresh.a aVar, boolean z10) {
        aVar.setEnabled(z10);
    }

    @Override // c7.f
    public void setNativeRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z10) {
        setRefreshing(aVar, z10);
    }

    @Override // c7.f
    @w6.a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(com.facebook.react.views.swiperefresh.a aVar, Integer num) {
        aVar.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @Override // c7.f
    @w6.a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(com.facebook.react.views.swiperefresh.a aVar, float f10) {
        aVar.setProgressViewOffset(f10);
    }

    @Override // c7.f
    @w6.a(name = "refreshing")
    public void setRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z10) {
        aVar.setRefreshing(z10);
    }

    public void setSize(com.facebook.react.views.swiperefresh.a aVar, int i10) {
        aVar.setSize(i10);
    }

    @Override // c7.f
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, String str) {
        if (str != null && !str.equals("default")) {
            if (str.equals("large")) {
                aVar.setSize(0);
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + str);
        }
        aVar.setSize(1);
    }

    @w6.a(name = "size")
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.setSize(1);
        } else if (dynamic.getType() == ReadableType.Number) {
            aVar.setSize(dynamic.asInt());
        } else if (dynamic.getType() == ReadableType.String) {
            setSize(aVar, dynamic.asString());
        } else {
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
    }
}
