package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.b.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.b.b f7620a;

    /* renamed from: o  reason: collision with root package name */
    private final Context f7621o;

    public a(com.applovin.impl.mediation.debugger.b.b.b bVar, Context context) {
        super(c.b.DETAIL);
        this.f7620a = bVar;
        this.f7621o = context;
        this.f7688d = q();
        this.f7689e = r();
    }

    private SpannedString q() {
        return StringUtils.createSpannedString(this.f7620a.i(), b() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString r() {
        if (b()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) s());
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) t());
            if (this.f7620a.a() == b.a.INVALID_INTEGRATION) {
                spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
            }
            return new SpannedString(spannableStringBuilder);
        }
        return null;
    }

    private SpannedString s() {
        if (this.f7620a.d()) {
            if (TextUtils.isEmpty(this.f7620a.j())) {
                return StringUtils.createListItemDetailSpannedString(this.f7620a.e() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f7620a.j(), -16777216));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
    }

    private SpannedString t() {
        if (this.f7620a.e()) {
            if (TextUtils.isEmpty(this.f7620a.k())) {
                return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f7620a.k(), -16777216));
            if (this.f7620a.f()) {
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f7620a.l(), -16777216));
            }
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean b() {
        return this.f7620a.a() != b.a.MISSING;
    }

    public com.applovin.impl.mediation.debugger.b.b.b d() {
        return this.f7620a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int e() {
        int o10 = this.f7620a.o();
        return o10 > 0 ? o10 : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int f() {
        return b() ? R.drawable.applovin_ic_disclosure_arrow : super.e();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int g() {
        return f.a(R.color.applovin_sdk_disclosureButtonColor, this.f7621o);
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f7688d) + ", detailText=" + ((Object) this.f7689e) + ", network=" + this.f7620a + "}";
    }
}
