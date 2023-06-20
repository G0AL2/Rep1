package com.ironsource.mediationsdk.adunit.b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public g f26837a;

    /* renamed from: b  reason: collision with root package name */
    public h f26838b;

    /* renamed from: c  reason: collision with root package name */
    public e f26839c;

    /* renamed from: d  reason: collision with root package name */
    public com.ironsource.mediationsdk.adunit.b.a f26840d;

    /* renamed from: e  reason: collision with root package name */
    public i f26841e;

    /* renamed from: f  reason: collision with root package name */
    private final int f26842f = -1;

    /* renamed from: g  reason: collision with root package name */
    private IronSource.AD_UNIT f26843g;

    /* renamed from: h  reason: collision with root package name */
    private b f26844h;

    /* renamed from: i  reason: collision with root package name */
    private c f26845i;

    /* renamed from: j  reason: collision with root package name */
    private com.ironsource.mediationsdk.a.b f26846j;

    /* renamed from: k  reason: collision with root package name */
    private Map<com.ironsource.mediationsdk.adunit.b.b, a> f26847k;

    /* renamed from: l  reason: collision with root package name */
    private Map<com.ironsource.mediationsdk.adunit.b.b, a> f26848l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private int f26849a;

        /* renamed from: b  reason: collision with root package name */
        private int f26850b;

        public a(int i10, int i11) {
            this.f26849a = i10;
            this.f26850b = i11;
        }

        final int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f26849a : this.f26850b;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public d(IronSource.AD_UNIT ad_unit, b bVar, c cVar) {
        this.f26843g = ad_unit;
        this.f26844h = bVar;
        this.f26845i = cVar;
        this.f26846j = (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) ? com.ironsource.mediationsdk.a.h.d() : com.ironsource.mediationsdk.a.d.d();
        HashMap hashMap = new HashMap();
        this.f26847k = hashMap;
        com.ironsource.mediationsdk.adunit.b.b bVar2 = com.ironsource.mediationsdk.adunit.b.b.INIT_STARTED;
        hashMap.put(bVar2, new a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar3 = com.ironsource.mediationsdk.adunit.b.b.INIT_ENDED;
        map.put(bVar3, new a(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map2 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar4 = com.ironsource.mediationsdk.adunit.b.b.SESSION_CAPPED;
        map2.put(bVar4, new a(-1, IronSourceConstants.IS_CAP_SESSION));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map3 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar5 = com.ironsource.mediationsdk.adunit.b.b.PLACEMENT_CAPPED;
        map3.put(bVar5, new a(IronSourceConstants.IS_CAP_PLACEMENT, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map4 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar6 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_REQUEST;
        map4.put(bVar6, new a(2000, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map5 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar7 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_SUCCESS;
        map5.put(bVar7, new a(IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map6 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar8 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_FAILED;
        map6.put(bVar8, new a(IronSourceConstants.IS_AUCTION_FAILED, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map7 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar9 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_REQUEST_WATERFALL;
        map7.put(bVar9, new a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map8 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar10 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_RESULT_WATERFALL;
        map8.put(bVar10, new a(IronSourceConstants.IS_RESULT_WATERFALL, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map9 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar11 = com.ironsource.mediationsdk.adunit.b.b.INIT_SUCCESS;
        map9.put(bVar11, new a(-1, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map10 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar12 = com.ironsource.mediationsdk.adunit.b.b.INIT_FAILED;
        map10.put(bVar12, new a(-1, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map11 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar13 = com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_SUCCESS;
        map11.put(bVar13, new a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map12 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar14 = com.ironsource.mediationsdk.adunit.b.b.AD_OPENED;
        map12.put(bVar14, new a(-1, IronSourceConstants.IS_INSTANCE_OPENED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map13 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar15 = com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED;
        map13.put(bVar15, new a(-1, IronSourceConstants.IS_INSTANCE_CLOSED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map14 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar16 = com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED;
        map14.put(bVar16, new a(-1, 2006));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map15 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar17 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD;
        map15.put(bVar17, new a(2001, 2002));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map16 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar18 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS;
        map16.put(bVar18, new a(2004, 2003));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map17 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar19 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON;
        map17.put(bVar19, new a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map18 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar20 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL;
        map18.put(bVar20, new a(-1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map19 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar21 = com.ironsource.mediationsdk.adunit.b.b.SHOW_AD;
        map19.put(bVar21, new a(2100, IronSourceConstants.IS_INSTANCE_SHOW));
        this.f26847k.put(bVar13, new a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map20 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar22 = com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED;
        map20.put(bVar22, new a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map21 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar23 = com.ironsource.mediationsdk.adunit.b.b.AD_UNIT_CAPPED;
        map21.put(bVar23, new a(IronSourceConstants.IS_AD_UNIT_CAPPED, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map22 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar24 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE;
        map22.put(bVar24, new a(IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map23 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar25 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE;
        map23.put(bVar25, new a(IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map24 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar26 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        map24.put(bVar26, new a(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map25 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar27 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_BIDDING_DATA_MISSING;
        map25.put(bVar27, new a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map26 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar28 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        map26.put(bVar28, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map27 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar29 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        map27.put(bVar29, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map28 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar30 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        map28.put(bVar30, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map29 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar31 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        map29.put(bVar31, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map30 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar32 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        map30.put(bVar32, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map31 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar33 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        map31.put(bVar33, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map32 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar34 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        map32.put(bVar34, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map33 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar35 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_CLOSED;
        map33.put(bVar35, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map34 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar36 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        map34.put(bVar36, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map35 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar37 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_INTERNAL_ERROR;
        map35.put(bVar37, new a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map36 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar38 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR;
        map36.put(bVar38, new a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map37 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar39 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map37.put(bVar39, new a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f26847k.put(com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map38 = this.f26847k;
        com.ironsource.mediationsdk.adunit.b.b bVar40 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_NOTIFICATION_ERROR;
        map38.put(bVar40, new a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap2 = new HashMap();
        this.f26848l = hashMap2;
        hashMap2.put(bVar2, new a(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        this.f26848l.put(bVar3, new a(IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        this.f26848l.put(bVar4, new a(-1, IronSourceConstants.RV_CAP_SESSION));
        this.f26848l.put(bVar5, new a(IronSourceConstants.RV_CAP_PLACEMENT, -1));
        this.f26848l.put(bVar6, new a(IronSourceConstants.RV_AUCTION_REQUEST, -1));
        this.f26848l.put(bVar7, new a(IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        this.f26848l.put(bVar8, new a(IronSourceConstants.RV_AUCTION_FAILED, -1));
        this.f26848l.put(bVar9, new a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        this.f26848l.put(bVar10, new a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        this.f26848l.put(bVar11, new a(-1, -1));
        this.f26848l.put(bVar12, new a(-1, -1));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.AD_VISIBLE, new a(-1, IronSourceConstants.RV_INSTANCE_VISIBLE));
        this.f26848l.put(bVar14, new a(-1, 1005));
        this.f26848l.put(bVar15, new a(-1, IronSourceConstants.RV_INSTANCE_CLOSED));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.AD_STARTED, new a(-1, IronSourceConstants.RV_INSTANCE_STARTED));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.AD_ENDED, new a(-1, IronSourceConstants.RV_INSTANCE_ENDED));
        this.f26848l.put(bVar16, new a(-1, 1006));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED, new a(-1, 1010));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.AD_AVAILABILITY_CHANGED_TRUE, new a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.AD_AVAILABILITY_CHANGED_FALSE, new a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f26848l.put(bVar17, new a(1000, 1001));
        this.f26848l.put(bVar18, new a(1003, 1002));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED, new a(-1, IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f26848l.put(bVar19, new a(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f26848l.put(bVar20, new a(-1, IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f26848l.put(bVar21, new a(IronSourceConstants.RV_API_SHOW_CALLED, IronSourceConstants.RV_INSTANCE_SHOW));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_CHANCE, new a(-1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f26848l.put(bVar22, new a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, IronSourceConstants.RV_INSTANCE_SHOW_FAILED));
        this.f26848l.put(bVar23, new a(IronSourceConstants.RV_AD_UNIT_CAPPED, -1));
        this.f26848l.put(bVar24, new a(IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f26848l.put(bVar25, new a(IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE));
        this.f26848l.put(bVar26, new a(IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        this.f26848l.put(bVar27, new a(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING));
        this.f26848l.put(bVar28, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        this.f26848l.put(bVar29, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        this.f26848l.put(bVar30, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        this.f26848l.put(bVar31, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        this.f26848l.put(bVar32, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        this.f26848l.put(bVar33, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        this.f26848l.put(bVar34, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED));
        this.f26848l.put(bVar36, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f26848l.put(bVar35, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED));
        this.f26848l.put(bVar36, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f26848l.put(bVar36, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_LOAD_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        this.f26848l.put(bVar37, new a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        this.f26848l.put(bVar38, new a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f26848l.put(bVar39, new a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f26848l.put(com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOTING_WATERFALL_OVERHEAD, new a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        this.f26848l.put(bVar40, new a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.f26837a = new g(this);
        this.f26838b = new h(this);
        this.f26839c = new e(this);
        this.f26840d = new com.ironsource.mediationsdk.adunit.b.a(this);
        this.f26841e = new i(this);
    }

    private int a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f26843g) && this.f26847k.containsKey(bVar)) {
                return this.f26847k.get(bVar).a(this.f26844h);
            }
            if (IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f26843g) && this.f26848l.containsKey(bVar)) {
                return this.f26848l.get(bVar).a(this.f26844h);
            }
            return -1;
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public final void a() {
        this.f26845i = null;
        this.f26839c = null;
        this.f26837a = null;
        this.f26838b = null;
        this.f26840d = null;
        this.f26841e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(com.ironsource.mediationsdk.adunit.b.b bVar, Map<String, Object> map) {
        a(bVar, map, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(com.ironsource.mediationsdk.adunit.b.b bVar, Map<String, Object> map, long j10) {
        int a10 = a(bVar);
        if (-1 == a10) {
            return;
        }
        HashMap hashMap = new HashMap();
        c cVar = this.f26845i;
        if (cVar != null) {
            hashMap.putAll(cVar.a(bVar));
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f26846j.b(new com.ironsource.mediationsdk.a.c(a10, j10, new JSONObject(hashMap)));
    }
}
