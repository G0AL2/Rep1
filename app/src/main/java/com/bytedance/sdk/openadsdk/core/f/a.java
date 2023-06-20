package com.bytedance.sdk.openadsdk.core.f;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.l;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.dislike.b;
import com.bytedance.sdk.openadsdk.utils.q;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: TTNativeAdImpl.java */
/* loaded from: classes.dex */
public class a implements TTNativeAd {

    /* renamed from: a  reason: collision with root package name */
    private int f12238a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12239b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12240c;

    /* renamed from: g  reason: collision with root package name */
    protected final l f12241g;

    /* renamed from: h  reason: collision with root package name */
    protected final n f12242h;

    /* renamed from: i  reason: collision with root package name */
    protected final Context f12243i;

    /* renamed from: j  reason: collision with root package name */
    protected TTAdDislike f12244j;

    /* renamed from: k  reason: collision with root package name */
    protected int f12245k;

    /* renamed from: l  reason: collision with root package name */
    protected String f12246l;

    public a(Context context, n nVar, int i10) {
        if (nVar == null) {
            com.bytedance.sdk.component.utils.l.b("materialMeta can't been null");
        }
        this.f12242h = nVar;
        this.f12243i = context;
        this.f12245k = i10;
        this.f12241g = new l(context, this, nVar, a(i10));
    }

    private String a(int i10) {
        return i10 != 1 ? i10 != 2 ? (i10 == 5 || i10 != 9) ? "embeded_ad" : "draw_ad" : "interaction" : "banner_ad";
    }

