package com.facebook.react.uimanager;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UIManagerModuleConstants.java */
/* loaded from: classes.dex */
class u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map a() {
        return h6.e.a().b("topChange", h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onChange", "captured", "onChangeCapture"))).b("topSelect", h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b(com.facebook.react.uimanager.events.l.a(com.facebook.react.uimanager.events.l.START), h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).b(com.facebook.react.uimanager.events.l.a(com.facebook.react.uimanager.events.l.MOVE), h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).b(com.facebook.react.uimanager.events.l.a(com.facebook.react.uimanager.events.l.END), h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).b(com.facebook.react.uimanager.events.l.a(com.facebook.react.uimanager.events.l.CANCEL), h6.e.d("phasedRegistrationNames", h6.e.e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map<String, Object> b() {
        HashMap b10 = h6.e.b();
        b10.put("UIView", h6.e.d("ContentMode", h6.e.f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        b10.put("StyleConstants", h6.e.d("PointerEventsValues", h6.e.g("none", Integer.valueOf(s.NONE.ordinal()), "boxNone", Integer.valueOf(s.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(s.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(s.AUTO.ordinal()))));
        b10.put("PopupMenu", h6.e.e("dismissed", "dismissed", "itemSelected", "itemSelected"));
        b10.put("AccessibilityEventTypes", h6.e.f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map c() {
        return h6.e.a().b("topContentSizeChange", h6.e.d("registrationName", "onContentSizeChange")).b("topLayout", h6.e.d("registrationName", "onLayout")).b("topPointerEnter", h6.e.d("registrationName", "pointerenter")).b("topPointerLeave", h6.e.d("registrationName", "pointerleave")).b("topPointerMove", h6.e.d("registrationName", "pointermove")).b("topLoadingError", h6.e.d("registrationName", "onLoadingError")).b("topLoadingFinish", h6.e.d("registrationName", "onLoadingFinish")).b("topLoadingStart", h6.e.d("registrationName", "onLoadingStart")).b("topSelectionChange", h6.e.d("registrationName", "onSelectionChange")).b("topMessage", h6.e.d("registrationName", "onMessage")).b("topClick", h6.e.d("registrationName", "onClick")).b("topScrollBeginDrag", h6.e.d("registrationName", "onScrollBeginDrag")).b("topScrollEndDrag", h6.e.d("registrationName", "onScrollEndDrag")).b("topScroll", h6.e.d("registrationName", "onScroll")).b("topMomentumScrollBegin", h6.e.d("registrationName", "onMomentumScrollBegin")).b("topMomentumScrollEnd", h6.e.d("registrationName", "onMomentumScrollEnd")).a();
    }
}
