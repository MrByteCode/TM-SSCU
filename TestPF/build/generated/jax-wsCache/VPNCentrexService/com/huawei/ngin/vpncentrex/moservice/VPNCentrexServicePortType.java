
package com.huawei.ngin.vpncentrex.moservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.huawei.ngin.vpncentrex.domain.AttendantTime1;
import com.huawei.ngin.vpncentrex.domain.AttendantTimeList1;
import com.huawei.ngin.vpncentrex.domain.AttendantWorkTime1;
import com.huawei.ngin.vpncentrex.domain.BatchProcessing;
import com.huawei.ngin.vpncentrex.domain.BossesStatusInfoList;
import com.huawei.ngin.vpncentrex.domain.BusinessTribe;
import com.huawei.ngin.vpncentrex.domain.BusinessTribe1;
import com.huawei.ngin.vpncentrex.domain.C2CGroup;
import com.huawei.ngin.vpncentrex.domain.C2CGroup1;
import com.huawei.ngin.vpncentrex.domain.C2CGroup2;
import com.huawei.ngin.vpncentrex.domain.CallAdmissionControl;
import com.huawei.ngin.vpncentrex.domain.CallAdmissionControl1;
import com.huawei.ngin.vpncentrex.domain.CallForwardingTime;
import com.huawei.ngin.vpncentrex.domain.CallForwardingTime1;
import com.huawei.ngin.vpncentrex.domain.CallingBind;
import com.huawei.ngin.vpncentrex.domain.CallingBind1;
import com.huawei.ngin.vpncentrex.domain.CallingFilterID;
import com.huawei.ngin.vpncentrex.domain.CallingFilterID1;
import com.huawei.ngin.vpncentrex.domain.CarrierCode;
import com.huawei.ngin.vpncentrex.domain.CarrierCodeCfgInfoList;
import com.huawei.ngin.vpncentrex.domain.CentrexNumber;
import com.huawei.ngin.vpncentrex.domain.ConsumptionReduction;
import com.huawei.ngin.vpncentrex.domain.CpcInfo;
import com.huawei.ngin.vpncentrex.domain.CurrentFilterID;
import com.huawei.ngin.vpncentrex.domain.DiscountList;
import com.huawei.ngin.vpncentrex.domain.DiscountNumberList;
import com.huawei.ngin.vpncentrex.domain.DiscountlistInfo;
import com.huawei.ngin.vpncentrex.domain.EntAnn1;
import com.huawei.ngin.vpncentrex.domain.EntAnn2;
import com.huawei.ngin.vpncentrex.domain.EntAnn3;
import com.huawei.ngin.vpncentrex.domain.EntAnn4;
import com.huawei.ngin.vpncentrex.domain.EntIVRMenu1;
import com.huawei.ngin.vpncentrex.domain.Enterprise;
import com.huawei.ngin.vpncentrex.domain.Enterprise1;
import com.huawei.ngin.vpncentrex.domain.Enterprise2;
import com.huawei.ngin.vpncentrex.domain.EnterpriseAdmin;
import com.huawei.ngin.vpncentrex.domain.EnterpriseAdmin1;
import com.huawei.ngin.vpncentrex.domain.EnterpriseAdmin2;
import com.huawei.ngin.vpncentrex.domain.EnterpriseInBT;
import com.huawei.ngin.vpncentrex.domain.EnterpriseInBT1;
import com.huawei.ngin.vpncentrex.domain.EnterpriseLicense;
import com.huawei.ngin.vpncentrex.domain.EnterpriseLicense1;
import com.huawei.ngin.vpncentrex.domain.FeeIndex1;
import com.huawei.ngin.vpncentrex.domain.FeeIndex2;
import com.huawei.ngin.vpncentrex.domain.FnFList;
import com.huawei.ngin.vpncentrex.domain.FnFList1;
import com.huawei.ngin.vpncentrex.domain.FnFList3;
import com.huawei.ngin.vpncentrex.domain.FnFListNumber;
import com.huawei.ngin.vpncentrex.domain.FnFListNumber2;
import com.huawei.ngin.vpncentrex.domain.FnFListRelation;
import com.huawei.ngin.vpncentrex.domain.FnFListRelation1;
import com.huawei.ngin.vpncentrex.domain.FnFListRelation2;
import com.huawei.ngin.vpncentrex.domain.FnFListRelation3;
import com.huawei.ngin.vpncentrex.domain.FullNumberList;
import com.huawei.ngin.vpncentrex.domain.FunctionProfile;
import com.huawei.ngin.vpncentrex.domain.FunctionProfile1;
import com.huawei.ngin.vpncentrex.domain.GPRSAccountLmt;
import com.huawei.ngin.vpncentrex.domain.GPRSPkg;
import com.huawei.ngin.vpncentrex.domain.GroupCommunities;
import com.huawei.ngin.vpncentrex.domain.GrpShrdMember;
import com.huawei.ngin.vpncentrex.domain.HelpDesk;
import com.huawei.ngin.vpncentrex.domain.HelpDesk1;
import com.huawei.ngin.vpncentrex.domain.HuntingGroup;
import com.huawei.ngin.vpncentrex.domain.HuntingGroup1;
import com.huawei.ngin.vpncentrex.domain.HuntingGroup2;
import com.huawei.ngin.vpncentrex.domain.HuntingGroup3;
import com.huawei.ngin.vpncentrex.domain.HuntingGroup4;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupSeqList;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupSeqList1;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupSeqList2;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupTime;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupTime1;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupUser;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupUser1;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupUser2;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupUser3;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry1;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry2;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry3;
import com.huawei.ngin.vpncentrex.domain.IVPNEnterprise;
import com.huawei.ngin.vpncentrex.domain.IVPNEnterprise1;
import com.huawei.ngin.vpncentrex.domain.IVPNEnterpriseRelation;
import com.huawei.ngin.vpncentrex.domain.IVPNEnterpriseRelation1;
import com.huawei.ngin.vpncentrex.domain.IVPNEnterpriseRelation2;
import com.huawei.ngin.vpncentrex.domain.IVPNSyncStatusCheck;
import com.huawei.ngin.vpncentrex.domain.InterGroup;
import com.huawei.ngin.vpncentrex.domain.InterGroup1;
import com.huawei.ngin.vpncentrex.domain.ListGroupInfo;
import com.huawei.ngin.vpncentrex.domain.ListMemberInfo;
import com.huawei.ngin.vpncentrex.domain.LteUserInfo;
import com.huawei.ngin.vpncentrex.domain.MembeAccountrLmt;
import com.huawei.ngin.vpncentrex.domain.Member;
import com.huawei.ngin.vpncentrex.domain.Member1;
import com.huawei.ngin.vpncentrex.domain.Member2;
import com.huawei.ngin.vpncentrex.domain.Member3;
import com.huawei.ngin.vpncentrex.domain.Member4;
import com.huawei.ngin.vpncentrex.domain.Member5;
import com.huawei.ngin.vpncentrex.domain.Member6;
import com.huawei.ngin.vpncentrex.domain.MemberBatche;
import com.huawei.ngin.vpncentrex.domain.MemberBatche1;
import com.huawei.ngin.vpncentrex.domain.MemberPtl;
import com.huawei.ngin.vpncentrex.domain.Number;
import com.huawei.ngin.vpncentrex.domain.OfficeZone;
import com.huawei.ngin.vpncentrex.domain.OfficeZone1;
import com.huawei.ngin.vpncentrex.domain.PBXLink1;
import com.huawei.ngin.vpncentrex.domain.PBXLink2;
import com.huawei.ngin.vpncentrex.domain.PBXMember;
import com.huawei.ngin.vpncentrex.domain.PBXMember1;
import com.huawei.ngin.vpncentrex.domain.PBXMember2;
import com.huawei.ngin.vpncentrex.domain.PBXMember3;
import com.huawei.ngin.vpncentrex.domain.PBXMember4;
import com.huawei.ngin.vpncentrex.domain.PBXPrevent1;
import com.huawei.ngin.vpncentrex.domain.PBXRemAccess;
import com.huawei.ngin.vpncentrex.domain.PBXRemAccess1;
import com.huawei.ngin.vpncentrex.domain.PBXRemAccess2;
import com.huawei.ngin.vpncentrex.domain.PNPPolicy;
import com.huawei.ngin.vpncentrex.domain.PNPPolicy1;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntSeqList;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntSeqList1;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntSeqList2;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntTime;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntTime1;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntTime2;
import com.huawei.ngin.vpncentrex.domain.PersonalHunting;
import com.huawei.ngin.vpncentrex.domain.PersonalHunting1;
import com.huawei.ngin.vpncentrex.domain.PersonalHunting2;
import com.huawei.ngin.vpncentrex.domain.PersonalHunting3;
import com.huawei.ngin.vpncentrex.domain.PickUpGroupUser;
import com.huawei.ngin.vpncentrex.domain.PickUpGroupUser2;
import com.huawei.ngin.vpncentrex.domain.PickUpGroupUser3;
import com.huawei.ngin.vpncentrex.domain.PickupGroup;
import com.huawei.ngin.vpncentrex.domain.PickupGroup2;
import com.huawei.ngin.vpncentrex.domain.PickupGroup3;
import com.huawei.ngin.vpncentrex.domain.PickupGroup4;
import com.huawei.ngin.vpncentrex.domain.PickupGroup5;
import com.huawei.ngin.vpncentrex.domain.PickupGroupInfo;
import com.huawei.ngin.vpncentrex.domain.PkgFeeIndex1;
import com.huawei.ngin.vpncentrex.domain.PkgFeeIndex2;
import com.huawei.ngin.vpncentrex.domain.Profile;
import com.huawei.ngin.vpncentrex.domain.Profile1;
import com.huawei.ngin.vpncentrex.domain.Profile2;
import com.huawei.ngin.vpncentrex.domain.RequestHeader;
import com.huawei.ngin.vpncentrex.domain.ResetUserList;
import com.huawei.ngin.vpncentrex.domain.ResponseHeader;
import com.huawei.ngin.vpncentrex.domain.Restriction;
import com.huawei.ngin.vpncentrex.domain.Restriction1;
import com.huawei.ngin.vpncentrex.domain.Restriction2;
import com.huawei.ngin.vpncentrex.domain.Restriction3;
import com.huawei.ngin.vpncentrex.domain.Restriction4;
import com.huawei.ngin.vpncentrex.domain.RestrictionTemplateList;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime1;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime2;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime3;
import com.huawei.ngin.vpncentrex.domain.RestrictionTimeList;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserList;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserList1;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserListInfoList;
import com.huawei.ngin.vpncentrex.domain.ResyncDataToiVPN;
import com.huawei.ngin.vpncentrex.domain.ReturnDes;
import com.huawei.ngin.vpncentrex.domain.RoutingBasedOnCaller;
import com.huawei.ngin.vpncentrex.domain.RoutingBasedOnCaller1;
import com.huawei.ngin.vpncentrex.domain.RoutingBasedOnCaller2;
import com.huawei.ngin.vpncentrex.domain.RoutingBasedOnCaller3;
import com.huawei.ngin.vpncentrex.domain.RoutingBasedOnCaller4;
import com.huawei.ngin.vpncentrex.domain.SMSBroadcastCode;
import com.huawei.ngin.vpncentrex.domain.SMSBroadcastCode1;
import com.huawei.ngin.vpncentrex.domain.SMSBroadcastCode2;
import com.huawei.ngin.vpncentrex.domain.SMSBroadcastCode3;
import com.huawei.ngin.vpncentrex.domain.SMSBroadcastList;
import com.huawei.ngin.vpncentrex.domain.SMSBroadcastList1;
import com.huawei.ngin.vpncentrex.domain.SMSTemplate;
import com.huawei.ngin.vpncentrex.domain.SMSTemplate1;
import com.huawei.ngin.vpncentrex.domain.SMSTemplate2;
import com.huawei.ngin.vpncentrex.domain.SNLInfoList;
import com.huawei.ngin.vpncentrex.domain.SNLInfoList1;
import com.huawei.ngin.vpncentrex.domain.SerialProvision;
import com.huawei.ngin.vpncentrex.domain.SerialProvision1;
import com.huawei.ngin.vpncentrex.domain.SerialProvision2;
import com.huawei.ngin.vpncentrex.domain.SerialProvision3;
import com.huawei.ngin.vpncentrex.domain.SpeedNLInfoList;
import com.huawei.ngin.vpncentrex.domain.TransResult;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber1;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber2;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber3;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber4;
import com.huawei.ngin.vpncentrex.domain.UniqueNumberList;
import com.huawei.ngin.vpncentrex.domain.UniqueNumberList1;
import com.huawei.ngin.vpncentrex.domain.UniqueNumberList2;
import com.huawei.ngin.vpncentrex.domain.UserGroup;
import com.huawei.ngin.vpncentrex.domain.UserGroup1;
import com.huawei.ngin.vpncentrex.domain.UserGroup2;
import com.huawei.ngin.vpncentrex.domain.UserGroup3;
import com.huawei.ngin.vpncentrex.domain.UserGroupInfo;
import com.huawei.ngin.vpncentrex.domain.VIPList;
import com.huawei.ngin.vpncentrex.domain.VPNGrpShrdAccnt;
import com.huawei.ngin.vpncentrex.domain.VipCustomer;
import com.huawei.ngin.vpncentrex.domain.VipCustomer1;
import com.huawei.ngin.vpncentrex.domain.VipCustomer2;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VPNCentrexServicePortType", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/moservice")
@XmlSeeAlso({
    com.huawei.ngin.vpncentrex.domain.ObjectFactory.class,
    com.huawei.ngin.vpncentrex.mgr.ObjectFactory.class
})
public interface VPNCentrexServicePortType {


