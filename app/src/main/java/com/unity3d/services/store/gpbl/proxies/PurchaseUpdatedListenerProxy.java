package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.listeners.IPurchaseUpdatedResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o2.h;

/* loaded from: classes3.dex */
public class PurchaseUpdatedListenerProxy extends GenericListenerProxy {
    private static final String onPurchasesUpdatedMethodName = "onPurchasesUpdated";
    private IPurchaseUpdatedResponseListener _purchaseUpdatedResponseListener;

    public PurchaseUpdatedListenerProxy(IPurchaseUpdatedResponseListener iPurchaseUpdatedResponseListener) {
        this._purchaseUpdatedResponseListener = iPurchaseUpdatedResponseListener;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return h.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals(onPurchasesUpdatedMethodName)) {
            onPurchasesUpdated(objArr[0], (List) objArr[1]);
            return null;
        }
        return super.invoke(obj, method, objArr);
    }

    public void onPurchasesUpdated(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                arrayList.add(new PurchaseBridge(obj2));
            }
        } else {
            arrayList = null;
        }
        IPurchaseUpdatedResponseListener iPurchaseUpdatedResponseListener = this._purchaseUpdatedResponseListener;
        if (iPurchaseUpdatedResponseListener != null) {
            iPurchaseUpdatedResponseListener.onBillingResponse(new BillingResultBridge(obj), arrayList);
        }
    }
}
