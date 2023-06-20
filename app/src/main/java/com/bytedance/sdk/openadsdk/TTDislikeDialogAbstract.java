package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;

/* loaded from: classes.dex */
public abstract class TTDislikeDialogAbstract extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private View f10634a;

    /* renamed from: b  reason: collision with root package name */
    private n f10635b;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
    }

    private void a() {
        if (this.f10635b == null || this.f10634a == null) {
            return;
        }
        int[] tTDislikeListViewIds = getTTDislikeListViewIds();
        if (tTDislikeListViewIds != null && tTDislikeListViewIds.length > 0) {
            for (int i10 : tTDislikeListViewIds) {
                View findViewById = this.f10634a.findViewById(i10);
                if (findViewById != null) {
                    if (findViewById instanceof TTDislikeListView) {
                        ((TTDislikeListView) findViewById).setMaterialMeta(this.f10635b);
                    } else {
                        throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id , please check");
                    }
                } else {
                    throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id,please check");
                }
            }
            return;
        }
        throw new IllegalArgumentException("The options list of dislike is empty, please set TTDislikeListView");
    }

    public abstract int getLayoutId();

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract int[] getTTDislikeListViewIds();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) null);
        this.f10634a = inflate;
        if (inflate != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            View view = this.f10634a;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            setContentView(view, layoutParams);
            a();
            return;
        }
        throw new IllegalArgumentException("getLayoutId,layout id may be abnormal, please check");
    }

    public void setMaterialMeta(n nVar) {
        this.f10635b = nVar;
        a();
    }

    public TTDislikeDialogAbstract(Context context, int i10) {
        super(context, i10);
    }
}