    /**
     * 
     * @param returnDes
     * @param personalHuntTime0
     * @param responseHeader
     * @param requestHeader
     * @param personalHuntTime
     */
    @WebMethod(action = "urn:displayPersonalHuntTime")
    @RequestWrapper(localName = "displayPersonalHuntTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPersonalHuntTime")
    @ResponseWrapper(localName = "displayPersonalHuntTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPersonalHuntTimeResponse")
    public void displayPersonalHuntTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHuntTime", targetNamespace = "")
        PersonalHuntTime2 personalHuntTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "personalHuntTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<PersonalHuntTime1> personalHuntTime0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param userType
     * @param account
     */
    @WebMethod(action = "urn:resetUserPassword")
    @RequestWrapper(localName = "resetUserPassword", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ResetUserPassword")
    @ResponseWrapper(localName = "resetUserPasswordResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ResetUserPasswordResponse")
    public void resetUserPassword(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "account", targetNamespace = "")
        String account,
        @WebParam(name = "userType", targetNamespace = "")
        String userType,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupUser
     */
    @WebMethod(action = "urn:deleteHuntingGroupUser")
    @RequestWrapper(localName = "deleteHuntingGroupUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHuntingGroupUser")
    @ResponseWrapper(localName = "deleteHuntingGroupUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHuntingGroupUserResponse")
    public void deleteHuntingGroupUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupUser", targetNamespace = "")
        HuntingGroupUser2 huntingGroupUser,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param personalHuntings
     * @param totalSize
     * @param responseHeader
     * @param personalHunting
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPersonalHunting")
    @RequestWrapper(localName = "listPersonalHunting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPersonalHunting")
    @ResponseWrapper(localName = "listPersonalHuntingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPersonalHuntingResponse")
    public void listPersonalHunting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "personalHunting", targetNamespace = "")
        PersonalHunting1 personalHunting,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "personalHuntings", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PersonalHunting2>> personalHuntings);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingListEntry
     * @param entryRowIndex
     */
    @WebMethod(action = "urn:createPersonalHuntListEntry")
    @RequestWrapper(localName = "createPersonalHuntListEntry", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePersonalHuntListEntry")
    @ResponseWrapper(localName = "createPersonalHuntListEntryResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePersonalHuntListEntryResponse")
    public void createPersonalHuntListEntry(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingListEntry", targetNamespace = "")
        HuntingListEntry huntingListEntry,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "entryRowIndex", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> entryRowIndex);

    /**
     * 
     * @param returnDes
     * @param c2CGroup
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyC2CGroup")
    @RequestWrapper(localName = "modifyC2CGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyC2CGroup")
    @ResponseWrapper(localName = "modifyC2CGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyC2CGroupResponse")
    public void modifyC2CGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "c2CGroup", targetNamespace = "")
        C2CGroup c2CGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param personalHuntSeqList
     * @param totalSize
     * @param personalHuntSeqLists
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPersonalHuntSeqList")
    @RequestWrapper(localName = "listPersonalHuntSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPersonalHuntSeqList")
    @ResponseWrapper(localName = "listPersonalHuntSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPersonalHuntSeqListResponse")
    public void listPersonalHuntSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "personalHuntSeqList", targetNamespace = "")
        PersonalHuntSeqList2 personalHuntSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "personalHuntSeqLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PersonalHuntSeqList1>> personalHuntSeqLists);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pkgFeeIndex
     */
    @WebMethod(action = "urn:createPkgFeeInfo")
    @RequestWrapper(localName = "createPkgFeeInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePkgFeeInfo")
    @ResponseWrapper(localName = "createPkgFeeInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePkgFeeInfoResponse")
    public void createPkgFeeInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pkgFeeIndex", targetNamespace = "")
        PkgFeeIndex1 pkgFeeIndex,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param restItemID
     * @param returnDes
     * @param restriction
     * @param responseHeader
     * @param restrictionID
     * @param requestHeader
     */
    @WebMethod(action = "urn:createRestriction")
    @RequestWrapper(localName = "createRestriction", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateRestriction")
    @ResponseWrapper(localName = "createRestrictionResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateRestrictionResponse")
    public void createRestriction(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "restriction", targetNamespace = "")
        Restriction restriction,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "restItemID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> restItemID,
        @WebParam(name = "restrictionID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> restrictionID);

    /**
     * 
     * @param gmNumber
     * @param returnDes
     * @param pbxLink
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:displayPBXLink")
    @RequestWrapper(localName = "displayPBXLink", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPBXLink")
    @ResponseWrapper(localName = "displayPBXLinkResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPBXLinkResponse")
    public void displayPBXLink(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "gmNumber", targetNamespace = "")
        String gmNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "pbxLink", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<PBXLink2> pbxLink);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pkgFeeIndex
     */
    @WebMethod(action = "urn:modifyPkgFeeInfo")
    @RequestWrapper(localName = "modifyPkgFeeInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPkgFeeInfo")
    @ResponseWrapper(localName = "modifyPkgFeeInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPkgFeeInfoResponse")
    public void modifyPkgFeeInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pkgFeeIndex", targetNamespace = "")
        PkgFeeIndex2 pkgFeeIndex,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param profile
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyProfile")
    @RequestWrapper(localName = "modifyProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyProfile")
    @ResponseWrapper(localName = "modifyProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyProfileResponse")
    public void modifyProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "profile", targetNamespace = "")
        Profile1 profile,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param profile
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteProfile")
    @RequestWrapper(localName = "deleteProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteProfile")
    @ResponseWrapper(localName = "deleteProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteProfileResponse")
    public void deleteProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "profile", targetNamespace = "")
        Profile2 profile,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupSeqList
     */
    @WebMethod(action = "urn:deleteHuntingGroupSeqList")
    @RequestWrapper(localName = "deleteHuntingGroupSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHuntingGroupSeqList")
    @ResponseWrapper(localName = "deleteHuntingGroupSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHuntingGroupSeqListResponse")
    public void deleteHuntingGroupSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupSeqList", targetNamespace = "")
        HuntingGroupSeqList2 huntingGroupSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param huntingTimeItemID
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupTime
     */
    @WebMethod(action = "urn:createHuntingGroupTime")
    @RequestWrapper(localName = "createHuntingGroupTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHuntingGroupTime")
    @ResponseWrapper(localName = "createHuntingGroupTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHuntingGroupTimeResponse")
    public void createHuntingGroupTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupTime", targetNamespace = "")
        HuntingGroupTime huntingGroupTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingTimeItemID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> huntingTimeItemID);

    /**
     * 
     * @param serialProvision
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteSerialNumber")
    @RequestWrapper(localName = "deleteSerialNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSerialNumber")
    @ResponseWrapper(localName = "deleteSerialNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSerialNumberResponse")
    public void deleteSerialNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "serialProvision", targetNamespace = "")
        SerialProvision3 serialProvision,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param routingBasedOnCaller
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteNumberBasedRouting")
    @RequestWrapper(localName = "deleteNumberBasedRouting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteNumberBasedRouting")
    @ResponseWrapper(localName = "deleteNumberBasedRoutingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteNumberBasedRoutingResponse")
    public void deleteNumberBasedRouting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "routingBasedOnCaller", targetNamespace = "")
        RoutingBasedOnCaller2 routingBasedOnCaller,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param seqRowIndex
     * @param returnDes
     * @param huntingSeqListID
     * @param personalHuntSeqList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createPersonalHuntSeqList")
    @RequestWrapper(localName = "createPersonalHuntSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePersonalHuntSeqList")
    @ResponseWrapper(localName = "createPersonalHuntSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePersonalHuntSeqListResponse")
    public void createPersonalHuntSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHuntSeqList", targetNamespace = "")
        PersonalHuntSeqList personalHuntSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingSeqListID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> huntingSeqListID,
        @WebParam(name = "seqRowIndex", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> seqRowIndex);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param profile
     * @param responseHeader
     * @param profiles
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listProfile")
    @RequestWrapper(localName = "listProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListProfile")
    @ResponseWrapper(localName = "listProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListProfileResponse")
    public void listProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "profile", targetNamespace = "")
        Profile2 profile,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "profiles", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<Profile1>> profiles);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingListEntry
     */
    @WebMethod(action = "urn:deletePersonalHuntListEntry")
    @RequestWrapper(localName = "deletePersonalHuntListEntry", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePersonalHuntListEntry")
    @ResponseWrapper(localName = "deletePersonalHuntListEntryResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePersonalHuntListEntryResponse")
    public void deletePersonalHuntListEntry(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingListEntry", targetNamespace = "")
        HuntingListEntry2 huntingListEntry,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param pkgFeeName
     * @param totalSize
     * @param pkgFeeIndexs
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param pkgFeeType
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPkgFeeInfo")
    @RequestWrapper(localName = "listPkgFeeInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPkgFeeInfo")
    @ResponseWrapper(localName = "listPkgFeeInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPkgFeeInfoResponse")
    public void listPkgFeeInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "pkgFeeType", targetNamespace = "")
        String pkgFeeType,
        @WebParam(name = "pkgFeeName", targetNamespace = "")
        String pkgFeeName,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "pkgFeeIndexs", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PkgFeeIndex1>> pkgFeeIndexs);

    /**
     * 
     * @param callingBind
     * @param returnDes
     * @param totalSize
     * @param callingBinds
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listCallingBind")
    @RequestWrapper(localName = "listCallingBind", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCallingBind")
    @ResponseWrapper(localName = "listCallingBindResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCallingBindResponse")
    public void listCallingBind(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callingBind", targetNamespace = "")
        CallingBind callingBind,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "callingBinds", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<CallingBind>> callingBinds);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param personalHuntTime
     */
    @WebMethod(action = "urn:deletePersonalHuntTime")
    @RequestWrapper(localName = "deletePersonalHuntTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePersonalHuntTime")
    @ResponseWrapper(localName = "deletePersonalHuntTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePersonalHuntTimeResponse")
    public void deletePersonalHuntTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHuntTime", targetNamespace = "")
        PersonalHuntTime2 personalHuntTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param vipList
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createVIPList")
    @RequestWrapper(localName = "createVIPList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateVIPList")
    @ResponseWrapper(localName = "createVIPListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateVIPListResponse")
    public void createVIPList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "vipList", targetNamespace = "")
        VIPList vipList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param listNo
     * @param callingFilterIDs
     * @param responseHeader
     * @param requestHeader
     * @param fullNumber
     */
    @WebMethod(action = "urn:listCallingFilterID")
    @RequestWrapper(localName = "listCallingFilterID", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCallingFilterID")
    @ResponseWrapper(localName = "listCallingFilterIDResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCallingFilterIDResponse")
    public void listCallingFilterID(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "listNo", targetNamespace = "")
        String listNo,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "callingFilterIDs", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<CallingFilterID>> callingFilterIDs);

    /**
     * 
     * @param returnDes
     * @param smsBroadcastList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteSMSBroadcastList")
    @RequestWrapper(localName = "deleteSMSBroadcastList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSMSBroadcastList")
    @ResponseWrapper(localName = "deleteSMSBroadcastListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSMSBroadcastListResponse")
    public void deleteSMSBroadcastList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "smsBroadcastList", targetNamespace = "")
        SMSBroadcastList smsBroadcastList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingListEntry
     */
    @WebMethod(action = "urn:modifyPersonalHuntListEntry")
    @RequestWrapper(localName = "modifyPersonalHuntListEntry", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPersonalHuntListEntry")
    @ResponseWrapper(localName = "modifyPersonalHuntListEntryResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPersonalHuntListEntryResponse")
    public void modifyPersonalHuntListEntry(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingListEntry", targetNamespace = "")
        HuntingListEntry1 huntingListEntry,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param number
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:addNumber")
    @RequestWrapper(localName = "addNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.AddNumber")
    @ResponseWrapper(localName = "addNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.AddNumberResponse")
    public void addNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "number", targetNamespace = "")
        Number number,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param pbxPrevent
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param pbxPrevents
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPBXPrevent")
    @RequestWrapper(localName = "listPBXPrevent", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPBXPrevent")
    @ResponseWrapper(localName = "listPBXPreventResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPBXPreventResponse")
    public void listPBXPrevent(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "pbxPrevent", targetNamespace = "")
        PBXPrevent1 pbxPrevent,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "pbxPrevents", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PBXPrevent1>> pbxPrevents);

    /**
     * 
     * @param returnDes
     * @param personalHuntSeqList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deletePersonalHuntSeqList")
    @RequestWrapper(localName = "deletePersonalHuntSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePersonalHuntSeqList")
    @ResponseWrapper(localName = "deletePersonalHuntSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePersonalHuntSeqListResponse")
    public void deletePersonalHuntSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHuntSeqList", targetNamespace = "")
        PersonalHuntSeqList2 personalHuntSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param c2CGroup
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param c2CGroups
     */
    @WebMethod(action = "urn:listC2CGroup")
    @RequestWrapper(localName = "listC2CGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListC2CGroup")
    @ResponseWrapper(localName = "listC2CGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListC2CGroupResponse")
    public void listC2CGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "c2CGroup", targetNamespace = "")
        C2CGroup1 c2CGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "c2CGroups", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<C2CGroup2>> c2CGroups);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param callingFilterID
     * @param requestHeader
     * @param fullNumber
     */
    @WebMethod(action = "urn:createCallingFilterID")
    @RequestWrapper(localName = "createCallingFilterID", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateCallingFilterID")
    @ResponseWrapper(localName = "createCallingFilterIDResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateCallingFilterIDResponse")
    public void createCallingFilterID(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "callingFilterID", targetNamespace = "")
        CallingFilterID callingFilterID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param feeIndex
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createFeeIndex")
    @RequestWrapper(localName = "createFeeIndex", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFeeIndex")
    @ResponseWrapper(localName = "createFeeIndexResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFeeIndexResponse")
    public void createFeeIndex(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "feeIndex", targetNamespace = "")
        FeeIndex1 feeIndex,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param personalHuntTimes
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param personalHuntTime
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPersonalHuntTime")
    @RequestWrapper(localName = "listPersonalHuntTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPersonalHuntTime")
    @ResponseWrapper(localName = "listPersonalHuntTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPersonalHuntTimeResponse")
    public void listPersonalHuntTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "personalHuntTime", targetNamespace = "")
        PersonalHuntTime2 personalHuntTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "personalHuntTimes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PersonalHuntTime1>> personalHuntTimes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param officeZone
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param officeZones
     */
    @WebMethod(action = "urn:listOfficeZone")
    @RequestWrapper(localName = "listOfficeZone", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListOfficeZone")
    @ResponseWrapper(localName = "listOfficeZoneResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListOfficeZoneResponse")
    public void listOfficeZone(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "officeZone", targetNamespace = "")
        OfficeZone1 officeZone,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "officeZones", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<OfficeZone>> officeZones);

    /**
     * 
     * @param annDescription
     * @param returnDes
     * @param annID
     * @param languageID
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:modifyEntAnnDesc")
    @RequestWrapper(localName = "modifyEntAnnDesc", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEntAnnDesc")
    @ResponseWrapper(localName = "modifyEntAnnDescResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEntAnnDescResponse")
    public void modifyEntAnnDesc(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "annID", targetNamespace = "")
        String annID,
        @WebParam(name = "languageID", targetNamespace = "")
        String languageID,
        @WebParam(name = "annDescription", targetNamespace = "")
        String annDescription,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupUser
     * @param huntingGroupUser0
     */
    @WebMethod(action = "urn:displayHuntingGroupUser")
    @RequestWrapper(localName = "displayHuntingGroupUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHuntingGroupUser")
    @ResponseWrapper(localName = "displayHuntingGroupUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHuntingGroupUserResponse")
    public void displayHuntingGroupUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupUser", targetNamespace = "")
        HuntingGroupUser2 huntingGroupUser,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingGroupUser", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<HuntingGroupUser3> huntingGroupUser0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param functionProfile
     */
    @WebMethod(action = "urn:modifyFunctionProfile")
    @RequestWrapper(localName = "modifyFunctionProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyFunctionProfile")
    @ResponseWrapper(localName = "modifyFunctionProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyFunctionProfileResponse")
    public void modifyFunctionProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "functionProfile", targetNamespace = "")
        FunctionProfile1 functionProfile,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingListEntry
     * @param huntingListEntry0
     */
    @WebMethod(action = "urn:displayPersonalHuntListEntry")
    @RequestWrapper(localName = "displayPersonalHuntListEntry", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPersonalHuntListEntry")
    @ResponseWrapper(localName = "displayPersonalHuntListEntryResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPersonalHuntListEntryResponse")
    public void displayPersonalHuntListEntry(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingListEntry", targetNamespace = "")
        HuntingListEntry2 huntingListEntry,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingListEntry", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<HuntingListEntry3> huntingListEntry0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupUser
     * @param entryRowIndex
     */
    @WebMethod(action = "urn:createHuntingGroupUser")
    @RequestWrapper(localName = "createHuntingGroupUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHuntingGroupUser")
    @ResponseWrapper(localName = "createHuntingGroupUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHuntingGroupUserResponse")
    public void createHuntingGroupUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupUser", targetNamespace = "")
        HuntingGroupUser huntingGroupUser,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "entryRowIndex", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> entryRowIndex);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param pickupGroupUser
     * @param requestHeader
     * @param entryRowIndex
     */
    @WebMethod(action = "urn:createPickupGroupUser")
    @RequestWrapper(localName = "createPickupGroupUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePickupGroupUser")
    @ResponseWrapper(localName = "createPickupGroupUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePickupGroupUserResponse")
    public void createPickupGroupUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pickupGroupUser", targetNamespace = "")
        PickUpGroupUser pickupGroupUser,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "entryRowIndex", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> entryRowIndex);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param pickupGroupUser
     * @param requestHeader
     */
    @WebMethod(action = "urn:deletePickupGroupUser")
    @RequestWrapper(localName = "deletePickupGroupUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePickupGroupUser")
    @ResponseWrapper(localName = "deletePickupGroupUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePickupGroupUserResponse")
    public void deletePickupGroupUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pickupGroupUser", targetNamespace = "")
        PickUpGroupUser2 pickupGroupUser,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param pickupGroupUser
     * @param pickupGroupUsers
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPickupGroupUser")
    @RequestWrapper(localName = "listPickupGroupUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPickupGroupUser")
    @ResponseWrapper(localName = "listPickupGroupUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPickupGroupUserResponse")
    public void listPickupGroupUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "pickupGroupUser", targetNamespace = "")
        PickUpGroupUser2 pickupGroupUser,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "pickupGroupUsers", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PickUpGroupUser3>> pickupGroupUsers,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param pbxRemAccesss
     * @param pbxRemAccess
     */
    @WebMethod(action = "urn:listPBXRemAccess")
    @RequestWrapper(localName = "listPBXRemAccess", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPBXRemAccess")
    @ResponseWrapper(localName = "listPBXRemAccessResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPBXRemAccessResponse")
    public void listPBXRemAccess(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pbxRemAccess", targetNamespace = "")
        PBXRemAccess1 pbxRemAccess,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "pbxRemAccesss", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PBXRemAccess2>> pbxRemAccesss);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param helpDesk
     */
    @WebMethod(action = "urn:modifyHelpDesk")
    @RequestWrapper(localName = "modifyHelpDesk", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHelpDesk")
    @ResponseWrapper(localName = "modifyHelpDeskResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHelpDeskResponse")
    public void modifyHelpDesk(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "helpDesk", targetNamespace = "")
        HelpDesk helpDesk,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param enterpriseInbt
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:addEnterpriseInBT")
    @RequestWrapper(localName = "addEnterpriseInBT", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.AddEnterpriseInBT")
    @ResponseWrapper(localName = "addEnterpriseInBTResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.AddEnterpriseInBTResponse")
    public void addEnterpriseInBT(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseInbt", targetNamespace = "")
        EnterpriseInBT enterpriseInbt,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param enterprise
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:displayEnterprise")
    @RequestWrapper(localName = "displayEnterprise", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayEnterprise")
    @ResponseWrapper(localName = "displayEnterpriseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayEnterpriseResponse")
    public void displayEnterprise(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "enterprise", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<Enterprise2> enterprise);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param fnFListNumbers
     * @param currentPage
     * @param fnFListNumber
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listFnFListNumber")
    @RequestWrapper(localName = "listFnFListNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFnFListNumber")
    @ResponseWrapper(localName = "listFnFListNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFnFListNumberResponse")
    public void listFnFListNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "fnFListNumber", targetNamespace = "")
        FnFListNumber2 fnFListNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "fnFListNumbers", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<FnFListNumber>> fnFListNumbers);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param restrictionUserList
     * @param restrictionUserLists
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listRestrictionUserList")
    @RequestWrapper(localName = "listRestrictionUserList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListRestrictionUserList")
    @ResponseWrapper(localName = "listRestrictionUserListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListRestrictionUserListResponse")
    public void listRestrictionUserList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "restrictionUserList", targetNamespace = "")
        RestrictionUserList restrictionUserList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "restrictionUserLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<RestrictionUserList1>> restrictionUserLists);

    /**
     * 
     * @param listGroupInfo
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param totalPageNum
     * @param iVPNSyncStatusCheck
     * @param rowsPerPage
     * @param enterpriseName
     * @param listMemberInfo
     */
    @WebMethod(action = "urn:listInfoWithIVPNSyncErr")
    @RequestWrapper(localName = "listInfoWithIVPNSyncErr", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListInfoWithIVPNSyncErr")
    @ResponseWrapper(localName = "listInfoWithIVPNSyncErrResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListInfoWithIVPNSyncErrResponse")
    public void listInfoWithIVPNSyncErr(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "iVPNSyncStatusCheck", targetNamespace = "")
        IVPNSyncStatusCheck iVPNSyncStatusCheck,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "enterpriseID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> enterpriseID,
        @WebParam(name = "enterpriseName", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> enterpriseName,
        @WebParam(name = "listGroupInfo", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListGroupInfo> listGroupInfo,
        @WebParam(name = "listMemberInfo", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ListMemberInfo> listMemberInfo);

    /**
     * 
     * @param returnDes
     * @param officeZone
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyOfficeZone")
    @RequestWrapper(localName = "modifyOfficeZone", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyOfficeZone")
    @ResponseWrapper(localName = "modifyOfficeZoneResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyOfficeZoneResponse")
    public void modifyOfficeZone(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "officeZone", targetNamespace = "")
        OfficeZone officeZone,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param pnpPolicy0
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pnpPolicy
     */
    @WebMethod(action = "urn:displayPNPPolicy")
    @RequestWrapper(localName = "displayPNPPolicy", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPNPPolicy")
    @ResponseWrapper(localName = "displayPNPPolicyResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPNPPolicyResponse")
    public void displayPNPPolicy(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pnpPolicy", targetNamespace = "")
        PNPPolicy1 pnpPolicy,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "pnpPolicy", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<PNPPolicy> pnpPolicy0);

    /**
     * 
     * @param pbxPrevent
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deletePBXPrevent")
    @RequestWrapper(localName = "deletePBXPrevent", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePBXPrevent")
    @ResponseWrapper(localName = "deletePBXPreventResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePBXPreventResponse")
    public void deletePBXPrevent(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pbxPrevent", targetNamespace = "")
        PBXPrevent1 pbxPrevent,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param enterpriseAdmin
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyEnterpriseAdministrator")
    @RequestWrapper(localName = "modifyEnterpriseAdministrator", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEnterpriseAdministrator")
    @ResponseWrapper(localName = "modifyEnterpriseAdministratorResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEnterpriseAdministratorResponse")
    public void modifyEnterpriseAdministrator(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseAdmin", targetNamespace = "")
        EnterpriseAdmin1 enterpriseAdmin,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param smsBroadcastCode
     * @param responseHeader
     * @param requestHeader
     * @param smsListID
     */
    @WebMethod(action = "urn:createSMSBroadcastCode")
    @RequestWrapper(localName = "createSMSBroadcastCode", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSMSBroadcastCode")
    @ResponseWrapper(localName = "createSMSBroadcastCodeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSMSBroadcastCodeResponse")
    public void createSMSBroadcastCode(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "smsBroadcastCode", targetNamespace = "")
        SMSBroadcastCode smsBroadcastCode,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "smsListID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> smsListID);

    /**
     * 
     * @param returnDes
     * @param smsBroadcastCode
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifySMSBroadcastCode")
    @RequestWrapper(localName = "modifySMSBroadcastCode", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySMSBroadcastCode")
    @ResponseWrapper(localName = "modifySMSBroadcastCodeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySMSBroadcastCodeResponse")
    public void modifySMSBroadcastCode(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "smsBroadcastCode", targetNamespace = "")
        SMSBroadcastCode2 smsBroadcastCode,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param enterpriseLicense
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyEnterpriseLicense")
    @RequestWrapper(localName = "modifyEnterpriseLicense", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEnterpriseLicense")
    @ResponseWrapper(localName = "modifyEnterpriseLicenseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEnterpriseLicenseResponse")
    public void modifyEnterpriseLicense(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseLicense", targetNamespace = "")
        EnterpriseLicense enterpriseLicense,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param interGroup
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteIntergroup")
    @RequestWrapper(localName = "deleteIntergroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteIntergroup")
    @ResponseWrapper(localName = "deleteIntergroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteIntergroupResponse")
    public void deleteIntergroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "interGroup", targetNamespace = "")
        InterGroup interGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param startNumber
     * @param totalSize
     * @param typeOfNumber
     * @param responseHeader
     * @param numbers
     * @param requestHeader
     * @param endNumber
     * @param currentPage
     * @param totalPageNum
     * @param spID
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listNumber")
    @RequestWrapper(localName = "listNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListNumber")
    @ResponseWrapper(localName = "listNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListNumberResponse")
    public void listNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "startNumber", targetNamespace = "")
        String startNumber,
        @WebParam(name = "endNumber", targetNamespace = "")
        String endNumber,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "typeOfNumber", targetNamespace = "")
        String typeOfNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "numbers", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<Number>> numbers);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroup
     */
    @WebMethod(action = "urn:deleteHuntingGroup")
    @RequestWrapper(localName = "deleteHuntingGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHuntingGroup")
    @ResponseWrapper(localName = "deleteHuntingGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHuntingGroupResponse")
    public void deleteHuntingGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroup", targetNamespace = "")
        HuntingGroup2 huntingGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pnpPolicy
     */
    @WebMethod(action = "urn:modifyPNPPolicy")
    @RequestWrapper(localName = "modifyPNPPolicy", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPNPPolicy")
    @ResponseWrapper(localName = "modifyPNPPolicyResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPNPPolicyResponse")
    public void modifyPNPPolicy(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pnpPolicy", targetNamespace = "")
        PNPPolicy pnpPolicy,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pkgFeeType
     */
    @WebMethod(action = "urn:deletePkgFeeInfo")
    @RequestWrapper(localName = "deletePkgFeeInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePkgFeeInfo")
    @ResponseWrapper(localName = "deletePkgFeeInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePkgFeeInfoResponse")
    public void deletePkgFeeInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pkgFeeType", targetNamespace = "")
        String pkgFeeType,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param fnFListRelation
     */
    @WebMethod(action = "urn:deleteFnFListRelation")
    @RequestWrapper(localName = "deleteFnFListRelation", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFnFListRelation")
    @ResponseWrapper(localName = "deleteFnFListRelationResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFnFListRelationResponse")
    public void deleteFnFListRelation(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fnFListRelation", targetNamespace = "")
        FnFListRelation fnFListRelation,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param huntGroupID
     * @param requestHeader
     * @param huntingGroup
     */
    @WebMethod(action = "urn:createHuntingGroup")
    @RequestWrapper(localName = "createHuntingGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHuntingGroup")
    @ResponseWrapper(localName = "createHuntingGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHuntingGroupResponse")
    public void createHuntingGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroup", targetNamespace = "")
        HuntingGroup huntingGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntGroupID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> huntGroupID);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pickupGroup
     * @param pickupGroupID
     */
    @WebMethod(action = "urn:createPickupGroup")
    @RequestWrapper(localName = "createPickupGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePickupGroup")
    @ResponseWrapper(localName = "createPickupGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePickupGroupResponse")
    public void createPickupGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pickupGroup", targetNamespace = "")
        PickupGroup pickupGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "pickupGroupID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> pickupGroupID);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pickupGroup
     */
    @WebMethod(action = "urn:modifyPickupGroup")
    @RequestWrapper(localName = "modifyPickupGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPickupGroup")
    @ResponseWrapper(localName = "modifyPickupGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPickupGroupResponse")
    public void modifyPickupGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pickupGroup", targetNamespace = "")
        PickupGroup2 pickupGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pickupGroup
     */
    @WebMethod(action = "urn:deletePickupGroup")
    @RequestWrapper(localName = "deletePickupGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePickupGroup")
    @ResponseWrapper(localName = "deletePickupGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePickupGroupResponse")
    public void deletePickupGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pickupGroup", targetNamespace = "")
        PickupGroup3 pickupGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pickupGroup
     * @param pickupGroups
     */
    @WebMethod(action = "urn:displayPickupGroup")
    @RequestWrapper(localName = "displayPickupGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPickupGroup")
    @ResponseWrapper(localName = "displayPickupGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPickupGroupResponse")
    public void displayPickupGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pickupGroup", targetNamespace = "")
        PickupGroup4 pickupGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "pickupGroups", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PickupGroupInfo>> pickupGroups);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param pickupGroup
     * @param currentPage
     * @param totalPageNum
     * @param pickupGroups
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPickupGroup")
    @RequestWrapper(localName = "listPickupGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPickupGroup")
    @ResponseWrapper(localName = "listPickupGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPickupGroupResponse")
    public void listPickupGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "pickupGroup", targetNamespace = "")
        PickupGroup5 pickupGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "pickupGroups", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PickupGroupInfo>> pickupGroups,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage);

    /**
     * 
     * @param returnDes
     * @param officeZone
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteOfficeZone")
    @RequestWrapper(localName = "deleteOfficeZone", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteOfficeZone")
    @ResponseWrapper(localName = "deleteOfficeZoneResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteOfficeZoneResponse")
    public void deleteOfficeZone(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "officeZone", targetNamespace = "")
        OfficeZone1 officeZone,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param feeIndex
     * @param responseHeader
     * @param requestHeader
     * @param feeIndex0
     */
    @WebMethod(action = "urn:displayFeeIndex")
    @RequestWrapper(localName = "displayFeeIndex", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayFeeIndex")
    @ResponseWrapper(localName = "displayFeeIndexResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayFeeIndexResponse")
    public void displayFeeIndex(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "feeIndex", targetNamespace = "")
        FeeIndex2 feeIndex,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "feeIndex", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<FeeIndex1> feeIndex0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param restrictionUserList
     */
    @WebMethod(action = "urn:deleteRestrictionUserList")
    @RequestWrapper(localName = "deleteRestrictionUserList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteRestrictionUserList")
    @ResponseWrapper(localName = "deleteRestrictionUserListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteRestrictionUserListResponse")
    public void deleteRestrictionUserList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "restrictionUserList", targetNamespace = "")
        RestrictionUserList1 restrictionUserList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param restrictionUserListInfoLists
     * @param userListDescription
     * @param userListName
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param userListID
     */
    @WebMethod(action = "urn:createRestrictionUserList")
    @RequestWrapper(localName = "createRestrictionUserList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateRestrictionUserList")
    @ResponseWrapper(localName = "createRestrictionUserListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateRestrictionUserListResponse")
    public void createRestrictionUserList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "userListID", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<String> userListID,
        @WebParam(name = "userListName", targetNamespace = "")
        String userListName,
        @WebParam(name = "userListDescription", targetNamespace = "")
        String userListDescription,
        @WebParam(name = "restrictionUserListInfoLists", targetNamespace = "")
        List<RestrictionUserListInfoList> restrictionUserListInfoLists,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param fnFList
     * @param responseHeader
     * @param requestHeader
     * @param fnFList0
     */
    @WebMethod(action = "urn:displayFnFList")
    @RequestWrapper(localName = "displayFnFList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayFnFList")
    @ResponseWrapper(localName = "displayFnFListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayFnFListResponse")
    public void displayFnFList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fnFList", targetNamespace = "")
        FnFList1 fnFList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "fnFList", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<FnFList> fnFList0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param businessTribe
     */
    @WebMethod(action = "urn:modifyBusinessTribe")
    @RequestWrapper(localName = "modifyBusinessTribe", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyBusinessTribe")
    @ResponseWrapper(localName = "modifyBusinessTribeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyBusinessTribeResponse")
    public void modifyBusinessTribe(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "businessTribe", targetNamespace = "")
        BusinessTribe businessTribe,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param functionProfileName
     * @param returnDes
     * @param functionProfileID
     * @param totalSize
     * @param functionProfiles
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param spID
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listFunctionProfile")
    @RequestWrapper(localName = "listFunctionProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFunctionProfile")
    @ResponseWrapper(localName = "listFunctionProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFunctionProfileResponse")
    public void listFunctionProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "functionProfileID", targetNamespace = "")
        String functionProfileID,
        @WebParam(name = "functionProfileName", targetNamespace = "")
        String functionProfileName,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "functionProfiles", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<FunctionProfile1>> functionProfiles);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param fnFListNumber
     */
    @WebMethod(action = "urn:deleteFnFListNumber")
    @RequestWrapper(localName = "deleteFnFListNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFnFListNumber")
    @ResponseWrapper(localName = "deleteFnFListNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFnFListNumberResponse")
    public void deleteFnFListNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fnFListNumber", targetNamespace = "")
        FnFListNumber fnFListNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param displayFlag
     * @param cpc
     * @param responseHeader
     * @param displayInfo
     * @param cpcInfos
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param q825
     */
    @WebMethod(action = "urn:listCPC")
    @RequestWrapper(localName = "listCPC", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCPC")
    @ResponseWrapper(localName = "listCPCResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCPCResponse")
    public void listCPC(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "cpc", targetNamespace = "")
        String cpc,
        @WebParam(name = "q825", targetNamespace = "")
        String q825,
        @WebParam(name = "displayInfo", targetNamespace = "")
        String displayInfo,
        @WebParam(name = "displayFlag", targetNamespace = "")
        String displayFlag,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "cpcInfos", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<CpcInfo>> cpcInfos);

    /**
     * 
     * @param returnDes
     * @param huntingTimeItemID
     * @param huntGroupID
     * @param responseHeader
     * @param requestHeader
     * @param huntingTimeID
     * @param enterpriseID
     * @param huntingGroupTime
     */
    @WebMethod(action = "urn:displayHuntingGroupTime")
    @RequestWrapper(localName = "displayHuntingGroupTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHuntingGroupTime")
    @ResponseWrapper(localName = "displayHuntingGroupTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHuntingGroupTimeResponse")
    public void displayHuntingGroupTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "huntGroupID", targetNamespace = "")
        String huntGroupID,
        @WebParam(name = "huntingTimeID", targetNamespace = "")
        String huntingTimeID,
        @WebParam(name = "huntingTimeItemID", targetNamespace = "")
        String huntingTimeItemID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingGroupTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<HuntingGroupTime1> huntingGroupTime);

    /**
     * 
     * @param returnDes
     * @param functionProfileID
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:deleteEnterpriseLicense")
    @RequestWrapper(localName = "deleteEnterpriseLicense", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEnterpriseLicense")
    @ResponseWrapper(localName = "deleteEnterpriseLicenseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEnterpriseLicenseResponse")
    public void deleteEnterpriseLicense(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "functionProfileID", targetNamespace = "")
        String functionProfileID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param enterpriseLicense
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createEnterpriseLicense")
    @RequestWrapper(localName = "createEnterpriseLicense", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateEnterpriseLicense")
    @ResponseWrapper(localName = "createEnterpriseLicenseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateEnterpriseLicenseResponse")
    public void createEnterpriseLicense(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseLicense", targetNamespace = "")
        EnterpriseLicense enterpriseLicense,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param attendantWorkTime
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteAttendantWorkTime")
    @RequestWrapper(localName = "deleteAttendantWorkTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteAttendantWorkTime")
    @ResponseWrapper(localName = "deleteAttendantWorkTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteAttendantWorkTimeResponse")
    public void deleteAttendantWorkTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "attendantWorkTime", targetNamespace = "")
        AttendantWorkTime1 attendantWorkTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param c2CGroup
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteC2CGroup")
    @RequestWrapper(localName = "deleteC2CGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteC2CGroup")
    @ResponseWrapper(localName = "deleteC2CGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteC2CGroupResponse")
    public void deleteC2CGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "c2CGroup", targetNamespace = "")
        C2CGroup1 c2CGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param serialProvision
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createSerialNumber")
    @RequestWrapper(localName = "createSerialNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSerialNumber")
    @ResponseWrapper(localName = "createSerialNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSerialNumberResponse")
    public void createSerialNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "serialProvision", targetNamespace = "")
        SerialProvision serialProvision,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param huntingListID
     * @param responseHeader
     * @param personalHunting
     * @param requestHeader
     */
    @WebMethod(action = "urn:createPersonalHunting")
    @RequestWrapper(localName = "createPersonalHunting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePersonalHunting")
    @ResponseWrapper(localName = "createPersonalHuntingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePersonalHuntingResponse")
    public void createPersonalHunting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHunting", targetNamespace = "")
        PersonalHunting personalHunting,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingListID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> huntingListID);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param callAdmissionControl
     * @param requestHeader
     */
    @WebMethod(action = "urn:createCallAdmissionControl")
    @RequestWrapper(localName = "createCallAdmissionControl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateCallAdmissionControl")
    @ResponseWrapper(localName = "createCallAdmissionControlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateCallAdmissionControlResponse")
    public void createCallAdmissionControl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callAdmissionControl", targetNamespace = "")
        CallAdmissionControl callAdmissionControl,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param interGroup
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param interGroups
     */
    @WebMethod(action = "urn:listIntergroup")
    @RequestWrapper(localName = "listIntergroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListIntergroup")
    @ResponseWrapper(localName = "listIntergroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListIntergroupResponse")
    public void listIntergroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "interGroup", targetNamespace = "")
        InterGroup interGroup,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "interGroups", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<InterGroup1>> interGroups);

    /**
     * 
     * @param returnDes
     * @param userGroups
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param userGroup
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listUserGroup")
    @RequestWrapper(localName = "listUserGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListUserGroup")
    @ResponseWrapper(localName = "listUserGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListUserGroupResponse")
    public void listUserGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "userGroup", targetNamespace = "")
        UserGroup2 userGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "userGroups", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<UserGroup1>> userGroups);

    /**
     * 
     * @param batchOprSequence
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param memberBatche
     */
    @WebMethod(action = "urn:queryMemberBatchResult")
    @RequestWrapper(localName = "queryMemberBatchResult", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.QueryMemberBatchResult")
    @ResponseWrapper(localName = "queryMemberBatchResultResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.QueryMemberBatchResultResponse")
    public void queryMemberBatchResult(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "batchOprSequence", targetNamespace = "")
        String batchOprSequence,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "memberBatche", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<MemberBatche1> memberBatche);

    /**
     * 
     * @param vipLists
     * @param vipList
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listVIPList")
    @RequestWrapper(localName = "listVIPList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListVIPList")
    @ResponseWrapper(localName = "listVIPListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListVIPListResponse")
    public void listVIPList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "vipList", targetNamespace = "")
        VIPList vipList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "vipLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<VIPList>> vipLists);

    /**
     * 
     * @param returnDes
     * @param speedNLInfoList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifySpeedNumberList")
    @RequestWrapper(localName = "modifySpeedNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySpeedNumberList")
    @ResponseWrapper(localName = "modifySpeedNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySpeedNumberListResponse")
    public void modifySpeedNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "speedNLInfoList", targetNamespace = "")
        SpeedNLInfoList speedNLInfoList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param restriction
     * @param responseHeader
     * @param requestHeader
     * @param restriction0
     */
    @WebMethod(action = "urn:displayRestriction")
    @RequestWrapper(localName = "displayRestriction", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayRestriction")
    @ResponseWrapper(localName = "displayRestrictionResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayRestrictionResponse")
    public void displayRestriction(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "restriction", targetNamespace = "")
        Restriction2 restriction,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "restriction", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<Restriction1> restriction0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param spID
     * @param listType
     * @param rowsPerPage
     * @param enterprises
     * @param totalSize
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param enterpriseName
     * @param activeFlag
     */
    @WebMethod(action = "urn:listEnterprise")
    @RequestWrapper(localName = "listEnterprise", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEnterprise")
    @ResponseWrapper(localName = "listEnterpriseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEnterpriseResponse")
    public void listEnterprise(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "enterpriseName", targetNamespace = "")
        String enterpriseName,
        @WebParam(name = "activeFlag", targetNamespace = "")
        String activeFlag,
        @WebParam(name = "listType", targetNamespace = "")
        String listType,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "enterprises", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<Enterprise2>> enterprises);

    /**
     * 
     * @param returnDes
     * @param enterprise
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyEnterprise")
    @RequestWrapper(localName = "modifyEnterprise", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEnterprise")
    @ResponseWrapper(localName = "modifyEnterpriseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEnterpriseResponse")
    public void modifyEnterprise(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterprise", targetNamespace = "")
        Enterprise1 enterprise,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param userGroup0
     * @param responseHeader
     * @param requestHeader
     * @param userGroup
     */
    @WebMethod(action = "urn:displayUserGroup")
    @RequestWrapper(localName = "displayUserGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayUserGroup")
    @ResponseWrapper(localName = "displayUserGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayUserGroupResponse")
    public void displayUserGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "userGroup", targetNamespace = "")
        UserGroup2 userGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "userGroup", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<UserGroup1> userGroup0);

    /**
     * 
     * @param discountNumberLists
     * @param discountListDescription
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param discountIndex
     * @param discountListName
     * @param enterpriseID
     */
    @WebMethod(action = "urn:createDiscountlist")
    @RequestWrapper(localName = "createDiscountlist", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateDiscountlist")
    @ResponseWrapper(localName = "createDiscountlistResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateDiscountlistResponse")
    public void createDiscountlist(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "discountNumberLists", targetNamespace = "")
        List<DiscountNumberList> discountNumberLists,
        @WebParam(name = "discountIndex", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<String> discountIndex,
        @WebParam(name = "discountListName", targetNamespace = "")
        String discountListName,
        @WebParam(name = "discountListDescription", targetNamespace = "")
        String discountListDescription,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param huntingGroupSeqLists
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupSeqList
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listHuntingGroupSeqList")
    @RequestWrapper(localName = "listHuntingGroupSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHuntingGroupSeqList")
    @ResponseWrapper(localName = "listHuntingGroupSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHuntingGroupSeqListResponse")
    public void listHuntingGroupSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "huntingGroupSeqList", targetNamespace = "")
        HuntingGroupSeqList2 huntingGroupSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "huntingGroupSeqLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<HuntingGroupSeqList1>> huntingGroupSeqLists);

    /**
     * 
     * @param returnDes
     * @param enterpriseAdmin
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteEnterpriseAdministrator")
    @RequestWrapper(localName = "deleteEnterpriseAdministrator", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEnterpriseAdministrator")
    @ResponseWrapper(localName = "deleteEnterpriseAdministratorResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEnterpriseAdministratorResponse")
    public void deleteEnterpriseAdministrator(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseAdmin", targetNamespace = "")
        EnterpriseAdmin enterpriseAdmin,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param ivpnEnterpriseRelation
     */
    @WebMethod(action = "urn:modifyIVPNEnterpriseRelation")
    @RequestWrapper(localName = "modifyIVPNEnterpriseRelation", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyIVPNEnterpriseRelation")
    @ResponseWrapper(localName = "modifyIVPNEnterpriseRelationResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyIVPNEnterpriseRelationResponse")
    public void modifyIVPNEnterpriseRelation(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "ivpnEnterpriseRelation", targetNamespace = "")
        IVPNEnterpriseRelation ivpnEnterpriseRelation,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param callingBind
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createCallingBind")
    @RequestWrapper(localName = "createCallingBind", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateCallingBind")
    @ResponseWrapper(localName = "createCallingBindResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateCallingBindResponse")
    public void createCallingBind(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callingBind", targetNamespace = "")
        CallingBind callingBind,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param memberBatche
     */
    @WebMethod(action = "urn:createMemberBatches")
    @RequestWrapper(localName = "createMemberBatches", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateMemberBatches")
    @ResponseWrapper(localName = "createMemberBatchesResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateMemberBatchesResponse")
    public void createMemberBatches(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "memberBatche", targetNamespace = "")
        MemberBatche memberBatche,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param fnFList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteFnFList")
    @RequestWrapper(localName = "deleteFnFList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFnFList")
    @ResponseWrapper(localName = "deleteFnFListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFnFListResponse")
    public void deleteFnFList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fnFList", targetNamespace = "")
        FnFList1 fnFList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param pkgFeeName
     * @param responseHeader
     * @param requestHeader
     * @param pkgFeeIndex
     * @param pkgFeeType
     */
    @WebMethod(action = "urn:displayPkgFeeInfo")
    @RequestWrapper(localName = "displayPkgFeeInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPkgFeeInfo")
    @ResponseWrapper(localName = "displayPkgFeeInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPkgFeeInfoResponse")
    public void displayPkgFeeInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pkgFeeType", targetNamespace = "")
        String pkgFeeType,
        @WebParam(name = "pkgFeeName", targetNamespace = "")
        String pkgFeeName,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "pkgFeeIndex", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<PkgFeeIndex1> pkgFeeIndex);

    /**
     * 
     * @param returnDes
     * @param feeIndex
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyFeeIndex")
    @RequestWrapper(localName = "modifyFeeIndex", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyFeeIndex")
    @ResponseWrapper(localName = "modifyFeeIndexResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyFeeIndexResponse")
    public void modifyFeeIndex(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "feeIndex", targetNamespace = "")
        FeeIndex1 feeIndex,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param callingBind
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteCallingBind")
    @RequestWrapper(localName = "deleteCallingBind", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCallingBind")
    @ResponseWrapper(localName = "deleteCallingBindResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCallingBindResponse")
    public void deleteCallingBind(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callingBind", targetNamespace = "")
        CallingBind1 callingBind,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param snlInfoList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifySnl")
    @RequestWrapper(localName = "modifySnl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySnl")
    @ResponseWrapper(localName = "modifySnlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySnlResponse")
    public void modifySnl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "snlInfoList", targetNamespace = "")
        SNLInfoList snlInfoList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param carrierCode
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param carrierCodeCfgInfoLists
     */
    @WebMethod(action = "urn:listCarrierCodeCfg")
    @RequestWrapper(localName = "listCarrierCodeCfg", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCarrierCodeCfg")
    @ResponseWrapper(localName = "listCarrierCodeCfgResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCarrierCodeCfgResponse")
    public void listCarrierCodeCfg(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "carrierCode", targetNamespace = "")
        CarrierCode carrierCode,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "carrierCodeCfgInfoLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<CarrierCodeCfgInfoList>> carrierCodeCfgInfoLists);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param fnFListRelation
     */
    @WebMethod(action = "urn:fnfCounterReset")
    @RequestWrapper(localName = "fnfCounterReset", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.FnfCounterReset")
    @ResponseWrapper(localName = "fnfCounterResetResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.FnfCounterResetResponse")
    public void fnfCounterReset(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fnFListRelation", targetNamespace = "")
        FnFListRelation2 fnFListRelation,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param enterpriseInbt
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteEnterpriseInBT")
    @RequestWrapper(localName = "deleteEnterpriseInBT", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEnterpriseInBT")
    @ResponseWrapper(localName = "deleteEnterpriseInBTResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEnterpriseInBTResponse")
    public void deleteEnterpriseInBT(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseInbt", targetNamespace = "")
        EnterpriseInBT enterpriseInbt,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param userGroup
     */
    @WebMethod(action = "urn:deleteUserGroup")
    @RequestWrapper(localName = "deleteUserGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteUserGroup")
    @ResponseWrapper(localName = "deleteUserGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteUserGroupResponse")
    public void deleteUserGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "userGroup", targetNamespace = "")
        UserGroup2 userGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pbxRemAccess0
     * @param pbxRemAccess
     */
    @WebMethod(action = "urn:displayPBXRemAccess")
    @RequestWrapper(localName = "displayPBXRemAccess", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPBXRemAccess")
    @ResponseWrapper(localName = "displayPBXRemAccessResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPBXRemAccessResponse")
    public void displayPBXRemAccess(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pbxRemAccess", targetNamespace = "")
        PBXRemAccess1 pbxRemAccess,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "pbxRemAccess", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<PBXRemAccess2> pbxRemAccess0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param pnpPolicyDesc
     * @param requestHeader
     * @param enterpriseID
     * @param pnpPolicyID
     */
    @WebMethod(action = "urn:createPNPPolicy")
    @RequestWrapper(localName = "createPNPPolicy", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePNPPolicy")
    @ResponseWrapper(localName = "createPNPPolicyResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePNPPolicyResponse")
    public void createPNPPolicy(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "pnpPolicyDesc", targetNamespace = "")
        String pnpPolicyDesc,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "pnpPolicyID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> pnpPolicyID);

    /**
     * 
     * @param returnDes
     * @param routingBasedOnCaller0
     * @param routingBasedOnCaller
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createNumberBasedRouting")
    @RequestWrapper(localName = "createNumberBasedRouting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateNumberBasedRouting")
    @ResponseWrapper(localName = "createNumberBasedRoutingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateNumberBasedRoutingResponse")
    public void createNumberBasedRouting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "routingBasedOnCaller", targetNamespace = "")
        RoutingBasedOnCaller3 routingBasedOnCaller,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "routingBasedOnCaller", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<RoutingBasedOnCaller1> routingBasedOnCaller0);

    /**
     * 
     * @param returnDes
     * @param smsBroadcastCode
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteSMSBroadcastCode")
    @RequestWrapper(localName = "deleteSMSBroadcastCode", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSMSBroadcastCode")
    @ResponseWrapper(localName = "deleteSMSBroadcastCodeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSMSBroadcastCodeResponse")
    public void deleteSMSBroadcastCode(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "smsBroadcastCode", targetNamespace = "")
        SMSBroadcastCode1 smsBroadcastCode,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param ivpnEnterpriseRelation
     */
    @WebMethod(action = "urn:createIVPNEnterpriseRelation")
    @RequestWrapper(localName = "createIVPNEnterpriseRelation", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateIVPNEnterpriseRelation")
    @ResponseWrapper(localName = "createIVPNEnterpriseRelationResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateIVPNEnterpriseRelationResponse")
    public void createIVPNEnterpriseRelation(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "ivpnEnterpriseRelation", targetNamespace = "")
        IVPNEnterpriseRelation ivpnEnterpriseRelation,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param callAdmissionControl
     * @param requestHeader
     * @param callAdmissionControls
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param entTotalMaxConcurrentLimit
     */
    @WebMethod(action = "urn:listCallAdmissionControl")
    @RequestWrapper(localName = "listCallAdmissionControl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCallAdmissionControl")
    @ResponseWrapper(localName = "listCallAdmissionControlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCallAdmissionControlResponse")
    public void listCallAdmissionControl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "callAdmissionControl", targetNamespace = "")
        CallAdmissionControl1 callAdmissionControl,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "callAdmissionControls", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<CallAdmissionControl>> callAdmissionControls,
        @WebParam(name = "entTotalMaxConcurrentLimit", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> entTotalMaxConcurrentLimit);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param vipCustomer
     */
    @WebMethod(action = "urn:modifyVIPCustomerList")
    @RequestWrapper(localName = "modifyVIPCustomerList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyVIPCustomerList")
    @ResponseWrapper(localName = "modifyVIPCustomerListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyVIPCustomerListResponse")
    public void modifyVIPCustomerList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "vipCustomer", targetNamespace = "")
        VipCustomer1 vipCustomer,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param gprsPkg
     */
    @WebMethod(action = "urn:deleteGPRSPkg")
    @RequestWrapper(localName = "deleteGPRSPkg", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteGPRSPkg")
    @ResponseWrapper(localName = "deleteGPRSPkgResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteGPRSPkgResponse")
    public void deleteGPRSPkg(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "gprsPkg", targetNamespace = "")
        GPRSPkg gprsPkg,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param pbxLink
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createPBXLink")
    @RequestWrapper(localName = "createPBXLink", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePBXLink")
    @ResponseWrapper(localName = "createPBXLinkResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePBXLinkResponse")
    public void createPBXLink(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pbxLink", targetNamespace = "")
        PBXLink1 pbxLink,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param helpDesk
     */
    @WebMethod(action = "urn:deleteHelpDesk")
    @RequestWrapper(localName = "deleteHelpDesk", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHelpDesk")
    @ResponseWrapper(localName = "deleteHelpDeskResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHelpDeskResponse")
    public void deleteHelpDesk(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "helpDesk", targetNamespace = "")
        HelpDesk1 helpDesk,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param serialProvision
     * @param returnDes
     * @param totalSize
     * @param serialProvisions
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listSerialNumber")
    @RequestWrapper(localName = "listSerialNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSerialNumber")
    @ResponseWrapper(localName = "listSerialNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSerialNumberResponse")
    public void listSerialNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "serialProvision", targetNamespace = "")
        SerialProvision serialProvision,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "serialProvisions", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<SerialProvision1>> serialProvisions);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param ivpnEnterpriseRelations
     * @param requestHeader
     * @param ivpnEnterpriseRelation
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listIVPNEnterpriseRelation")
    @RequestWrapper(localName = "listIVPNEnterpriseRelation", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListIVPNEnterpriseRelation")
    @ResponseWrapper(localName = "listIVPNEnterpriseRelationResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListIVPNEnterpriseRelationResponse")
    public void listIVPNEnterpriseRelation(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "ivpnEnterpriseRelation", targetNamespace = "")
        IVPNEnterpriseRelation1 ivpnEnterpriseRelation,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "ivpnEnterpriseRelations", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<IVPNEnterpriseRelation2>> ivpnEnterpriseRelations);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param vipCustomer
     */
    @WebMethod(action = "urn:deleteVIPCustomerList")
    @RequestWrapper(localName = "deleteVIPCustomerList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteVIPCustomerList")
    @ResponseWrapper(localName = "deleteVIPCustomerListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteVIPCustomerListResponse")
    public void deleteVIPCustomerList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "vipCustomer", targetNamespace = "")
        VipCustomer2 vipCustomer,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param profile0
     * @param profile
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:displayProfile")
    @RequestWrapper(localName = "displayProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayProfile")
    @ResponseWrapper(localName = "displayProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayProfileResponse")
    public void displayProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "profile", targetNamespace = "")
        Profile2 profile,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "profile", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<Profile1> profile0);

    /**
     * 
     * @param speedNumber
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param fullNumber
     */
    @WebMethod(action = "urn:deleteSpeedNumberList")
    @RequestWrapper(localName = "deleteSpeedNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSpeedNumberList")
    @ResponseWrapper(localName = "deleteSpeedNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSpeedNumberListResponse")
    public void deleteSpeedNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "speedNumber", targetNamespace = "")
        String speedNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupSeqList
     */
    @WebMethod(action = "urn:modifyHuntingGroupSeqList")
    @RequestWrapper(localName = "modifyHuntingGroupSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHuntingGroupSeqList")
    @ResponseWrapper(localName = "modifyHuntingGroupSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHuntingGroupSeqListResponse")
    public void modifyHuntingGroupSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupSeqList", targetNamespace = "")
        HuntingGroupSeqList1 huntingGroupSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param gprsPkgName
     * @param gprsPkgID
     * @param responseHeader
     * @param requestHeader
     * @param spID
     */
    @WebMethod(action = "urn:createGPRSPkg")
    @RequestWrapper(localName = "createGPRSPkg", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateGPRSPkg")
    @ResponseWrapper(localName = "createGPRSPkgResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateGPRSPkgResponse")
    public void createGPRSPkg(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "gprsPkgName", targetNamespace = "")
        String gprsPkgName,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "gprsPkgID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> gprsPkgID);

    /**
     * 
     * @param returnDes
     * @param fnFList
     * @param responseHeader
     * @param requestHeader
     * @param spID
     */
    @WebMethod(action = "urn:modifyFnFList")
    @RequestWrapper(localName = "modifyFnFList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyFnFList")
    @ResponseWrapper(localName = "modifyFnFListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyFnFListResponse")
    public void modifyFnFList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "fnFList", targetNamespace = "")
        FnFList3 fnFList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param helpDesk0
     * @param responseHeader
     * @param requestHeader
     * @param helpDesk
     */
    @WebMethod(action = "urn:displayHelpDesk")
    @RequestWrapper(localName = "displayHelpDesk", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHelpDesk")
    @ResponseWrapper(localName = "displayHelpDeskResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHelpDeskResponse")
    public void displayHelpDesk(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "helpDesk", targetNamespace = "")
        HelpDesk1 helpDesk,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "helpDesk", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<HelpDesk> helpDesk0);

    /**
     * 
     * @param returnDes
     * @param snlInfoList
     * @param responseHeader
     * @param requestHeader
     * @param snlInfoList0
     */
    @WebMethod(action = "urn:displaySnl")
    @RequestWrapper(localName = "displaySnl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplaySnl")
    @ResponseWrapper(localName = "displaySnlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplaySnlResponse")
    public void displaySnl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "snlInfoList", targetNamespace = "")
        SNLInfoList1 snlInfoList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "snlInfoList", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<SNLInfoList> snlInfoList0);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param snlInfoList
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param snlInfoLists
     */
    @WebMethod(action = "urn:listSnl")
    @RequestWrapper(localName = "listSnl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSnl")
    @ResponseWrapper(localName = "listSnlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSnlResponse")
    public void listSnl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "snlInfoList", targetNamespace = "")
        SNLInfoList1 snlInfoList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "snlInfoLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<SNLInfoList>> snlInfoLists);

    /**
     * 
     * @param returnDes
     * @param huntingTimeItemID
     * @param huntGroupID
     * @param responseHeader
     * @param requestHeader
     * @param huntingTimeID
     * @param enterpriseID
     */
    @WebMethod(action = "urn:deleteHuntingGroupTime")
    @RequestWrapper(localName = "deleteHuntingGroupTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHuntingGroupTime")
    @ResponseWrapper(localName = "deleteHuntingGroupTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteHuntingGroupTimeResponse")
    public void deleteHuntingGroupTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "huntGroupID", targetNamespace = "")
        String huntGroupID,
        @WebParam(name = "huntingTimeID", targetNamespace = "")
        String huntingTimeID,
        @WebParam(name = "huntingTimeItemID", targetNamespace = "")
        String huntingTimeItemID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param restriction
     * @param responseHeader
     * @param restrictions
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listRestriction")
    @RequestWrapper(localName = "listRestriction", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListRestriction")
    @ResponseWrapper(localName = "listRestrictionResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListRestrictionResponse")
    public void listRestriction(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "restriction", targetNamespace = "")
        Restriction3 restriction,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "restrictions", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<Restriction4>> restrictions);

    /**
     * 
     * @param returnDes
     * @param snlInfoList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createSnl")
    @RequestWrapper(localName = "createSnl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSnl")
    @ResponseWrapper(localName = "createSnlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSnlResponse")
    public void createSnl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "snlInfoList", targetNamespace = "")
        SNLInfoList snlInfoList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupTime
     */
    @WebMethod(action = "urn:modifyHuntingGroupTime")
    @RequestWrapper(localName = "modifyHuntingGroupTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHuntingGroupTime")
    @ResponseWrapper(localName = "modifyHuntingGroupTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHuntingGroupTimeResponse")
    public void modifyHuntingGroupTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupTime", targetNamespace = "")
        HuntingGroupTime1 huntingGroupTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param interGroup
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createIntergroup")
    @RequestWrapper(localName = "createIntergroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateIntergroup")
    @ResponseWrapper(localName = "createIntergroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateIntergroupResponse")
    public void createIntergroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "interGroup", targetNamespace = "")
        InterGroup interGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroup
     */
    @WebMethod(action = "urn:modifyHuntingGroup")
    @RequestWrapper(localName = "modifyHuntingGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHuntingGroup")
    @ResponseWrapper(localName = "modifyHuntingGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHuntingGroupResponse")
    public void modifyHuntingGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroup", targetNamespace = "")
        HuntingGroup1 huntingGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param pbxPrevent
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createPBXPrevent")
    @RequestWrapper(localName = "createPBXPrevent", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePBXPrevent")
    @ResponseWrapper(localName = "createPBXPreventResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePBXPreventResponse")
    public void createPBXPrevent(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pbxPrevent", targetNamespace = "")
        PBXPrevent1 pbxPrevent,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param fnFListRelations
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param fnFListRelation
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listFnFListRelation")
    @RequestWrapper(localName = "listFnFListRelation", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFnFListRelation")
    @ResponseWrapper(localName = "listFnFListRelationResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFnFListRelationResponse")
    public void listFnFListRelation(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "fnFListRelation", targetNamespace = "")
        FnFListRelation1 fnFListRelation,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "fnFListRelations", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<FnFListRelation3>> fnFListRelations);

    /**
     * 
     * @param returnDes
     * @param personalHuntSeqList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyPersonalHuntSeqList")
    @RequestWrapper(localName = "modifyPersonalHuntSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPersonalHuntSeqList")
    @ResponseWrapper(localName = "modifyPersonalHuntSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPersonalHuntSeqListResponse")
    public void modifyPersonalHuntSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHuntSeqList", targetNamespace = "")
        PersonalHuntSeqList1 personalHuntSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:deleteEnterprise")
    @RequestWrapper(localName = "deleteEnterprise", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEnterprise")
    @ResponseWrapper(localName = "deleteEnterpriseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEnterpriseResponse")
    public void deleteEnterprise(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param businessTribe0
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param businessTribe
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listBusinessTribe")
    @RequestWrapper(localName = "listBusinessTribe", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListBusinessTribe")
    @ResponseWrapper(localName = "listBusinessTribeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListBusinessTribeResponse")
    public void listBusinessTribe(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "businessTribe", targetNamespace = "")
        BusinessTribe1 businessTribe,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "businessTribe", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<BusinessTribe>> businessTribe0);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroup
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param huntingGroups
     */
    @WebMethod(action = "urn:listHuntingGroup")
    @RequestWrapper(localName = "listHuntingGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHuntingGroup")
    @ResponseWrapper(localName = "listHuntingGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHuntingGroupResponse")
    public void listHuntingGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "huntingGroup", targetNamespace = "")
        HuntingGroup3 huntingGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "huntingGroups", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<HuntingGroup4>> huntingGroups);

    /**
     * 
     * @param speedNumber
     * @param returnDes
     * @param responseHeader
     * @param speedNLInfoList
     * @param requestHeader
     * @param enterpriseID
     * @param fullNumber
     */
    @WebMethod(action = "urn:displaySpeedNumberList")
    @RequestWrapper(localName = "displaySpeedNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplaySpeedNumberList")
    @ResponseWrapper(localName = "displaySpeedNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplaySpeedNumberListResponse")
    public void displaySpeedNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "speedNumber", targetNamespace = "")
        String speedNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "speedNLInfoList", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<SpeedNLInfoList> speedNLInfoList);

    /**
     * 
     * @param returnDes
     * @param member
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyMember")
    @RequestWrapper(localName = "modifyMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyMember")
    @ResponseWrapper(localName = "modifyMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyMemberResponse")
    public void modifyMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "member", targetNamespace = "")
        Member1 member,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param pnpPolicys
     * @param responseHeader
     * @param requestHeader
     * @param pnpPolicy
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPNPPolicy")
    @RequestWrapper(localName = "listPNPPolicy", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPNPPolicy")
    @ResponseWrapper(localName = "listPNPPolicyResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPNPPolicyResponse")
    public void listPNPPolicy(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "pnpPolicy", targetNamespace = "")
        PNPPolicy pnpPolicy,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "pnpPolicys", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PNPPolicy>> pnpPolicys);

    /**
     * 
     * @param gmNumber
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deletePBXLink")
    @RequestWrapper(localName = "deletePBXLink", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePBXLink")
    @ResponseWrapper(localName = "deletePBXLinkResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePBXLinkResponse")
    public void deletePBXLink(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "gmNumber", targetNamespace = "")
        String gmNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param cpcInfo
     * @param requestHeader
     */
    @WebMethod(action = "urn:addCPC")
    @RequestWrapper(localName = "addCPC", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.AddCPC")
    @ResponseWrapper(localName = "addCPCResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.AddCPCResponse")
    public void addCPC(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "cpcInfo", targetNamespace = "")
        CpcInfo cpcInfo,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param menuID
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:deleteIVRMenu")
    @RequestWrapper(localName = "deleteIVRMenu", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteIVRMenu")
    @ResponseWrapper(localName = "deleteIVRMenuResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteIVRMenuResponse")
    public void deleteIVRMenu(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "menuID", targetNamespace = "")
        String menuID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param scope
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param spID
     * @param rowsPerPage
     * @param fnFLists
     */
    @WebMethod(action = "urn:listFnFList")
    @RequestWrapper(localName = "listFnFList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFnFList")
    @ResponseWrapper(localName = "listFnFListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFnFListResponse")
    public void listFnFList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "scope", targetNamespace = "")
        String scope,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "fnFLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<FnFList>> fnFLists);

    /**
     * 
     * @param returnDes
     * @param routingBasedOnCaller0
     * @param routingBasedOnCaller
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:displayNumberBasedRouting")
    @RequestWrapper(localName = "displayNumberBasedRouting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayNumberBasedRouting")
    @ResponseWrapper(localName = "displayNumberBasedRoutingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayNumberBasedRoutingResponse")
    public void displayNumberBasedRouting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "routingBasedOnCaller", targetNamespace = "")
        RoutingBasedOnCaller2 routingBasedOnCaller,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "routingBasedOnCaller", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<RoutingBasedOnCaller4> routingBasedOnCaller0);

    /**
     * 
     * @param returnDes
     * @param snlInfoList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteSnl")
    @RequestWrapper(localName = "deleteSnl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSnl")
    @ResponseWrapper(localName = "deleteSnlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSnlResponse")
    public void deleteSnl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "snlInfoList", targetNamespace = "")
        SNLInfoList1 snlInfoList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param callAdmissionControl0
     * @param responseHeader
     * @param callAdmissionControl
     * @param requestHeader
     * @param entTotalMaxConcurrentLimit
     */
    @WebMethod(action = "urn:displayCallAdmissionControl")
    @RequestWrapper(localName = "displayCallAdmissionControl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayCallAdmissionControl")
    @ResponseWrapper(localName = "displayCallAdmissionControlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayCallAdmissionControlResponse")
    public void displayCallAdmissionControl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callAdmissionControl", targetNamespace = "")
        CallAdmissionControl1 callAdmissionControl,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "callAdmissionControl", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<CallAdmissionControl> callAdmissionControl0,
        @WebParam(name = "entTotalMaxConcurrentLimit", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> entTotalMaxConcurrentLimit);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param gprsPkgs
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param gprsPkg
     */
    @WebMethod(action = "urn:listGPRSPkg")
    @RequestWrapper(localName = "listGPRSPkg", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListGPRSPkg")
    @ResponseWrapper(localName = "listGPRSPkgResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListGPRSPkgResponse")
    public void listGPRSPkg(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "gprsPkg", targetNamespace = "")
        GPRSPkg gprsPkg,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "gprsPkgs", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<GPRSPkg>> gprsPkgs);

    /**
     * 
     * @param returnDes
     * @param profileID
     * @param profile
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createProfile")
    @RequestWrapper(localName = "createProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateProfile")
    @ResponseWrapper(localName = "createProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateProfileResponse")
    public void createProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "profile", targetNamespace = "")
        Profile profile,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "profileID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> profileID);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param userType
     * @param fullNumber
     */
    @WebMethod(action = "urn:deleteMember")
    @RequestWrapper(localName = "deleteMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteMember")
    @ResponseWrapper(localName = "deleteMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteMemberResponse")
    public void deleteMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "userType", targetNamespace = "")
        String userType,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param ivpnEnterpriseRelation
     */
    @WebMethod(action = "urn:deleteIVPNEnterpriseRelation")
    @RequestWrapper(localName = "deleteIVPNEnterpriseRelation", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteIVPNEnterpriseRelation")
    @ResponseWrapper(localName = "deleteIVPNEnterpriseRelationResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteIVPNEnterpriseRelationResponse")
    public void deleteIVPNEnterpriseRelation(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "ivpnEnterpriseRelation", targetNamespace = "")
        IVPNEnterpriseRelation1 ivpnEnterpriseRelation,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param restrictionTimes
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param restrictionTime
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listRestrictionTime")
    @RequestWrapper(localName = "listRestrictionTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListRestrictionTime")
    @ResponseWrapper(localName = "listRestrictionTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListRestrictionTimeResponse")
    public void listRestrictionTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "restrictionTime", targetNamespace = "")
        RestrictionTime3 restrictionTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "restrictionTimes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<RestrictionTime2>> restrictionTimes);

    /**
     * 
     * @param returnDes
     * @param c2CGroup
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createC2CGroup")
    @RequestWrapper(localName = "createC2CGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateC2CGroup")
    @ResponseWrapper(localName = "createC2CGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateC2CGroupResponse")
    public void createC2CGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "c2CGroup", targetNamespace = "")
        C2CGroup c2CGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param feeIndex
     * @param totalSize
     * @param responseHeader
     * @param feeIndexs
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listFeeIndex")
    @RequestWrapper(localName = "listFeeIndex", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFeeIndex")
    @ResponseWrapper(localName = "listFeeIndexResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListFeeIndexResponse")
    public void listFeeIndex(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "feeIndex", targetNamespace = "")
        FeeIndex2 feeIndex,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "feeIndexs", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<FeeIndex1>> feeIndexs);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param businessTribe
     */
    @WebMethod(action = "urn:createBusinessTribe")
    @RequestWrapper(localName = "createBusinessTribe", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateBusinessTribe")
    @ResponseWrapper(localName = "createBusinessTribeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateBusinessTribeResponse")
    public void createBusinessTribe(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "businessTribe", targetNamespace = "")
        BusinessTribe businessTribe,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param serialProvision
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifySerialNumber")
    @RequestWrapper(localName = "modifySerialNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySerialNumber")
    @ResponseWrapper(localName = "modifySerialNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySerialNumberResponse")
    public void modifySerialNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "serialProvision", targetNamespace = "")
        SerialProvision2 serialProvision,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param member
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createMember")
    @RequestWrapper(localName = "createMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateMember")
    @ResponseWrapper(localName = "createMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateMemberResponse")
    public void createMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "member", targetNamespace = "")
        Member member,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param templateID
     * @param totalPageNum
     * @param restrictionTemplateLists
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listRestrictionTemplate")
    @RequestWrapper(localName = "listRestrictionTemplate", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListRestrictionTemplate")
    @ResponseWrapper(localName = "listRestrictionTemplateResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListRestrictionTemplateResponse")
    public void listRestrictionTemplate(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "templateID", targetNamespace = "")
        String templateID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "restrictionTemplateLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<RestrictionTemplateList>> restrictionTemplateLists);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param description
     * @param requestHeader
     * @param fnFListRelation
     */
    @WebMethod(action = "urn:createFnFListRelation")
    @RequestWrapper(localName = "createFnFListRelation", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFnFListRelation")
    @ResponseWrapper(localName = "createFnFListRelationResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFnFListRelationResponse")
    public void createFnFListRelation(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fnFListRelation", targetNamespace = "")
        FnFListRelation fnFListRelation,
        @WebParam(name = "description", targetNamespace = "")
        String description,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param huntingListEntrys
     * @param requestHeader
     * @param huntingListEntry
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPersonalHuntListEntry")
    @RequestWrapper(localName = "listPersonalHuntListEntry", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPersonalHuntListEntry")
    @ResponseWrapper(localName = "listPersonalHuntListEntryResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPersonalHuntListEntryResponse")
    public void listPersonalHuntListEntry(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "huntingListEntry", targetNamespace = "")
        HuntingListEntry2 huntingListEntry,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "huntingListEntrys", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<HuntingListEntry3>> huntingListEntrys);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param entIVRMenus
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listIVRMenu")
    @RequestWrapper(localName = "listIVRMenu", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListIVRMenu")
    @ResponseWrapper(localName = "listIVRMenuResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListIVRMenuResponse")
    public void listIVRMenu(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "entIVRMenus", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<EntIVRMenu1>> entIVRMenus);

    /**
     * 
     * @param serialProvision
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param serialProvision0
     */
    @WebMethod(action = "urn:displaySerialNumber")
    @RequestWrapper(localName = "displaySerialNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplaySerialNumber")
    @ResponseWrapper(localName = "displaySerialNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplaySerialNumberResponse")
    public void displaySerialNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "serialProvision", targetNamespace = "")
        SerialProvision3 serialProvision,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "serialProvision", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<SerialProvision1> serialProvision0);

    /**
     * 
     * @param returnDes
     * @param routingBasedOnCaller
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyNumberBasedRouting")
    @RequestWrapper(localName = "modifyNumberBasedRouting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyNumberBasedRouting")
    @ResponseWrapper(localName = "modifyNumberBasedRoutingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyNumberBasedRoutingResponse")
    public void modifyNumberBasedRouting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "routingBasedOnCaller", targetNamespace = "")
        RoutingBasedOnCaller routingBasedOnCaller,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pbxRemAccess
     */
    @WebMethod(action = "urn:modifyPBXRemAccess")
    @RequestWrapper(localName = "modifyPBXRemAccess", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPBXRemAccess")
    @ResponseWrapper(localName = "modifyPBXRemAccessResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPBXRemAccessResponse")
    public void modifyPBXRemAccess(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pbxRemAccess", targetNamespace = "")
        PBXRemAccess pbxRemAccess,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param enterpriseAdmin
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createEnterpriseAdministrator")
    @RequestWrapper(localName = "createEnterpriseAdministrator", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateEnterpriseAdministrator")
    @ResponseWrapper(localName = "createEnterpriseAdministratorResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateEnterpriseAdministratorResponse")
    public void createEnterpriseAdministrator(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseAdmin", targetNamespace = "")
        EnterpriseAdmin enterpriseAdmin,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param callingFilterID
     * @param requestHeader
     * @param fullNumber
     */
    @WebMethod(action = "urn:dispCurrentFilterID")
    @RequestWrapper(localName = "dispCurrentFilterID", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DispCurrentFilterID")
    @ResponseWrapper(localName = "dispCurrentFilterIDResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DispCurrentFilterIDResponse")
    public void dispCurrentFilterID(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "callingFilterID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<CallingFilterID> callingFilterID);

    /**
     * 
     * @param returnDes
     * @param huntingTimeItemID
     * @param responseHeader
     * @param requestHeader
     * @param personalHuntTime
     */
    @WebMethod(action = "urn:createPersonalHuntTime")
    @RequestWrapper(localName = "createPersonalHuntTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePersonalHuntTime")
    @ResponseWrapper(localName = "createPersonalHuntTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePersonalHuntTimeResponse")
    public void createPersonalHuntTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHuntTime", targetNamespace = "")
        PersonalHuntTime personalHuntTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingTimeItemID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> huntingTimeItemID);

    /**
     * 
     * @param returnDes
     * @param cpc
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteCPC")
    @RequestWrapper(localName = "deleteCPC", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCPC")
    @ResponseWrapper(localName = "deleteCPCResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCPCResponse")
    public void deleteCPC(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "cpc", targetNamespace = "")
        String cpc,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param functionProfileID
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param enterpriseLicenses
     */
    @WebMethod(action = "urn:listEnterpriseLicense")
    @RequestWrapper(localName = "listEnterpriseLicense", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEnterpriseLicense")
    @ResponseWrapper(localName = "listEnterpriseLicenseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEnterpriseLicenseResponse")
    public void listEnterpriseLicense(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "functionProfileID", targetNamespace = "")
        String functionProfileID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "enterpriseLicenses", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<EnterpriseLicense1>> enterpriseLicenses);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param personalHuntTime
     */
    @WebMethod(action = "urn:modifyPersonalHuntTime")
    @RequestWrapper(localName = "modifyPersonalHuntTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPersonalHuntTime")
    @ResponseWrapper(localName = "modifyPersonalHuntTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPersonalHuntTimeResponse")
    public void modifyPersonalHuntTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHuntTime", targetNamespace = "")
        PersonalHuntTime1 personalHuntTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param annID
     * @param languageID
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:deleteEntAnn")
    @RequestWrapper(localName = "deleteEntAnn", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEntAnn")
    @ResponseWrapper(localName = "deleteEntAnnResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteEntAnnResponse")
    public void deleteEntAnn(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "annID", targetNamespace = "")
        String annID,
        @WebParam(name = "languageID", targetNamespace = "")
        String languageID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param timeIDName
     * @param timeIDDescription
     * @param returnDes
     * @param timeID
     * @param restrictionTimeLists
     * @param responseHeader
     * @param timeItemID
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:createRestrictionTime")
    @RequestWrapper(localName = "createRestrictionTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateRestrictionTime")
    @ResponseWrapper(localName = "createRestrictionTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateRestrictionTimeResponse")
    public void createRestrictionTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "timeID", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<String> timeID,
        @WebParam(name = "timeIDName", targetNamespace = "")
        String timeIDName,
        @WebParam(name = "timeIDDescription", targetNamespace = "")
        String timeIDDescription,
        @WebParam(name = "restrictionTimeLists", targetNamespace = "")
        List<RestrictionTimeList> restrictionTimeLists,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "timeItemID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> timeItemID);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param members
     * @param member
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listMember")
    @RequestWrapper(localName = "listMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListMember")
    @ResponseWrapper(localName = "listMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListMemberResponse")
    public void listMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "member", targetNamespace = "")
        Member3 member,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "members", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<Member4>> members);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param members
     * @param member
     * @param pagesize
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listMemberPTL")
    @RequestWrapper(localName = "listMemberPTL", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListMemberPTL")
    @ResponseWrapper(localName = "listMemberPTLResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListMemberPTLResponse")
    public void listMemberPTL(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "member", targetNamespace = "")
        MemberPtl member,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "Pagesize", targetNamespace = "")
        String pagesize,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "members", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<Member6>> members);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param remAccUserType
     * @param fullNumber
     */
    @WebMethod(action = "urn:resetRemAccessPIN")
    @RequestWrapper(localName = "resetRemAccessPIN", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ResetRemAccessPIN")
    @ResponseWrapper(localName = "resetRemAccessPINResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ResetRemAccessPINResponse")
    public void resetRemAccessPIN(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "remAccUserType", targetNamespace = "")
        String remAccUserType,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param cpcInfo
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyCPC")
    @RequestWrapper(localName = "modifyCPC", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyCPC")
    @ResponseWrapper(localName = "modifyCPCResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyCPCResponse")
    public void modifyCPC(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "cpcInfo", targetNamespace = "")
        CpcInfo cpcInfo,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param vipCustomer
     */
    @WebMethod(action = "urn:createVIPCustomerList")
    @RequestWrapper(localName = "createVIPCustomerList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateVIPCustomerList")
    @ResponseWrapper(localName = "createVIPCustomerListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateVIPCustomerListResponse")
    public void createVIPCustomerList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "vipCustomer", targetNamespace = "")
        VipCustomer vipCustomer,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupUser
     */
    @WebMethod(action = "urn:modifyHuntingGroupUser")
    @RequestWrapper(localName = "modifyHuntingGroupUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHuntingGroupUser")
    @ResponseWrapper(localName = "modifyHuntingGroupUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyHuntingGroupUserResponse")
    public void modifyHuntingGroupUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupUser", targetNamespace = "")
        HuntingGroupUser1 huntingGroupUser,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param timeID
     * @param responseHeader
     * @param timeItemID
     * @param requestHeader
     * @param enterpriseID
     * @param attendantTimeLists
     */
    @WebMethod(action = "urn:createAttendantWorkTime")
    @RequestWrapper(localName = "createAttendantWorkTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateAttendantWorkTime")
    @ResponseWrapper(localName = "createAttendantWorkTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateAttendantWorkTimeResponse")
    public void createAttendantWorkTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "timeID", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<String> timeID,
        @WebParam(name = "attendantTimeLists", targetNamespace = "")
        List<AttendantTimeList1> attendantTimeLists,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "timeItemID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> timeItemID);

    /**
     * 
     * @param returnDes
     * @param officeZone
     * @param responseHeader
     * @param requestHeader
     * @param officeZone0
     */
    @WebMethod(action = "urn:displayOfficeZone")
    @RequestWrapper(localName = "displayOfficeZone", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayOfficeZone")
    @ResponseWrapper(localName = "displayOfficeZoneResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayOfficeZoneResponse")
    public void displayOfficeZone(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "officeZone", targetNamespace = "")
        OfficeZone1 officeZone,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "officeZone", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<OfficeZone> officeZone0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroup
     * @param huntingGroup0
     */
    @WebMethod(action = "urn:displayHuntingGroup")
    @RequestWrapper(localName = "displayHuntingGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHuntingGroup")
    @ResponseWrapper(localName = "displayHuntingGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHuntingGroupResponse")
    public void displayHuntingGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroup", targetNamespace = "")
        HuntingGroup2 huntingGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingGroup", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<HuntingGroup4> huntingGroup0);

    /**
     * 
     * @param returnDes
     * @param smsBroadcastList
     * @param totalSize
     * @param smsBroadcastLists
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listSMSBroadcastList")
    @RequestWrapper(localName = "listSMSBroadcastList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSMSBroadcastList")
    @ResponseWrapper(localName = "listSMSBroadcastListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSMSBroadcastListResponse")
    public void listSMSBroadcastList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "smsBroadcastList", targetNamespace = "")
        SMSBroadcastList1 smsBroadcastList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "smsBroadcastLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<SMSBroadcastList>> smsBroadcastLists);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param helpDesk
     */
    @WebMethod(action = "urn:createHelpDesk")
    @RequestWrapper(localName = "createHelpDesk", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHelpDesk")
    @ResponseWrapper(localName = "createHelpDeskResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHelpDeskResponse")
    public void createHelpDesk(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "helpDesk", targetNamespace = "")
        HelpDesk helpDesk,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param batchProcessing
     * @param requestHeader
     * @param fullNumberList
     * @return
     *     returns com.huawei.ngin.vpncentrex.domain.ReturnDes
     */
    @WebMethod(action = "urn:batchProcessing")
    @WebResult(name = "returnDes", targetNamespace = "")
    @RequestWrapper(localName = "batchProcessing", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.BatchProcessing")
    @ResponseWrapper(localName = "batchProcessingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.BatchProcessingResponse")
    public ReturnDes batchProcessing(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumberList", targetNamespace = "")
        FullNumberList fullNumberList,
        @WebParam(name = "batchProcessing", targetNamespace = "")
        BatchProcessing batchProcessing);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param enterpriseAdmins
     * @param enterpriseAdmin
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listEnterpriseAdministrator")
    @RequestWrapper(localName = "listEnterpriseAdministrator", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEnterpriseAdministrator")
    @ResponseWrapper(localName = "listEnterpriseAdministratorResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEnterpriseAdministratorResponse")
    public void listEnterpriseAdministrator(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseAdmin", targetNamespace = "")
        EnterpriseAdmin enterpriseAdmin,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "enterpriseAdmins", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<EnterpriseAdmin2>> enterpriseAdmins);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param entAnn
     */
    @WebMethod(action = "urn:modifyEntAnnState")
    @RequestWrapper(localName = "modifyEntAnnState", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEntAnnState")
    @ResponseWrapper(localName = "modifyEntAnnStateResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyEntAnnStateResponse")
    public void modifyEntAnnState(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "entAnn", targetNamespace = "")
        EntAnn2 entAnn,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param entAnns
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param entAnn
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listEntAnn")
    @RequestWrapper(localName = "listEntAnn", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEntAnn")
    @ResponseWrapper(localName = "listEntAnnResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEntAnnResponse")
    public void listEntAnn(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "entAnn", targetNamespace = "")
        EntAnn4 entAnn,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "entAnns", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<EntAnn3>> entAnns);

    /**
     * 
     * @param returnDes
     * @param smsBroadcastCodes
     * @param totalSize
     * @param smsBroadcastCode
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listSMSBroadcastCode")
    @RequestWrapper(localName = "listSMSBroadcastCode", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSMSBroadcastCode")
    @ResponseWrapper(localName = "listSMSBroadcastCodeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSMSBroadcastCodeResponse")
    public void listSMSBroadcastCode(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "smsBroadcastCode", targetNamespace = "")
        SMSBroadcastCode3 smsBroadcastCode,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "smsBroadcastCodes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<SMSBroadcastCode2>> smsBroadcastCodes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param vipCustomers
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param vipCustomer
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listVIPCustomerList")
    @RequestWrapper(localName = "listVIPCustomerList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListVIPCustomerList")
    @ResponseWrapper(localName = "listVIPCustomerListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListVIPCustomerListResponse")
    public void listVIPCustomerList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "vipCustomer", targetNamespace = "")
        VipCustomer2 vipCustomer,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "vipCustomers", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<VipCustomer2>> vipCustomers);

    /**
     * 
     * @param returnDes
     * @param huntingGroupSeqList0
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupSeqList
     */
    @WebMethod(action = "urn:displayHuntingGroupSeqList")
    @RequestWrapper(localName = "displayHuntingGroupSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHuntingGroupSeqList")
    @ResponseWrapper(localName = "displayHuntingGroupSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayHuntingGroupSeqListResponse")
    public void displayHuntingGroupSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupSeqList", targetNamespace = "")
        HuntingGroupSeqList2 huntingGroupSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "huntingGroupSeqList", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<HuntingGroupSeqList1> huntingGroupSeqList0);

    /**
     * 
     * @param returnDes
     * @param annID
     * @param responseHeader
     * @param requestHeader
     * @param entAnn
     */
    @WebMethod(action = "urn:createEntAnn")
    @RequestWrapper(localName = "createEntAnn", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateEntAnn")
    @ResponseWrapper(localName = "createEntAnnResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateEntAnnResponse")
    public void createEntAnn(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "entAnn", targetNamespace = "")
        EntAnn1 entAnn,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "annID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> annID);

    /**
     * 
     * @param returnDes
     * @param personalHunting0
     * @param responseHeader
     * @param personalHunting
     * @param requestHeader
     */
    @WebMethod(action = "urn:displayPersonalHunting")
    @RequestWrapper(localName = "displayPersonalHunting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPersonalHunting")
    @ResponseWrapper(localName = "displayPersonalHuntingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPersonalHuntingResponse")
    public void displayPersonalHunting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHunting", targetNamespace = "")
        PersonalHunting1 personalHunting,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "personalHunting", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<PersonalHunting2> personalHunting0);

    /**
     * 
     * @param returnDes
     * @param officeZone
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createOfficeZone")
    @RequestWrapper(localName = "createOfficeZone", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateOfficeZone")
    @ResponseWrapper(localName = "createOfficeZoneResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateOfficeZoneResponse")
    public void createOfficeZone(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "officeZone", targetNamespace = "")
        OfficeZone officeZone,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param functionProfileID
     * @param responseHeader
     * @param requestHeader
     * @param spID
     */
    @WebMethod(action = "urn:deleteFunctionProfile")
    @RequestWrapper(localName = "deleteFunctionProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFunctionProfile")
    @ResponseWrapper(localName = "deleteFunctionProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFunctionProfileResponse")
    public void deleteFunctionProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "functionProfileID", targetNamespace = "")
        String functionProfileID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param annID
     * @param languageID
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param entAnn
     */
    @WebMethod(action = "urn:displayEntAnn")
    @RequestWrapper(localName = "displayEntAnn", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayEntAnn")
    @ResponseWrapper(localName = "displayEntAnnResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayEntAnnResponse")
    public void displayEntAnn(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "annID", targetNamespace = "")
        String annID,
        @WebParam(name = "languageID", targetNamespace = "")
        String languageID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "entAnn", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<EntAnn3> entAnn);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param callAdmissionControl
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteCallAdmissionControl")
    @RequestWrapper(localName = "deleteCallAdmissionControl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCallAdmissionControl")
    @ResponseWrapper(localName = "deleteCallAdmissionControlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCallAdmissionControlResponse")
    public void deleteCallAdmissionControl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callAdmissionControl", targetNamespace = "")
        CallAdmissionControl1 callAdmissionControl,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param ivpnEnterprises
     * @param ivpnEnterprise
     */
    @WebMethod(action = "urn:listIVPNEnterprise")
    @RequestWrapper(localName = "listIVPNEnterprise", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListIVPNEnterprise")
    @ResponseWrapper(localName = "listIVPNEnterpriseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListIVPNEnterpriseResponse")
    public void listIVPNEnterprise(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "ivpnEnterprise", targetNamespace = "")
        IVPNEnterprise ivpnEnterprise,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "ivpnEnterprises", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<IVPNEnterprise1>> ivpnEnterprises);

    /**
     * 
     * @param returnDes
     * @param startNumber
     * @param responseHeader
     * @param requestHeader
     * @param endNumber
     * @param spID
     */
    @WebMethod(action = "urn:deleteNumber")
    @RequestWrapper(localName = "deleteNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteNumber")
    @ResponseWrapper(localName = "deleteNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteNumberResponse")
    public void deleteNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "startNumber", targetNamespace = "")
        String startNumber,
        @WebParam(name = "endNumber", targetNamespace = "")
        String endNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param secretaryFullNumber
     * @param returnDes
     * @param totalSize
     * @param bossesStatusInfoLists
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listBossStatus")
    @RequestWrapper(localName = "listBossStatus", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListBossStatus")
    @ResponseWrapper(localName = "listBossStatusResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListBossStatusResponse")
    public void listBossStatus(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "secretaryFullNumber", targetNamespace = "")
        String secretaryFullNumber,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "bossesStatusInfoLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<BossesStatusInfoList>> bossesStatusInfoLists);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param bossFullNumber
     */
    @WebMethod(action = "urn:resetBossStatus")
    @RequestWrapper(localName = "resetBossStatus", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ResetBossStatus")
    @ResponseWrapper(localName = "resetBossStatusResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ResetBossStatusResponse")
    public void resetBossStatus(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "bossFullNumber", targetNamespace = "")
        String bossFullNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param pnpPolicy
     */
    @WebMethod(action = "urn:deletePNPPolicy")
    @RequestWrapper(localName = "deletePNPPolicy", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePNPPolicy")
    @ResponseWrapper(localName = "deletePNPPolicyResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePNPPolicyResponse")
    public void deletePNPPolicy(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pnpPolicy", targetNamespace = "")
        PNPPolicy1 pnpPolicy,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param attendantWorkTime
     * @param returnDes
     * @param attendantTime
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:displayAttendantWorkTime")
    @RequestWrapper(localName = "displayAttendantWorkTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayAttendantWorkTime")
    @ResponseWrapper(localName = "displayAttendantWorkTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayAttendantWorkTimeResponse")
    public void displayAttendantWorkTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "attendantWorkTime", targetNamespace = "")
        AttendantWorkTime1 attendantWorkTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "attendantTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<AttendantTime1> attendantTime);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param member
     * @param requestHeader
     * @param enterpriseID
     * @param userType
     * @param fullNumber
     */
    @WebMethod(action = "urn:displayMember")
    @RequestWrapper(localName = "displayMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayMember")
    @ResponseWrapper(localName = "displayMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayMemberResponse")
    public void displayMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "userType", targetNamespace = "")
        String userType,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "member", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<Member2> member);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param member
     * @param requestHeader
     * @param enterpriseID
     * @param userType
     * @param fullNumber
     */
    @WebMethod(action = "urn:displayMemberPTL")
    @RequestWrapper(localName = "displayMemberPTL", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayMemberPTL")
    @ResponseWrapper(localName = "displayMemberPTLResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayMemberPTLResponse")
    public void displayMemberPTL(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "userType", targetNamespace = "")
        String userType,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "member", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<Member5> member);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param helpDesks
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param helpDesk
     */
    @WebMethod(action = "urn:listHelpDesk")
    @RequestWrapper(localName = "listHelpDesk", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHelpDesk")
    @ResponseWrapper(localName = "listHelpDeskResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHelpDeskResponse")
    public void listHelpDesk(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "helpDesk", targetNamespace = "")
        HelpDesk helpDesk,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "helpDesks", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<HelpDesk>> helpDesks);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param userGroup
     */
    @WebMethod(action = "urn:modifyUserGroup")
    @RequestWrapper(localName = "modifyUserGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyUserGroup")
    @ResponseWrapper(localName = "modifyUserGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyUserGroupResponse")
    public void modifyUserGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "userGroup", targetNamespace = "")
        UserGroup3 userGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param functionProfileID
     * @param responseHeader
     * @param requestHeader
     * @param functionProfile
     */
    @WebMethod(action = "urn:createFunctionProfile")
    @RequestWrapper(localName = "createFunctionProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFunctionProfile")
    @ResponseWrapper(localName = "createFunctionProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFunctionProfileResponse")
    public void createFunctionProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "functionProfile", targetNamespace = "")
        FunctionProfile functionProfile,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "functionProfileID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> functionProfileID);

    /**
     * 
     * @param returnDes
     * @param restriction
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteRestriction")
    @RequestWrapper(localName = "deleteRestriction", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteRestriction")
    @ResponseWrapper(localName = "deleteRestrictionResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteRestrictionResponse")
    public void deleteRestriction(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "restriction", targetNamespace = "")
        Restriction2 restriction,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param fnFListNumber
     */
    @WebMethod(action = "urn:createFnFListNumber")
    @RequestWrapper(localName = "createFnFListNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFnFListNumber")
    @ResponseWrapper(localName = "createFnFListNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFnFListNumberResponse")
    public void createFnFListNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fnFListNumber", targetNamespace = "")
        FnFListNumber fnFListNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param enterpriseInbt0
     * @param enterpriseInbt
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param rowsPerPage
     * @param btName
     */
    @WebMethod(action = "urn:listEnterpriseInBT")
    @RequestWrapper(localName = "listEnterpriseInBT", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEnterpriseInBT")
    @ResponseWrapper(localName = "listEnterpriseInBTResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListEnterpriseInBTResponse")
    public void listEnterpriseInBT(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseInbt", targetNamespace = "")
        EnterpriseInBT enterpriseInbt,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "btName", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> btName,
        @WebParam(name = "enterpriseInbt", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<EnterpriseInBT1>> enterpriseInbt0);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param usergroupInfo
     * @param enterpriseInbt
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param rowsPerPage
     * @param btName
     * @param pnpPolicyID
     */
    @WebMethod(action = "urn:listUserGroupInEnterprise")
    @RequestWrapper(localName = "listUserGroupInEnterprise", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListUserGroupInEnterprise")
    @ResponseWrapper(localName = "listUserGroupInEnterpriseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListUserGroupInEnterpriseResponse")
    public void listUserGroupInEnterprise(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseInbt", targetNamespace = "")
        EnterpriseInBT enterpriseInbt,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "btName", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> btName,
        @WebParam(name = "enterpriseID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> enterpriseID,
        @WebParam(name = "pnpPolicyID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> pnpPolicyID,
        @WebParam(name = "usergroupInfo", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<UserGroupInfo>> usergroupInfo);

    /**
     * 
     * @param returnDes
     * @param restriction
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyRestriction")
    @RequestWrapper(localName = "modifyRestriction", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyRestriction")
    @ResponseWrapper(localName = "modifyRestrictionResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyRestrictionResponse")
    public void modifyRestriction(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "restriction", targetNamespace = "")
        Restriction1 restriction,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param huntingGroupUsers
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupUser
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listHuntingGroupUser")
    @RequestWrapper(localName = "listHuntingGroupUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHuntingGroupUser")
    @ResponseWrapper(localName = "listHuntingGroupUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHuntingGroupUserResponse")
    public void listHuntingGroupUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "huntingGroupUser", targetNamespace = "")
        HuntingGroupUser2 huntingGroupUser,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "huntingGroupUsers", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<HuntingGroupUser3>> huntingGroupUsers);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param businessTribe
     */
    @WebMethod(action = "urn:deleteBusinessTribe")
    @RequestWrapper(localName = "deleteBusinessTribe", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteBusinessTribe")
    @ResponseWrapper(localName = "deleteBusinessTribeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteBusinessTribeResponse")
    public void deleteBusinessTribe(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "businessTribe", targetNamespace = "")
        BusinessTribe1 businessTribe,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param callingFilterID
     * @param requestHeader
     * @param fullNumber
     */
    @WebMethod(action = "urn:modifyCallingFilterID")
    @RequestWrapper(localName = "modifyCallingFilterID", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyCallingFilterID")
    @ResponseWrapper(localName = "modifyCallingFilterIDResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyCallingFilterIDResponse")
    public void modifyCallingFilterID(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "callingFilterID", targetNamespace = "")
        CallingFilterID1 callingFilterID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param routingBasedOnCallers
     * @param routingBasedOnCaller
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listNumberBasedRouting")
    @RequestWrapper(localName = "listNumberBasedRouting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListNumberBasedRouting")
    @ResponseWrapper(localName = "listNumberBasedRoutingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListNumberBasedRoutingResponse")
    public void listNumberBasedRouting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "routingBasedOnCaller", targetNamespace = "")
        RoutingBasedOnCaller2 routingBasedOnCaller,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "routingBasedOnCallers", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<RoutingBasedOnCaller4>> routingBasedOnCallers);

    /**
     * 
     * @param vipList
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteVIPList")
    @RequestWrapper(localName = "deleteVIPList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteVIPList")
    @ResponseWrapper(localName = "deleteVIPListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteVIPListResponse")
    public void deleteVIPList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "vipList", targetNamespace = "")
        VIPList vipList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param listNo
     * @param responseHeader
     * @param requestHeader
     * @param fullNumber
     */
    @WebMethod(action = "urn:deleteCallingFilterID")
    @RequestWrapper(localName = "deleteCallingFilterID", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCallingFilterID")
    @ResponseWrapper(localName = "deleteCallingFilterIDResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCallingFilterIDResponse")
    public void deleteCallingFilterID(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "listNo", targetNamespace = "")
        String listNo,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param groupID
     * @param responseHeader
     * @param requestHeader
     * @param userGroup
     */
    @WebMethod(action = "urn:createUserGroup")
    @RequestWrapper(localName = "createUserGroup", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateUserGroup")
    @ResponseWrapper(localName = "createUserGroupResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateUserGroupResponse")
    public void createUserGroup(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "userGroup", targetNamespace = "")
        UserGroup userGroup,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "groupID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> groupID);

    /**
     * 
     * @param attendantWorkTime
     * @param returnDes
     * @param totalSize
     * @param attendantTimes
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listAttendantWorkTime")
    @RequestWrapper(localName = "listAttendantWorkTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListAttendantWorkTime")
    @ResponseWrapper(localName = "listAttendantWorkTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListAttendantWorkTimeResponse")
    public void listAttendantWorkTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "attendantWorkTime", targetNamespace = "")
        AttendantWorkTime1 attendantWorkTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "attendantTimes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<AttendantTime1>> attendantTimes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param restrictionTime0
     * @param restrictionTime
     */
    @WebMethod(action = "urn:displayRestrictionTime")
    @RequestWrapper(localName = "displayRestrictionTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayRestrictionTime")
    @ResponseWrapper(localName = "displayRestrictionTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayRestrictionTimeResponse")
    public void displayRestrictionTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "restrictionTime", targetNamespace = "")
        RestrictionTime1 restrictionTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "restrictionTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<RestrictionTime2> restrictionTime0);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param resetUserLists
     * @param requestHeader
     * @param userType
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param account
     */
    @WebMethod(action = "urn:listResetUser")
    @RequestWrapper(localName = "listResetUser", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListResetUser")
    @ResponseWrapper(localName = "listResetUserResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListResetUserResponse")
    public void listResetUser(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "account", targetNamespace = "")
        String account,
        @WebParam(name = "userType", targetNamespace = "")
        String userType,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "resetUserLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<ResetUserList>> resetUserLists);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param resyncDataToiVPN
     */
    @WebMethod(action = "urn:reSyncToIVPN")
    @RequestWrapper(localName = "reSyncToIVPN", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ReSyncToIVPN")
    @ResponseWrapper(localName = "reSyncToIVPNResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ReSyncToIVPNResponse")
    public void reSyncToIVPN(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "resyncDataToiVPN", targetNamespace = "")
        ResyncDataToiVPN resyncDataToiVPN,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param pbxLink
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyPBXLink")
    @RequestWrapper(localName = "modifyPBXLink", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPBXLink")
    @ResponseWrapper(localName = "modifyPBXLinkResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPBXLinkResponse")
    public void modifyPBXLink(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "pbxLink", targetNamespace = "")
        PBXLink2 pbxLink,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param discountListDescription
     * @param discountList
     * @param queryMode
     * @param returnDes
     * @param totalSize
     * @param discountlistInfos
     * @param responseHeader
     * @param requestHeader
     * @param discountListName
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listDiscountlist")
    @RequestWrapper(localName = "listDiscountlist", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListDiscountlist")
    @ResponseWrapper(localName = "listDiscountlistResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListDiscountlistResponse")
    public void listDiscountlist(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "discountList", targetNamespace = "")
        DiscountList discountList,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "discountListName", targetNamespace = "")
        String discountListName,
        @WebParam(name = "discountListDescription", targetNamespace = "")
        String discountListDescription,
        @WebParam(name = "queryMode", targetNamespace = "")
        String queryMode,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "discountlistInfos", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<DiscountlistInfo>> discountlistInfos);

    /**
     * 
     * @param speedNLInfoLists
     * @param speedNumber
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param fullNumber
     */
    @WebMethod(action = "urn:listSpeedNumberList")
    @RequestWrapper(localName = "listSpeedNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSpeedNumberList")
    @ResponseWrapper(localName = "listSpeedNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSpeedNumberListResponse")
    public void listSpeedNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "speedNumber", targetNamespace = "")
        String speedNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "speedNLInfoLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<SpeedNLInfoList>> speedNLInfoLists);

    /**
     * 
     * @param returnDes
     * @param fnFList
     * @param responseHeader
     * @param requestHeader
     * @param spID
     */
    @WebMethod(action = "urn:createFnFList")
    @RequestWrapper(localName = "createFnFList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFnFList")
    @ResponseWrapper(localName = "createFnFListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateFnFListResponse")
    public void createFnFList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "fnFList", targetNamespace = "")
        FnFList fnFList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param entIVRMenu
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createIVRMenu")
    @RequestWrapper(localName = "createIVRMenu", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateIVRMenu")
    @ResponseWrapper(localName = "createIVRMenuResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateIVRMenuResponse")
    public void createIVRMenu(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "entIVRMenu", targetNamespace = "")
        EntIVRMenu1 entIVRMenu,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param huntingListID
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:deletePersonalHunting")
    @RequestWrapper(localName = "deletePersonalHunting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePersonalHunting")
    @ResponseWrapper(localName = "deletePersonalHuntingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePersonalHuntingResponse")
    public void deletePersonalHunting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "huntingListID", targetNamespace = "")
        String huntingListID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param speedNLInfoList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createSpeedNumberList")
    @RequestWrapper(localName = "createSpeedNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSpeedNumberList")
    @ResponseWrapper(localName = "createSpeedNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSpeedNumberListResponse")
    public void createSpeedNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "speedNLInfoList", targetNamespace = "")
        SpeedNLInfoList speedNLInfoList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param personalHunting
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyPersonalHunting")
    @RequestWrapper(localName = "modifyPersonalHunting", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPersonalHunting")
    @ResponseWrapper(localName = "modifyPersonalHuntingResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPersonalHuntingResponse")
    public void modifyPersonalHunting(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHunting", targetNamespace = "")
        PersonalHunting3 personalHunting,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param restrictionTime
     */
    @WebMethod(action = "urn:deleteRestrictionTime")
    @RequestWrapper(localName = "deleteRestrictionTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteRestrictionTime")
    @ResponseWrapper(localName = "deleteRestrictionTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteRestrictionTimeResponse")
    public void deleteRestrictionTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "restrictionTime", targetNamespace = "")
        RestrictionTime1 restrictionTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param discountList
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteDiscountlist")
    @RequestWrapper(localName = "deleteDiscountlist", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteDiscountlist")
    @ResponseWrapper(localName = "deleteDiscountlistResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteDiscountlistResponse")
    public void deleteDiscountlist(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "discountList", targetNamespace = "")
        DiscountList discountList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param functionProfileID
     * @param enterpriseLicense
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:displayEnterpriseLicense")
    @RequestWrapper(localName = "displayEnterpriseLicense", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayEnterpriseLicense")
    @ResponseWrapper(localName = "displayEnterpriseLicenseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayEnterpriseLicenseResponse")
    public void displayEnterpriseLicense(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "functionProfileID", targetNamespace = "")
        String functionProfileID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "enterpriseLicense", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<EnterpriseLicense1> enterpriseLicense);

    /**
     * 
     * @param returnDes
     * @param personalHuntSeqList
     * @param responseHeader
     * @param requestHeader
     * @param personalHuntSeqList0
     */
    @WebMethod(action = "urn:displayPersonalHuntSeqList")
    @RequestWrapper(localName = "displayPersonalHuntSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPersonalHuntSeqList")
    @ResponseWrapper(localName = "displayPersonalHuntSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPersonalHuntSeqListResponse")
    public void displayPersonalHuntSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "personalHuntSeqList", targetNamespace = "")
        PersonalHuntSeqList2 personalHuntSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "personalHuntSeqList", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<PersonalHuntSeqList1> personalHuntSeqList0);

    /**
     * 
     * @param returnDes
     * @param smsBroadcastList
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createSMSBroadcastList")
    @RequestWrapper(localName = "createSMSBroadcastList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSMSBroadcastList")
    @ResponseWrapper(localName = "createSMSBroadcastListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSMSBroadcastListResponse")
    public void createSMSBroadcastList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "smsBroadcastList", targetNamespace = "")
        SMSBroadcastList smsBroadcastList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param currentFilterID
     * @param requestHeader
     */
    @WebMethod(action = "urn:setCurrentFilterID")
    @RequestWrapper(localName = "setCurrentFilterID", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.SetCurrentFilterID")
    @ResponseWrapper(localName = "setCurrentFilterIDResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.SetCurrentFilterIDResponse")
    public void setCurrentFilterID(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentFilterID", targetNamespace = "")
        CurrentFilterID currentFilterID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param seqRowIndex
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param huntingGroupSeqList
     */
    @WebMethod(action = "urn:createHuntingGroupSeqList")
    @RequestWrapper(localName = "createHuntingGroupSeqList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHuntingGroupSeqList")
    @ResponseWrapper(localName = "createHuntingGroupSeqListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateHuntingGroupSeqListResponse")
    public void createHuntingGroupSeqList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "huntingGroupSeqList", targetNamespace = "")
        HuntingGroupSeqList huntingGroupSeqList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "seqRowIndex", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> seqRowIndex);

    /**
     * 
     * @param returnDes
     * @param enterprise
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:createEnterprise")
    @RequestWrapper(localName = "createEnterprise", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateEnterprise")
    @ResponseWrapper(localName = "createEnterpriseResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateEnterpriseResponse")
    public void createEnterprise(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterprise", targetNamespace = "")
        Enterprise enterprise,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "enterpriseID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> enterpriseID);

    /**
     * 
     * @param returnDes
     * @param feeIndex
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteFeeIndex")
    @RequestWrapper(localName = "deleteFeeIndex", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFeeIndex")
    @ResponseWrapper(localName = "deleteFeeIndexResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteFeeIndexResponse")
    public void deleteFeeIndex(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "feeIndex", targetNamespace = "")
        FeeIndex2 feeIndex,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param gmNumber
     * @param returnDes
     * @param totalSize
     * @param groupID
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param pbxLinks
     */
    @WebMethod(action = "urn:listPBXLink")
    @RequestWrapper(localName = "listPBXLink", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPBXLink")
    @ResponseWrapper(localName = "listPBXLinkResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPBXLinkResponse")
    public void listPBXLink(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "groupID", targetNamespace = "")
        String groupID,
        @WebParam(name = "gmNumber", targetNamespace = "")
        String gmNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "pbxLinks", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PBXLink2>> pbxLinks);

    /**
     * 
     * @param returnDes
     * @param functionProfileID
     * @param responseHeader
     * @param requestHeader
     * @param spID
     * @param functionProfile
     */
    @WebMethod(action = "urn:displayFunctionProfile")
    @RequestWrapper(localName = "displayFunctionProfile", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayFunctionProfile")
    @ResponseWrapper(localName = "displayFunctionProfileResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayFunctionProfileResponse")
    public void displayFunctionProfile(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "spID", targetNamespace = "")
        String spID,
        @WebParam(name = "functionProfileID", targetNamespace = "")
        String functionProfileID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "functionProfile", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<FunctionProfile1> functionProfile);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param huntingTimeItemID
     * @param huntGroupID
     * @param responseHeader
     * @param requestHeader
     * @param huntingTimeID
     * @param enterpriseID
     * @param huntingGroupTimes
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listHuntingGroupTime")
    @RequestWrapper(localName = "listHuntingGroupTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHuntingGroupTime")
    @ResponseWrapper(localName = "listHuntingGroupTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListHuntingGroupTimeResponse")
    public void listHuntingGroupTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "huntGroupID", targetNamespace = "")
        String huntGroupID,
        @WebParam(name = "huntingTimeID", targetNamespace = "")
        String huntingTimeID,
        @WebParam(name = "huntingTimeItemID", targetNamespace = "")
        String huntingTimeItemID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "huntingGroupTimes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<HuntingGroupTime1>> huntingGroupTimes);

    /**
     * 
     * @param ivpnEnterpriseRelation0
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param ivpnEnterpriseRelation
     */
    @WebMethod(action = "urn:displayIVPNEnterpriseRelation")
    @RequestWrapper(localName = "displayIVPNEnterpriseRelation", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayIVPNEnterpriseRelation")
    @ResponseWrapper(localName = "displayIVPNEnterpriseRelationResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayIVPNEnterpriseRelationResponse")
    public void displayIVPNEnterpriseRelation(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "ivpnEnterpriseRelation", targetNamespace = "")
        IVPNEnterpriseRelation1 ivpnEnterpriseRelation,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "ivpnEnterpriseRelation", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<IVPNEnterpriseRelation2> ivpnEnterpriseRelation0);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param callAdmissionControl
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyCallAdmissionControl")
    @RequestWrapper(localName = "modifyCallAdmissionControl", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyCallAdmissionControl")
    @ResponseWrapper(localName = "modifyCallAdmissionControlResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyCallAdmissionControlResponse")
    public void modifyCallAdmissionControl(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callAdmissionControl", targetNamespace = "")
        CallAdmissionControl callAdmissionControl,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param consumptionReduction
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:callConsumptionReduction")
    @RequestWrapper(localName = "callConsumptionReduction", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CallConsumptionReduction")
    @ResponseWrapper(localName = "callConsumptionReductionResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CallConsumptionReductionResponse")
    public void callConsumptionReduction(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "consumptionReduction", targetNamespace = "")
        List<ConsumptionReduction> consumptionReduction,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param smsTemplate
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createSMSTemplate")
    @RequestWrapper(localName = "createSMSTemplate", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSMSTemplate")
    @ResponseWrapper(localName = "createSMSTemplateResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateSMSTemplateResponse")
    public void createSMSTemplate(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "SMSTemplate", targetNamespace = "")
        List<SMSTemplate> smsTemplate,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param smsTemplate
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifySMSTemplate")
    @RequestWrapper(localName = "modifySMSTemplate", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySMSTemplate")
    @ResponseWrapper(localName = "modifySMSTemplateResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifySMSTemplateResponse")
    public void modifySMSTemplate(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "SMSTemplate", targetNamespace = "")
        List<SMSTemplate> smsTemplate,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param smsTemplate1
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteSMSTemplate")
    @RequestWrapper(localName = "deleteSMSTemplate", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSMSTemplate")
    @ResponseWrapper(localName = "deleteSMSTemplateResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteSMSTemplateResponse")
    public void deleteSMSTemplate(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "SMSTemplate1", targetNamespace = "")
        List<SMSTemplate1> smsTemplate1,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param smsTemplate2
     * @param smsTemplate
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:displaySMSTemplate")
    @RequestWrapper(localName = "displaySMSTemplate", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplaySMSTemplate")
    @ResponseWrapper(localName = "displaySMSTemplateResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplaySMSTemplateResponse")
    public void displaySMSTemplate(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "SMSTemplate2", targetNamespace = "")
        List<SMSTemplate2> smsTemplate2,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "smsTemplate", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<SMSTemplate> smsTemplate);

    /**
     * 
     * @param returnDes
     * @param endRowIndex
     * @param smsTemplate1
     * @param totalSize
     * @param begingRowIndex
     * @param responseHeader
     * @param requestHeader
     * @param smsTemplates
     */
    @WebMethod(action = "urn:listSMSTemplate")
    @RequestWrapper(localName = "listSMSTemplate", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSMSTemplate")
    @ResponseWrapper(localName = "listSMSTemplateResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListSMSTemplateResponse")
    public void listSMSTemplate(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "begingRowIndex", targetNamespace = "")
        Integer begingRowIndex,
        @WebParam(name = "endRowIndex", targetNamespace = "")
        Integer endRowIndex,
        @WebParam(name = "SMSTemplate1", targetNamespace = "")
        List<SMSTemplate1> smsTemplate1,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "smsTemplates", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<SMSTemplate>> smsTemplates);

    /**
     * 
     * @param returnDes
     * @param callForwardingTime
     * @param responseHeader
     * @param requestHeader
     * @param callForwardingTimeItemID
     */
    @WebMethod(action = "urn:createCallForwardingTime")
    @RequestWrapper(localName = "createCallForwardingTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateCallForwardingTime")
    @ResponseWrapper(localName = "createCallForwardingTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateCallForwardingTimeResponse")
    public void createCallForwardingTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callForwardingTime", targetNamespace = "")
        CallForwardingTime callForwardingTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "callForwardingTimeItemID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> callForwardingTimeItemID);

    /**
     * 
     * @param returnDes
     * @param callForwardingTime
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyCallForwardingTime")
    @RequestWrapper(localName = "modifyCallForwardingTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyCallForwardingTime")
    @ResponseWrapper(localName = "modifyCallForwardingTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyCallForwardingTimeResponse")
    public void modifyCallForwardingTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "callForwardingTime", targetNamespace = "")
        CallForwardingTime1 callForwardingTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param callForwardingTimeItemID
     * @param fullNumber
     */
    @WebMethod(action = "urn:deleteCallForwardingTime")
    @RequestWrapper(localName = "deleteCallForwardingTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCallForwardingTime")
    @ResponseWrapper(localName = "deleteCallForwardingTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteCallForwardingTimeResponse")
    public void deleteCallForwardingTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "callForwardingTimeItemID", targetNamespace = "")
        String callForwardingTimeItemID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param callForwardingTime
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param callForwardingTimeItemID
     * @param fullNumber
     */
    @WebMethod(action = "urn:displayCallForwardingTime")
    @RequestWrapper(localName = "displayCallForwardingTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayCallForwardingTime")
    @ResponseWrapper(localName = "displayCallForwardingTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayCallForwardingTimeResponse")
    public void displayCallForwardingTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "callForwardingTimeItemID", targetNamespace = "")
        String callForwardingTimeItemID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "callForwardingTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<CallForwardingTime1> callForwardingTime);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param callForwardingTime
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param fullNumber
     */
    @WebMethod(action = "urn:listCallForwardingTime")
    @RequestWrapper(localName = "listCallForwardingTime", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCallForwardingTime")
    @ResponseWrapper(localName = "listCallForwardingTimeResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListCallForwardingTimeResponse")
    public void listCallForwardingTime(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "callForwardingTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<CallForwardingTime1>> callForwardingTime);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param subGroupNo
     * @param subGroupIVR
     * @param fullNumber
     */
    @WebMethod(action = "urn:createGroupCommunity")
    @RequestWrapper(localName = "createGroupCommunity", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateGroupCommunity")
    @ResponseWrapper(localName = "createGroupCommunityResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateGroupCommunityResponse")
    public void createGroupCommunity(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "subGroupNo", targetNamespace = "")
        String subGroupNo,
        @WebParam(name = "subGroupIVR", targetNamespace = "")
        String subGroupIVR,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param subGroupNo
     * @param subGroupIVR
     * @param fullNumber
     */
    @WebMethod(action = "urn:modifyGroupCommunity")
    @RequestWrapper(localName = "modifyGroupCommunity", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyGroupCommunity")
    @ResponseWrapper(localName = "modifyGroupCommunityResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyGroupCommunityResponse")
    public void modifyGroupCommunity(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "subGroupNo", targetNamespace = "")
        String subGroupNo,
        @WebParam(name = "subGroupIVR", targetNamespace = "")
        String subGroupIVR,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param subGroupNo
     * @param fullNumber
     */
    @WebMethod(action = "urn:deleteGroupCommunity")
    @RequestWrapper(localName = "deleteGroupCommunity", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteGroupCommunity")
    @ResponseWrapper(localName = "deleteGroupCommunityResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteGroupCommunityResponse")
    public void deleteGroupCommunity(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "subGroupNo", targetNamespace = "")
        String subGroupNo,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param groupCommunities
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param subGroupNo
     * @param rowsPerPage
     * @param fullNumber
     */
    @WebMethod(action = "urn:listGroupCommunity")
    @RequestWrapper(localName = "listGroupCommunity", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListGroupCommunity")
    @ResponseWrapper(localName = "listGroupCommunityResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListGroupCommunityResponse")
    public void listGroupCommunity(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "subGroupNo", targetNamespace = "")
        String subGroupNo,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "groupCommunities", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<GroupCommunities>> groupCommunities);

    /**
     * 
     * @param returnDes
     * @param administrator
     * @param balanceDate
     * @param gSharedFuncFlag
     * @param responseHeader
     * @param requestHeader
     * @param gPRSAccountLmt
     * @param threshold
     * @param enterpriseID
     * @param nextBalanceDate
     */
    @WebMethod(action = "urn:setVPNGrpShrdAccnt")
    @RequestWrapper(localName = "setVPNGrpShrdAccnt", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.SetVPNGrpShrdAccnt")
    @ResponseWrapper(localName = "setVPNGrpShrdAccntResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.SetVPNGrpShrdAccntResponse")
    public void setVPNGrpShrdAccnt(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "administrator", targetNamespace = "")
        String administrator,
        @WebParam(name = "gPRSAccountLmt", targetNamespace = "")
        GPRSAccountLmt gPRSAccountLmt,
        @WebParam(name = "gSharedFuncFlag", targetNamespace = "")
        String gSharedFuncFlag,
        @WebParam(name = "threshold", targetNamespace = "")
        String threshold,
        @WebParam(name = "balanceDate", targetNamespace = "")
        String balanceDate,
        @WebParam(name = "nextBalanceDate", targetNamespace = "")
        String nextBalanceDate,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:delVPNGrpShrdAccnt")
    @RequestWrapper(localName = "delVPNGrpShrdAccnt", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DelVPNGrpShrdAccnt")
    @ResponseWrapper(localName = "delVPNGrpShrdAccntResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DelVPNGrpShrdAccntResponse")
    public void delVPNGrpShrdAccnt(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param vpnGrpShrdAccnt
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:dispVPNGrpShrdAccnt")
    @RequestWrapper(localName = "dispVPNGrpShrdAccnt", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DispVPNGrpShrdAccnt")
    @ResponseWrapper(localName = "dispVPNGrpShrdAccntResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DispVPNGrpShrdAccntResponse")
    public void dispVPNGrpShrdAccnt(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "VPNGrpShrdAccnt", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<VPNGrpShrdAccnt> vpnGrpShrdAccnt);

    /**
     * 
     * @param returnDes
     * @param vpnGrpShrdAccnt
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listVPNGrpShrdAccnt")
    @RequestWrapper(localName = "listVPNGrpShrdAccnt", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListVPNGrpShrdAccnt")
    @ResponseWrapper(localName = "listVPNGrpShrdAccntResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListVPNGrpShrdAccntResponse")
    public void listVPNGrpShrdAccnt(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "VPNGrpShrdAccnt", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<VPNGrpShrdAccnt>> vpnGrpShrdAccnt);

    /**
     * 
     * @param gPRSsharingFlag
     * @param returnDes
     * @param membeAccountrLmt
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param fullNumber
     */
    @WebMethod(action = "urn:setGrpShrdMember")
    @RequestWrapper(localName = "setGrpShrdMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.SetGrpShrdMember")
    @ResponseWrapper(localName = "setGrpShrdMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.SetGrpShrdMemberResponse")
    public void setGrpShrdMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "membeAccountrLmt", targetNamespace = "")
        MembeAccountrLmt membeAccountrLmt,
        @WebParam(name = "gPRSsharingFlag", targetNamespace = "")
        String gPRSsharingFlag,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param fullNumber
     */
    @WebMethod(action = "urn:delGrpShrdMember")
    @RequestWrapper(localName = "delGrpShrdMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DelGrpShrdMember")
    @ResponseWrapper(localName = "delGrpShrdMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DelGrpShrdMemberResponse")
    public void delGrpShrdMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param grpShrdMember
     * @param fullNumber
     */
    @WebMethod(action = "urn:dispGrpShrdMember")
    @RequestWrapper(localName = "dispGrpShrdMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DispGrpShrdMember")
    @ResponseWrapper(localName = "dispGrpShrdMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DispGrpShrdMemberResponse")
    public void dispGrpShrdMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "GrpShrdMember", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<GrpShrdMember> grpShrdMember);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param grpShrdMember
     * @param rowsPerPage
     * @param fullNumber
     */
    @WebMethod(action = "urn:listGrpShrdMember")
    @RequestWrapper(localName = "listGrpShrdMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListGrpShrdMember")
    @ResponseWrapper(localName = "listGrpShrdMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListGrpShrdMemberResponse")
    public void listGrpShrdMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "GrpShrdMember", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<GrpShrdMember>> grpShrdMember);

    /**
     * 
     * @param returnDes
     * @param transResult
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param startTime
     * @param enterpriseID
     * @param endTime
     * @param currentPage
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listtransResult")
    @RequestWrapper(localName = "listtransResult", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListtransResult")
    @ResponseWrapper(localName = "listtransResultResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListtransResultResponse")
    public void listtransResult(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "startTime", targetNamespace = "")
        String startTime,
        @WebParam(name = "endTime", targetNamespace = "")
        String endTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "transResult", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<TransResult>> transResult);

    /**
     * 
     * @param returnDes
     * @param lteUserInfo
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:addLteUserInfo")
    @RequestWrapper(localName = "addLteUserInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.AddLteUserInfo")
    @ResponseWrapper(localName = "addLteUserInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.AddLteUserInfoResponse")
    public void addLteUserInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "lteUserInfo", targetNamespace = "")
        LteUserInfo lteUserInfo,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param lteUserInfo
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyLteUserInfo")
    @RequestWrapper(localName = "modifyLteUserInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyLteUserInfo")
    @ResponseWrapper(localName = "modifyLteUserInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyLteUserInfoResponse")
    public void modifyLteUserInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "lteUserInfo", targetNamespace = "")
        LteUserInfo lteUserInfo,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param groupID
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param fullNumber
     */
    @WebMethod(action = "urn:deleteLteUserInfo")
    @RequestWrapper(localName = "deleteLteUserInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteLteUserInfo")
    @ResponseWrapper(localName = "deleteLteUserInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteLteUserInfoResponse")
    public void deleteLteUserInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "groupID", targetNamespace = "")
        String groupID,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param lteUserInfo
     * @param groupID
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     * @param fullNumber
     */
    @WebMethod(action = "urn:queryLteUserInfo")
    @RequestWrapper(localName = "queryLteUserInfo", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.QueryLteUserInfo")
    @ResponseWrapper(localName = "queryLteUserInfoResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.QueryLteUserInfoResponse")
    public void queryLteUserInfo(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "fullNumber", targetNamespace = "")
        String fullNumber,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "groupID", targetNamespace = "")
        String groupID,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "lteUserInfo", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<LteUserInfo>> lteUserInfo);

    /**
     * 
     * @param returnDes
     * @param centrexList
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:orderEnterpriseCentrex")
    @RequestWrapper(localName = "orderEnterpriseCentrex", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.OrderEnterpriseCentrex")
    @ResponseWrapper(localName = "orderEnterpriseCentrexResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.OrderEnterpriseCentrexResponse")
    public void orderEnterpriseCentrex(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "centrexList", targetNamespace = "")
        List<CentrexNumber> centrexList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param mainNumberList
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     */
    @WebMethod(action = "urn:unorderEnterpriseCentrex")
    @RequestWrapper(localName = "unorderEnterpriseCentrex", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.UnorderEnterpriseCentrex")
    @ResponseWrapper(localName = "unorderEnterpriseCentrexResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.UnorderEnterpriseCentrexResponse")
    public void unorderEnterpriseCentrex(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "mainNumberList", targetNamespace = "")
        String mainNumberList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param entryRowIndex
     * @param uniqueNumberlist
     */
    @WebMethod(action = "urn:createUniqueNumberList")
    @RequestWrapper(localName = "createUniqueNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateUniqueNumberList")
    @ResponseWrapper(localName = "createUniqueNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateUniqueNumberListResponse")
    public void createUniqueNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "uniqueNumberlist", targetNamespace = "")
        UniqueNumberList uniqueNumberlist,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "entryRowIndex", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> entryRowIndex);

    /**
     * 
     * @param uniqueNumberList
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyUniqueNumberList")
    @RequestWrapper(localName = "modifyUniqueNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyUniqueNumberList")
    @ResponseWrapper(localName = "modifyUniqueNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyUniqueNumberListResponse")
    public void modifyUniqueNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "uniqueNumberList", targetNamespace = "")
        UniqueNumberList1 uniqueNumberList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param uniqueNumberList
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:deleteUniqueNumberList")
    @RequestWrapper(localName = "deleteUniqueNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteUniqueNumberList")
    @ResponseWrapper(localName = "deleteUniqueNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteUniqueNumberListResponse")
    public void deleteUniqueNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "uniqueNumberList", targetNamespace = "")
        UniqueNumberList2 uniqueNumberList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param uniqueNumberList
     * @param returnDes
     * @param responseHeader
     * @param uniqueNumberList0
     * @param requestHeader
     */
    @WebMethod(action = "urn:displayUniqueNumberList")
    @RequestWrapper(localName = "displayUniqueNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayUniqueNumberList")
    @ResponseWrapper(localName = "displayUniqueNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayUniqueNumberListResponse")
    public void displayUniqueNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "uniqueNumberList", targetNamespace = "")
        UniqueNumberList2 uniqueNumberList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "uniqueNumberList", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<UniqueNumberList1> uniqueNumberList0);

    /**
     * 
     * @param uniqueNumberList
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param uniqueNumberLists
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listUniqueNumberList")
    @RequestWrapper(localName = "listUniqueNumberList", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListUniqueNumberList")
    @ResponseWrapper(localName = "listUniqueNumberListResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListUniqueNumberListResponse")
    public void listUniqueNumberList(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "uniqueNumberList", targetNamespace = "")
        UniqueNumberList2 uniqueNumberList,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "UniqueNumberLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<UniqueNumberList1>> uniqueNumberLists);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param uniqueNumber
     * @param uniqueNumberListID
     */
    @WebMethod(action = "urn:createUniqueNumber")
    @RequestWrapper(localName = "createUniqueNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateUniqueNumber")
    @ResponseWrapper(localName = "createUniqueNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreateUniqueNumberResponse")
    public void createUniqueNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "uniqueNumber", targetNamespace = "")
        UniqueNumber uniqueNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "uniqueNumberListID", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> uniqueNumberListID);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param uniqueNumber
     */
    @WebMethod(action = "urn:modifyUniqueNumber")
    @RequestWrapper(localName = "modifyUniqueNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyUniqueNumber")
    @ResponseWrapper(localName = "modifyUniqueNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyUniqueNumberResponse")
    public void modifyUniqueNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "uniqueNumber", targetNamespace = "")
        UniqueNumber1 uniqueNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param responseHeader
     * @param requestHeader
     * @param uniqueNumber
     */
    @WebMethod(action = "urn:deleteUniqueNumber")
    @RequestWrapper(localName = "deleteUniqueNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteUniqueNumber")
    @ResponseWrapper(localName = "deleteUniqueNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeleteUniqueNumberResponse")
    public void deleteUniqueNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "uniqueNumber", targetNamespace = "")
        UniqueNumber2 uniqueNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param uniqueNumber0
     * @param responseHeader
     * @param requestHeader
     * @param uniqueNumber
     */
    @WebMethod(action = "urn:displayUniqueNumber")
    @RequestWrapper(localName = "displayUniqueNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayUniqueNumber")
    @ResponseWrapper(localName = "displayUniqueNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayUniqueNumberResponse")
    public void displayUniqueNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "uniqueNumber", targetNamespace = "")
        UniqueNumber2 uniqueNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "uniqueNumber", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<UniqueNumber4> uniqueNumber0);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param uniqueNumber
     * @param totalPageNum
     * @param rowsPerPage
     * @param uniqueNumberInfo
     */
    @WebMethod(action = "urn:listUniqueNumber")
    @RequestWrapper(localName = "listUniqueNumber", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListUniqueNumber")
    @ResponseWrapper(localName = "listUniqueNumberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListUniqueNumberResponse")
    public void listUniqueNumber(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "uniqueNumber", targetNamespace = "")
        UniqueNumber3 uniqueNumber,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "uniqueNumberInfo", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<UniqueNumber1>> uniqueNumberInfo);

    /**
     * 
     * @param returnDes
     * @param pbxMember
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:createPBXMember")
    @RequestWrapper(localName = "createPBXMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePBXMember")
    @ResponseWrapper(localName = "createPBXMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.CreatePBXMemberResponse")
    public void createPBXMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "PBXMember", targetNamespace = "")
        PBXMember pbxMember,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param returnDes
     * @param pbxMember
     * @param responseHeader
     * @param requestHeader
     */
    @WebMethod(action = "urn:modifyPBXMember")
    @RequestWrapper(localName = "modifyPBXMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPBXMember")
    @ResponseWrapper(localName = "modifyPBXMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ModifyPBXMemberResponse")
    public void modifyPBXMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "PBXMember", targetNamespace = "")
        PBXMember1 pbxMember,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param gmNumber
     * @param returnDes
     * @param privateNumberRange
     * @param length
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param userType
     * @param publicNumberRange
     */
    @WebMethod(action = "urn:deletePBXMember")
    @RequestWrapper(localName = "deletePBXMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePBXMember")
    @ResponseWrapper(localName = "deletePBXMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DeletePBXMemberResponse")
    public void deletePBXMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "gmNumber", targetNamespace = "")
        String gmNumber,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "userType", targetNamespace = "")
        String userType,
        @WebParam(name = "privateNumberRange", targetNamespace = "")
        String privateNumberRange,
        @WebParam(name = "publicNumberRange", targetNamespace = "")
        String publicNumberRange,
        @WebParam(name = "length", targetNamespace = "")
        String length,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes);

    /**
     * 
     * @param gmNumber
     * @param returnDes
     * @param privateNumberRange
     * @param destinationNumberRange
     * @param pbxMember
     * @param length
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param userType
     * @param publicNumberRange
     */
    @WebMethod(action = "urn:displayPBXMember")
    @RequestWrapper(localName = "displayPBXMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPBXMember")
    @ResponseWrapper(localName = "displayPBXMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.DisplayPBXMemberResponse")
    public void displayPBXMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "gmNumber", targetNamespace = "")
        String gmNumber,
        @WebParam(name = "enterpriseID", targetNamespace = "")
        String enterpriseID,
        @WebParam(name = "userType", targetNamespace = "")
        String userType,
        @WebParam(name = "privateNumberRange", targetNamespace = "")
        String privateNumberRange,
        @WebParam(name = "publicNumberRange", targetNamespace = "")
        String publicNumberRange,
        @WebParam(name = "length", targetNamespace = "")
        String length,
        @WebParam(name = "destinationNumberRange", targetNamespace = "")
        String destinationNumberRange,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "PBXMember", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<PBXMember2> pbxMember);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param pbxMember
     * @param members
     * @param responseHeader
     * @param requestHeader
     * @param currentPage
     * @param totalPageNum
     * @param rowsPerPage
     */
    @WebMethod(action = "urn:listPBXMember")
    @RequestWrapper(localName = "listPBXMember", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPBXMember")
    @ResponseWrapper(localName = "listPBXMemberResponse", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/mgr", className = "com.huawei.ngin.vpncentrex.mgr.ListPBXMemberResponse")
    public void listPBXMember(
        @WebParam(name = "requestHeader", targetNamespace = "")
        RequestHeader requestHeader,
        @WebParam(name = "currentPage", targetNamespace = "")
        String currentPage,
        @WebParam(name = "PBXMember", targetNamespace = "")
        PBXMember3 pbxMember,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "members", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PBXMember4>> members);

}
