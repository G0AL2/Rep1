package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.i.d;
import java.util.List;

/* loaded from: classes.dex */
public class MediationAdapterUtil {
    public static void addNativeFeedMainView(Context context, int i10, MediaView mediaView, View view, List<TTImage> list) {
        TTImage tTImage;
        if (context == null || mediaView == null) {
            return;
        }
        if (i10 != 3 && i10 != 2 && i10 != 16 && i10 != 4 && i10 != 33) {
            if ((i10 == 5 || i10 == 15 || i10 == 50) && view != null && view.getParent() == null) {
                mediaView.removeAllViews();
                mediaView.addView(view, -1, -1);
                return;
            }
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(t.f(context, "tt_pangle_native_image_video_layout"), (ViewGroup) null);
        if (inflate == null) {
            return;
        }
        ImageView imageView = (ImageView) inflate.findViewById(t.e(context, "tt_main_image"));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(t.e(context, "tt_layout_image_group"));
        if (i10 == 4) {
            if (list != null && list.size() >= 3) {
                ImageView imageView2 = (ImageView) inflate.findViewById(t.e(context, "tt_group_image1"));
                ImageView imageView3 = (ImageView) inflate.findViewById(t.e(context, "tt_group_image2"));
                ImageView imageView4 = (ImageView) inflate.findViewById(t.e(context, "tt_group_image3"));
                imageView.setVisibility(8);
                linearLayout.setVisibility(0);
                TTImage tTImage2 = list.get(0);
                TTImage tTImage3 = list.get(1);
                TTImage tTImage4 = list.get(2);
                if (tTImage2 != null && tTImage2.isValid() && imageView2 != null) {
                    d.a().a(tTImage2.getImageUrl(), imageView2);
                }
                if (tTImage3 != null && tTImage3.isValid() && imageView3 != null) {
                    d.a().a(tTImage4.getImageUrl(), imageView3);
                }
                if (tTImage4 != null && tTImage4.isValid() && imageView4 != null) {
                    d.a().a(tTImage4.getImageUrl(), imageView3);
                }
            }
        } else {
            imageView.setVisibility(0);
            linearLayout.setVisibility(8);
            if (list != null && !list.isEmpty() && (tTImage = list.get(0)) != null && tTImage.isValid()) {
                d.a().a(tTImage.getImageUrl(), imageView);
            }
        }
        mediaView.removeAllViews();
        mediaView.addView(inflate, -1, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0570  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View setAdDataAndBuildBannerView(android.content.Context r25, com.bytedance.sdk.openadsdk.TTNativeAd r26, com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener r27, float r28, float r29) {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.adapter.MediationAdapterUtil.setAdDataAndBuildBannerView(android.content.Context, com.bytedance.sdk.openadsdk.TTNativeAd, com.bytedance.sdk.openadsdk.TTNativeAd$AdInteractionListener, float, float):android.view.View");
    }
}
