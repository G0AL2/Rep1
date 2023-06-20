package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.d0;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends d0> extends BaseJavaModule {
    protected void addEventEmitters(n0 n0Var, T t10) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public T createView(int i10, n0 n0Var, f0 f0Var, m0 m0Var, v6.a aVar) {
        T createViewInstance = createViewInstance(i10, n0Var, f0Var, m0Var);
        if (createViewInstance instanceof v6.d) {
            ((v6.d) createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return createViewInstance;
    }

    protected T createViewInstance(int i10, n0 n0Var, f0 f0Var, m0 m0Var) {
        Object updateState;
        T createViewInstance = createViewInstance(n0Var);
        createViewInstance.setId(i10);
        addEventEmitters(n0Var, createViewInstance);
        if (f0Var != null) {
            updateProperties(createViewInstance, f0Var);
        }
        if (m0Var != null && (updateState = updateState(createViewInstance, f0Var, m0Var)) != null) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    protected abstract T createViewInstance(n0 n0Var);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a1<T> getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return b1.e(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, com.facebook.yoga.n nVar, float f11, com.facebook.yoga.n nVar2, float[] fArr) {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t10) {
    }

    public void onDropViewInstance(T t10) {
    }

    @Deprecated
    public void receiveCommand(T t10, int i10, ReadableArray readableArray) {
    }

    public void receiveCommand(T t10, String str, ReadableArray readableArray) {
    }

    public void setPadding(T t10, int i10, int i11, int i12, int i13) {
    }

    public abstract void updateExtraData(T t10, Object obj);

    public void updateProperties(T t10, f0 f0Var) {
        a1<T> delegate = getDelegate();
        if (delegate != null) {
            b1.h(delegate, t10, f0Var);
        } else {
            b1.g(this, t10, f0Var);
        }
        onAfterUpdateTransaction(t10);
    }

    public Object updateState(T t10, f0 f0Var, m0 m0Var) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }
}