    private List<View> a(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                linkedList.add(list.get(i10));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedList.add(list2.get(i11));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getAdCreativeToken() {
        return this.f12242h.n();
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public Bitmap getAdLogo() {
        return BitmapFactory.decodeResource(this.f12243i.getResources(), t.d(m.a(), "tt_ad_logo_new"));
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public View getAdLogoView() {
        if (this.f12243i == null) {
            com.bytedance.sdk.component.utils.l.e("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(this.f12243i);
        imageView.setImageResource(t.d(this.f12243i, "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.f.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.showPrivacyActivity();
            }
        });
        return imageView;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public View getAdView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppCommentNum() {
        if (this.f12242h.aa() != null) {
            return this.f12242h.aa().e();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppScore() {
        if (this.f12242h.aa() != null) {
            return (int) this.f12242h.aa().d();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getAppSize() {
        if (this.f12242h.aa() != null) {
            return this.f12242h.aa().f();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getButtonText() {
        return this.f12242h.W();
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getDescription() {
        if (!TextUtils.isEmpty(this.f12242h.U())) {
            return this.f12242h.U();
        }
        return this.f12242h.V();
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTAdDislike getDislikeDialog(Activity activity) {
        if (this.f12244j == null) {
            a(activity);
        }
        return this.f12244j;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public List<FilterWord> getFilterWords() {
        n nVar = this.f12242h;
        if (nVar == null) {
            return null;
        }
        return nVar.ae();
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTImage getIcon() {
        if (this.f12242h.M() == null) {
            return null;
        }
        return k.a(this.f12242h.M());
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public List<TTImage> getImageList() {
        ArrayList arrayList = new ArrayList();
        if (this.f12242h.P() != null && !this.f12242h.P().isEmpty()) {
            for (k kVar : this.f12242h.P()) {
                arrayList.add(k.a(kVar));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getImageMode() {
        n nVar = this.f12242h;
        if (nVar == null) {
            return -1;
        }
        return nVar.ad();
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public int getInteractionType() {
        n nVar = this.f12242h;
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public Map<String, Object> getMediaExtraInfo() {
        n nVar = this.f12242h;
        if (nVar != null) {
            return nVar.aj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getSource() {
        return this.f12242h.K();
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public String getTitle() {
        if (this.f12242h.aa() != null && !TextUtils.isEmpty(this.f12242h.aa().b())) {
            return this.f12242h.aa().b();
        }
        if (!TextUtils.isEmpty(getSource())) {
            return getSource();
        }
        return this.f12242h.U();
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTImage getVideoCoverImage() {
        n nVar = this.f12242h;
        if (nVar == null || nVar.J() == null) {
            return null;
        }
        return new TTImage(this.f12242h.J().f(), this.f12242h.J().i(), this.f12242h.J().w());
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.f12240c) {
            return;
        }
        q.a(this.f12242h, d10, str, str2);
        this.f12240c = true;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.l.b("container can't been null");
        } else if (view == null) {
            com.bytedance.sdk.component.utils.l.b("clickView can't been null");
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(view);
            registerViewForInteraction(viewGroup, arrayList, null, adInteractionListener);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d10) {
        l lVar = this.f12241g;
        if (lVar != null) {
            lVar.a(d10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void showPrivacyActivity() {
        Context context = this.f12243i;
        if (context != null) {
            TTWebsiteActivity.a(context, this.f12242h, this.f12246l);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        if (this.f12239b) {
            return;
        }
        q.a(this.f12242h, d10);
        this.f12239b = true;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public TTAdDislike getDislikeDialog(final TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(this.f12242h);
            return new TTAdDislike() { // from class: com.bytedance.sdk.openadsdk.core.f.a.1
                @Override // com.bytedance.sdk.openadsdk.TTAdDislike
                public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdDislike
                public void showDislikeDialog() {
                    if ((tTDislikeDialogAbstract.getContext() instanceof Activity) && !((Activity) tTDislikeDialogAbstract.getContext()).isFinishing()) {
                        tTDislikeDialogAbstract.show();
                    }
                }
            };
        }
        throw new IllegalArgumentException("dialog is null, please check");
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.l.b("container can't been null");
        } else if (list == null) {
            com.bytedance.sdk.component.utils.l.b("clickView can't been null");
        } else if (list.size() <= 0) {
            com.bytedance.sdk.component.utils.l.b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, list, list2, null, adInteractionListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context] */
    private void a(Activity activity) {
        Context context = this.f12243i;
        Activity activity2 = activity;
        if (context instanceof Activity) {
            activity2 = activity;
            if (!((Activity) context).isFinishing()) {
                activity2 = this.f12243i;
            }
        }
        this.f12244j = new b(activity2, this.f12242h);
    }

    private void a(boolean z10) {
        com.bytedance.sdk.openadsdk.h.a.b c10 = com.bytedance.sdk.openadsdk.h.a.b.b().a(this.f12245k).c(String.valueOf(u.f(this.f12242h)));
        if (z10) {
            com.bytedance.sdk.openadsdk.h.b.a().c(c10);
        } else {
            com.bytedance.sdk.openadsdk.h.b.a().d(c10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.l.b("container can't been null");
        } else if (list == null) {
            com.bytedance.sdk.component.utils.l.b("clickView can't been null");
        } else if (list.size() <= 0) {
            com.bytedance.sdk.component.utils.l.b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, null, list, list2, view, adInteractionListener);
        }
    }

    private boolean a() {
        n nVar = this.f12242h;
        if (nVar == null || nVar.L() == 5) {
            return false;
        }
        if (this.f12238a == 0) {
            this.f12238a = u.f(this.f12242h);
        }
        return m.h().d(this.f12238a) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.l.b("container can't been null");
        } else if (list2 == null) {
            com.bytedance.sdk.component.utils.l.b("clickView can't been null");
        } else if (list2.size() <= 0) {
            com.bytedance.sdk.component.utils.l.b("clickViews size must been more than 1");
        } else {
            a(list3 != null && list3.size() > 0);
            if (a()) {
                list3 = a(list2, list3);
            }
            this.f12241g.a(viewGroup, list, list2, list3, view, adInteractionListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        this.f12246l = str;
    }
}
