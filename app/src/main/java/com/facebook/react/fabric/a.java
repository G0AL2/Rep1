package com.facebook.react.fabric;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FabricComponents.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f15386a;

    static {
        HashMap hashMap = new HashMap();
        f15386a = hashMap;
        hashMap.put("View", ReactViewManager.REACT_CLASS);
        hashMap.put("Image", ReactImageManager.REACT_CLASS);
        hashMap.put("ScrollView", ReactScrollViewManager.REACT_CLASS);
        hashMap.put("Slider", ReactSliderManager.REACT_CLASS);
        hashMap.put("ModalHostView", ReactModalHostManager.REACT_CLASS);
        hashMap.put("Paragraph", ReactTextViewManager.REACT_CLASS);
        hashMap.put("Text", "RCText");
        hashMap.put("RawText", ReactRawTextManager.REACT_CLASS);
        hashMap.put("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS);
        hashMap.put("ShimmeringView", "RKShimmeringView");
        hashMap.put("TemplateView", "RCTTemplateView");
        hashMap.put("AxialGradientView", "RCTAxialGradientView");
        hashMap.put("Video", "RCTVideo");
        hashMap.put("StickerInputView", "RCTStickerInputView");
        hashMap.put("Map", "RCTMap");
        hashMap.put("WebView", "RCTWebView");
        hashMap.put("Keyframes", "RCTKeyframes");
        hashMap.put("ImpressionTrackingView", "RCTImpressionTrackingView");
    }

    public static String a(String str) {
        String str2 = f15386a.get(str);
        return str2 != null ? str2 : str;
    }
}
