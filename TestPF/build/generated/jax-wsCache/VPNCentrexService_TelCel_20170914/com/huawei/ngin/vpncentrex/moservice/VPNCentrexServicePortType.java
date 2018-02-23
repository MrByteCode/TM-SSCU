
package com.huawei.ngin.vpncentrex.moservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.huawei.ngin.vpncentrex.domain.BusinessTribe;
import com.huawei.ngin.vpncentrex.domain.BusinessTribe1;
import com.huawei.ngin.vpncentrex.domain.C2CGroup;
import com.huawei.ngin.vpncentrex.domain.C2CGroup1;
import com.huawei.ngin.vpncentrex.domain.C2CGroup2;
import com.huawei.ngin.vpncentrex.domain.Enterprise;
import com.huawei.ngin.vpncentrex.domain.Enterprise1;
import com.huawei.ngin.vpncentrex.domain.Enterprise2;
import com.huawei.ngin.vpncentrex.domain.EnterpriseAdmin;
import com.huawei.ngin.vpncentrex.domain.EnterpriseAdmin1;
import com.huawei.ngin.vpncentrex.domain.EnterpriseAdmin2;
import com.huawei.ngin.vpncentrex.domain.EnterpriseInBT;
import com.huawei.ngin.vpncentrex.domain.EnterpriseInBT1;
import com.huawei.ngin.vpncentrex.domain.GPRSAccountLmt;
import com.huawei.ngin.vpncentrex.domain.GrpShrdMember;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry1;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry2;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry3;
import com.huawei.ngin.vpncentrex.domain.InterGroup;
import com.huawei.ngin.vpncentrex.domain.InterGroup1;
import com.huawei.ngin.vpncentrex.domain.Member;
import com.huawei.ngin.vpncentrex.domain.Member1;
import com.huawei.ngin.vpncentrex.domain.Member2;
import com.huawei.ngin.vpncentrex.domain.Member3;
import com.huawei.ngin.vpncentrex.domain.Member4;
import com.huawei.ngin.vpncentrex.domain.MemberAccountrLmt;
import com.huawei.ngin.vpncentrex.domain.PBXLink1;
import com.huawei.ngin.vpncentrex.domain.PBXLink2;
import com.huawei.ngin.vpncentrex.domain.PBXMember;
import com.huawei.ngin.vpncentrex.domain.PBXMember1;
import com.huawei.ngin.vpncentrex.domain.PBXMember2;
import com.huawei.ngin.vpncentrex.domain.PBXMember3;
import com.huawei.ngin.vpncentrex.domain.PBXMember4;
import com.huawei.ngin.vpncentrex.domain.PBXPrevent1;
import com.huawei.ngin.vpncentrex.domain.PNPPolicy;
import com.huawei.ngin.vpncentrex.domain.PNPPolicy1;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntSeqList;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntSeqList1;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntSeqList2;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntTime;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntTime1;
import com.huawei.ngin.vpncentrex.domain.PersonalHuntTime2;
import com.huawei.ngin.vpncentrex.domain.PersonalHunting1;
import com.huawei.ngin.vpncentrex.domain.PersonalHunting2;
import com.huawei.ngin.vpncentrex.domain.PersonalHunting3;
import com.huawei.ngin.vpncentrex.domain.Profile;
import com.huawei.ngin.vpncentrex.domain.Profile1;
import com.huawei.ngin.vpncentrex.domain.Profile2;
import com.huawei.ngin.vpncentrex.domain.Profile3;
import com.huawei.ngin.vpncentrex.domain.RequestHeader;
import com.huawei.ngin.vpncentrex.domain.ResponseHeader;
import com.huawei.ngin.vpncentrex.domain.Restriction;
import com.huawei.ngin.vpncentrex.domain.Restriction1;
import com.huawei.ngin.vpncentrex.domain.Restriction2;
import com.huawei.ngin.vpncentrex.domain.Restriction3;
import com.huawei.ngin.vpncentrex.domain.Restriction4;
import com.huawei.ngin.vpncentrex.domain.Restriction5;
import com.huawei.ngin.vpncentrex.domain.RestrictionTemplateList;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime1;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime2;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime3;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime4;
import com.huawei.ngin.vpncentrex.domain.RestrictionTimeList;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserList;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserList1;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserList2;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserListInfoList;
import com.huawei.ngin.vpncentrex.domain.ReturnDes;
import com.huawei.ngin.vpncentrex.domain.SMSTemplate;
import com.huawei.ngin.vpncentrex.domain.SMSTemplate1;
import com.huawei.ngin.vpncentrex.domain.SMSTemplate2;
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
import com.huawei.ngin.vpncentrex.domain.UserGroup4;
import com.huawei.ngin.vpncentrex.domain.UserGroupInfo;
import com.huawei.ngin.vpncentrex.domain.VIPList;
import com.huawei.ngin.vpncentrex.domain.VPNGrpShrdAccnt;


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
        Profile3 profile,
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
        Holder<List<RestrictionUserList2>> restrictionUserLists);

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
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
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
        UserGroup4 userGroup,
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
        @WebParam(name = "userGroups", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<UserGroup1>> userGroups);

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
        Holder<Restriction5> restriction0);

    /**
     * 
     * @param returnDes
     * @param totalSize
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param currentPage
     * @param totalPageNum
     * @param spID
     * @param enterpriseName
     * @param rowsPerPage
     * @param enterprises
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
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
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
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "restrictionTemplateLists", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<RestrictionTemplateList>> restrictionTemplateLists);

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
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "members", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<Member4>> members);

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
        RestrictionTime4 restrictionTime,
        @WebParam(name = "responseHeader", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ResponseHeader> responseHeader,
        @WebParam(name = "returnDes", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<ReturnDes> returnDes,
        @WebParam(name = "restrictionTime", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<RestrictionTime2> restrictionTime0);

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
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "pbxLinks", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PBXLink2>> pbxLinks);

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
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
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
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
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
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "rowsPerPage", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> rowsPerPage,
        @WebParam(name = "members", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<PBXMember4>> members);

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
     * @param totalPageNum
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
        @WebParam(name = "totalPageNum", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalPageNum,
        @WebParam(name = "totalSize", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> totalSize,
        @WebParam(name = "smsTemplates", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<List<SMSTemplate>> smsTemplates);

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
     * @param responseHeader
     * @param requestHeader
     * @param enterpriseID
     * @param memberAccountrLmt
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
        @WebParam(name = "memberAccountrLmt", targetNamespace = "")
        MemberAccountrLmt memberAccountrLmt,
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

}
