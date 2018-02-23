
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.huawei.ngin.vpncentrex.domain.BusinessTribe;
import com.huawei.ngin.vpncentrex.domain.BusinessTribe1;
import com.huawei.ngin.vpncentrex.domain.C2CGroup;
import com.huawei.ngin.vpncentrex.domain.C2CGroup1;
import com.huawei.ngin.vpncentrex.domain.Enterprise;
import com.huawei.ngin.vpncentrex.domain.Enterprise1;
import com.huawei.ngin.vpncentrex.domain.EnterpriseAdmin;
import com.huawei.ngin.vpncentrex.domain.EnterpriseAdmin1;
import com.huawei.ngin.vpncentrex.domain.EnterpriseInBT;
import com.huawei.ngin.vpncentrex.domain.GPRSAccountLmt;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry1;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry2;
import com.huawei.ngin.vpncentrex.domain.InterGroup;
import com.huawei.ngin.vpncentrex.domain.Member;
import com.huawei.ngin.vpncentrex.domain.Member1;
import com.huawei.ngin.vpncentrex.domain.Member3;
import com.huawei.ngin.vpncentrex.domain.MemberAccountrLmt;
import com.huawei.ngin.vpncentrex.domain.PBXLink1;
import com.huawei.ngin.vpncentrex.domain.PBXLink2;
import com.huawei.ngin.vpncentrex.domain.PBXMember;
import com.huawei.ngin.vpncentrex.domain.PBXMember1;
import com.huawei.ngin.vpncentrex.domain.PBXMember3;
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
import com.huawei.ngin.vpncentrex.domain.PersonalHunting3;
import com.huawei.ngin.vpncentrex.domain.Profile;
import com.huawei.ngin.vpncentrex.domain.Profile1;
import com.huawei.ngin.vpncentrex.domain.Profile2;
import com.huawei.ngin.vpncentrex.domain.Profile3;
import com.huawei.ngin.vpncentrex.domain.RequestHeader;
import com.huawei.ngin.vpncentrex.domain.Restriction;
import com.huawei.ngin.vpncentrex.domain.Restriction1;
import com.huawei.ngin.vpncentrex.domain.Restriction2;
import com.huawei.ngin.vpncentrex.domain.Restriction3;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime1;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime3;
import com.huawei.ngin.vpncentrex.domain.RestrictionTime4;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserList;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserList1;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber1;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber2;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber3;
import com.huawei.ngin.vpncentrex.domain.UniqueNumber4;
import com.huawei.ngin.vpncentrex.domain.UniqueNumberList;
import com.huawei.ngin.vpncentrex.domain.UniqueNumberList1;
import com.huawei.ngin.vpncentrex.domain.UniqueNumberList2;
import com.huawei.ngin.vpncentrex.domain.UserGroup;
import com.huawei.ngin.vpncentrex.domain.UserGroup2;
import com.huawei.ngin.vpncentrex.domain.UserGroup3;
import com.huawei.ngin.vpncentrex.domain.UserGroup4;
import com.huawei.ngin.vpncentrex.domain.VIPList;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.huawei.ngin.vpncentrex.mgr package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateEnterpriseRequestHeader_QNAME = new QName("", "requestHeader");
    private final static QName _CreateEnterpriseEnterprise_QNAME = new QName("", "enterprise");
    private final static QName _CreateIntergroupInterGroup_QNAME = new QName("", "interGroup");
    private final static QName _CreateUserGroupUserGroup_QNAME = new QName("", "userGroup");
    private final static QName _CreateMemberMember_QNAME = new QName("", "member");
    private final static QName _CreatePBXLinkPbxLink_QNAME = new QName("", "pbxLink");
    private final static QName _CreateVIPListVipList_QNAME = new QName("", "vipList");
    private final static QName _CreateProfileProfile_QNAME = new QName("", "profile");
    private final static QName _CreateRestrictionRestriction_QNAME = new QName("", "restriction");
    private final static QName _DeleteRestrictionUserListRestrictionUserList_QNAME = new QName("", "restrictionUserList");
    private final static QName _DeleteRestrictionTimeRestrictionTime_QNAME = new QName("", "restrictionTime");
    private final static QName _ModifyPersonalHuntingPersonalHunting_QNAME = new QName("", "personalHunting");
    private final static QName _CreatePersonalHuntListEntryHuntingListEntry_QNAME = new QName("", "huntingListEntry");
    private final static QName _CreatePersonalHuntSeqListPersonalHuntSeqList_QNAME = new QName("", "personalHuntSeqList");
    private final static QName _CreatePersonalHuntTimePersonalHuntTime_QNAME = new QName("", "personalHuntTime");
    private final static QName _CreateC2CGroupC2CGroup_QNAME = new QName("", "c2CGroup");
    private final static QName _CreateEnterpriseAdministratorEnterpriseAdmin_QNAME = new QName("", "enterpriseAdmin");
    private final static QName _CreatePBXPreventPbxPrevent_QNAME = new QName("", "pbxPrevent");
    private final static QName _ModifyPNPPolicyPnpPolicy_QNAME = new QName("", "pnpPolicy");
    private final static QName _CreateUniqueNumberListUniqueNumberlist_QNAME = new QName("", "uniqueNumberlist");
    private final static QName _ModifyUniqueNumberListUniqueNumberList_QNAME = new QName("", "uniqueNumberList");
    private final static QName _CreateUniqueNumberUniqueNumber_QNAME = new QName("", "uniqueNumber");
    private final static QName _CreatePBXMemberPBXMember_QNAME = new QName("", "PBXMember");
    private final static QName _CreateBusinessTribeBusinessTribe_QNAME = new QName("", "businessTribe");
    private final static QName _AddEnterpriseInBTEnterpriseInbt_QNAME = new QName("", "enterpriseInbt");
    private final static QName _SetVPNGrpShrdAccntGPRSAccountLmt_QNAME = new QName("", "gPRSAccountLmt");
    private final static QName _SetGrpShrdMemberMemberAccountrLmt_QNAME = new QName("", "memberAccountrLmt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.ngin.vpncentrex.mgr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateEnterprise }
     * 
     */
    public CreateEnterprise createCreateEnterprise() {
        return new CreateEnterprise();
    }

    /**
     * Create an instance of {@link CreateEnterpriseResponse }
     * 
     */
    public CreateEnterpriseResponse createCreateEnterpriseResponse() {
        return new CreateEnterpriseResponse();
    }

    /**
     * Create an instance of {@link ModifyEnterprise }
     * 
     */
    public ModifyEnterprise createModifyEnterprise() {
        return new ModifyEnterprise();
    }

    /**
     * Create an instance of {@link ModifyEnterpriseResponse }
     * 
     */
    public ModifyEnterpriseResponse createModifyEnterpriseResponse() {
        return new ModifyEnterpriseResponse();
    }

    /**
     * Create an instance of {@link DeleteEnterprise }
     * 
     */
    public DeleteEnterprise createDeleteEnterprise() {
        return new DeleteEnterprise();
    }

    /**
     * Create an instance of {@link DeleteEnterpriseResponse }
     * 
     */
    public DeleteEnterpriseResponse createDeleteEnterpriseResponse() {
        return new DeleteEnterpriseResponse();
    }

    /**
     * Create an instance of {@link DisplayEnterprise }
     * 
     */
    public DisplayEnterprise createDisplayEnterprise() {
        return new DisplayEnterprise();
    }

    /**
     * Create an instance of {@link DisplayEnterpriseResponse }
     * 
     */
    public DisplayEnterpriseResponse createDisplayEnterpriseResponse() {
        return new DisplayEnterpriseResponse();
    }

    /**
     * Create an instance of {@link ListEnterprise }
     * 
     */
    public ListEnterprise createListEnterprise() {
        return new ListEnterprise();
    }

    /**
     * Create an instance of {@link ListEnterpriseResponse }
     * 
     */
    public ListEnterpriseResponse createListEnterpriseResponse() {
        return new ListEnterpriseResponse();
    }

    /**
     * Create an instance of {@link CreateIntergroup }
     * 
     */
    public CreateIntergroup createCreateIntergroup() {
        return new CreateIntergroup();
    }

    /**
     * Create an instance of {@link CreateIntergroupResponse }
     * 
     */
    public CreateIntergroupResponse createCreateIntergroupResponse() {
        return new CreateIntergroupResponse();
    }

    /**
     * Create an instance of {@link DeleteIntergroup }
     * 
     */
    public DeleteIntergroup createDeleteIntergroup() {
        return new DeleteIntergroup();
    }

    /**
     * Create an instance of {@link DeleteIntergroupResponse }
     * 
     */
    public DeleteIntergroupResponse createDeleteIntergroupResponse() {
        return new DeleteIntergroupResponse();
    }

    /**
     * Create an instance of {@link ListIntergroup }
     * 
     */
    public ListIntergroup createListIntergroup() {
        return new ListIntergroup();
    }

    /**
     * Create an instance of {@link ListIntergroupResponse }
     * 
     */
    public ListIntergroupResponse createListIntergroupResponse() {
        return new ListIntergroupResponse();
    }

    /**
     * Create an instance of {@link CreateUserGroup }
     * 
     */
    public CreateUserGroup createCreateUserGroup() {
        return new CreateUserGroup();
    }

    /**
     * Create an instance of {@link CreateUserGroupResponse }
     * 
     */
    public CreateUserGroupResponse createCreateUserGroupResponse() {
        return new CreateUserGroupResponse();
    }

    /**
     * Create an instance of {@link ModifyUserGroup }
     * 
     */
    public ModifyUserGroup createModifyUserGroup() {
        return new ModifyUserGroup();
    }

    /**
     * Create an instance of {@link ModifyUserGroupResponse }
     * 
     */
    public ModifyUserGroupResponse createModifyUserGroupResponse() {
        return new ModifyUserGroupResponse();
    }

    /**
     * Create an instance of {@link DeleteUserGroup }
     * 
     */
    public DeleteUserGroup createDeleteUserGroup() {
        return new DeleteUserGroup();
    }

    /**
     * Create an instance of {@link DeleteUserGroupResponse }
     * 
     */
    public DeleteUserGroupResponse createDeleteUserGroupResponse() {
        return new DeleteUserGroupResponse();
    }

    /**
     * Create an instance of {@link DisplayUserGroup }
     * 
     */
    public DisplayUserGroup createDisplayUserGroup() {
        return new DisplayUserGroup();
    }

    /**
     * Create an instance of {@link DisplayUserGroupResponse }
     * 
     */
    public DisplayUserGroupResponse createDisplayUserGroupResponse() {
        return new DisplayUserGroupResponse();
    }

    /**
     * Create an instance of {@link ListUserGroup }
     * 
     */
    public ListUserGroup createListUserGroup() {
        return new ListUserGroup();
    }

    /**
     * Create an instance of {@link ListUserGroupResponse }
     * 
     */
    public ListUserGroupResponse createListUserGroupResponse() {
        return new ListUserGroupResponse();
    }

    /**
     * Create an instance of {@link CreateMember }
     * 
     */
    public CreateMember createCreateMember() {
        return new CreateMember();
    }

    /**
     * Create an instance of {@link CreateMemberResponse }
     * 
     */
    public CreateMemberResponse createCreateMemberResponse() {
        return new CreateMemberResponse();
    }

    /**
     * Create an instance of {@link ModifyMember }
     * 
     */
    public ModifyMember createModifyMember() {
        return new ModifyMember();
    }

    /**
     * Create an instance of {@link ModifyMemberResponse }
     * 
     */
    public ModifyMemberResponse createModifyMemberResponse() {
        return new ModifyMemberResponse();
    }

    /**
     * Create an instance of {@link DeleteMember }
     * 
     */
    public DeleteMember createDeleteMember() {
        return new DeleteMember();
    }

    /**
     * Create an instance of {@link DeleteMemberResponse }
     * 
     */
    public DeleteMemberResponse createDeleteMemberResponse() {
        return new DeleteMemberResponse();
    }

    /**
     * Create an instance of {@link DisplayMember }
     * 
     */
    public DisplayMember createDisplayMember() {
        return new DisplayMember();
    }

    /**
     * Create an instance of {@link DisplayMemberResponse }
     * 
     */
    public DisplayMemberResponse createDisplayMemberResponse() {
        return new DisplayMemberResponse();
    }

    /**
     * Create an instance of {@link ListMember }
     * 
     */
    public ListMember createListMember() {
        return new ListMember();
    }

    /**
     * Create an instance of {@link ListMemberResponse }
     * 
     */
    public ListMemberResponse createListMemberResponse() {
        return new ListMemberResponse();
    }

    /**
     * Create an instance of {@link CreatePBXLink }
     * 
     */
    public CreatePBXLink createCreatePBXLink() {
        return new CreatePBXLink();
    }

    /**
     * Create an instance of {@link CreatePBXLinkResponse }
     * 
     */
    public CreatePBXLinkResponse createCreatePBXLinkResponse() {
        return new CreatePBXLinkResponse();
    }

    /**
     * Create an instance of {@link ModifyPBXLink }
     * 
     */
    public ModifyPBXLink createModifyPBXLink() {
        return new ModifyPBXLink();
    }

    /**
     * Create an instance of {@link ModifyPBXLinkResponse }
     * 
     */
    public ModifyPBXLinkResponse createModifyPBXLinkResponse() {
        return new ModifyPBXLinkResponse();
    }

    /**
     * Create an instance of {@link DeletePBXLink }
     * 
     */
    public DeletePBXLink createDeletePBXLink() {
        return new DeletePBXLink();
    }

    /**
     * Create an instance of {@link DeletePBXLinkResponse }
     * 
     */
    public DeletePBXLinkResponse createDeletePBXLinkResponse() {
        return new DeletePBXLinkResponse();
    }

    /**
     * Create an instance of {@link DisplayPBXLink }
     * 
     */
    public DisplayPBXLink createDisplayPBXLink() {
        return new DisplayPBXLink();
    }

    /**
     * Create an instance of {@link DisplayPBXLinkResponse }
     * 
     */
    public DisplayPBXLinkResponse createDisplayPBXLinkResponse() {
        return new DisplayPBXLinkResponse();
    }

    /**
     * Create an instance of {@link ListPBXLink }
     * 
     */
    public ListPBXLink createListPBXLink() {
        return new ListPBXLink();
    }

    /**
     * Create an instance of {@link ListPBXLinkResponse }
     * 
     */
    public ListPBXLinkResponse createListPBXLinkResponse() {
        return new ListPBXLinkResponse();
    }

    /**
     * Create an instance of {@link CreateVIPList }
     * 
     */
    public CreateVIPList createCreateVIPList() {
        return new CreateVIPList();
    }

    /**
     * Create an instance of {@link CreateVIPListResponse }
     * 
     */
    public CreateVIPListResponse createCreateVIPListResponse() {
        return new CreateVIPListResponse();
    }

    /**
     * Create an instance of {@link DeleteVIPList }
     * 
     */
    public DeleteVIPList createDeleteVIPList() {
        return new DeleteVIPList();
    }

    /**
     * Create an instance of {@link DeleteVIPListResponse }
     * 
     */
    public DeleteVIPListResponse createDeleteVIPListResponse() {
        return new DeleteVIPListResponse();
    }

    /**
     * Create an instance of {@link ListVIPList }
     * 
     */
    public ListVIPList createListVIPList() {
        return new ListVIPList();
    }

    /**
     * Create an instance of {@link ListVIPListResponse }
     * 
     */
    public ListVIPListResponse createListVIPListResponse() {
        return new ListVIPListResponse();
    }

    /**
     * Create an instance of {@link CreateProfile }
     * 
     */
    public CreateProfile createCreateProfile() {
        return new CreateProfile();
    }

    /**
     * Create an instance of {@link CreateProfileResponse }
     * 
     */
    public CreateProfileResponse createCreateProfileResponse() {
        return new CreateProfileResponse();
    }

    /**
     * Create an instance of {@link ModifyProfile }
     * 
     */
    public ModifyProfile createModifyProfile() {
        return new ModifyProfile();
    }

    /**
     * Create an instance of {@link ModifyProfileResponse }
     * 
     */
    public ModifyProfileResponse createModifyProfileResponse() {
        return new ModifyProfileResponse();
    }

    /**
     * Create an instance of {@link DeleteProfile }
     * 
     */
    public DeleteProfile createDeleteProfile() {
        return new DeleteProfile();
    }

    /**
     * Create an instance of {@link DeleteProfileResponse }
     * 
     */
    public DeleteProfileResponse createDeleteProfileResponse() {
        return new DeleteProfileResponse();
    }

    /**
     * Create an instance of {@link DisplayProfile }
     * 
     */
    public DisplayProfile createDisplayProfile() {
        return new DisplayProfile();
    }

    /**
     * Create an instance of {@link DisplayProfileResponse }
     * 
     */
    public DisplayProfileResponse createDisplayProfileResponse() {
        return new DisplayProfileResponse();
    }

    /**
     * Create an instance of {@link ListProfile }
     * 
     */
    public ListProfile createListProfile() {
        return new ListProfile();
    }

    /**
     * Create an instance of {@link ListProfileResponse }
     * 
     */
    public ListProfileResponse createListProfileResponse() {
        return new ListProfileResponse();
    }

    /**
     * Create an instance of {@link ListRestrictionTemplate }
     * 
     */
    public ListRestrictionTemplate createListRestrictionTemplate() {
        return new ListRestrictionTemplate();
    }

    /**
     * Create an instance of {@link ListRestrictionTemplateResponse }
     * 
     */
    public ListRestrictionTemplateResponse createListRestrictionTemplateResponse() {
        return new ListRestrictionTemplateResponse();
    }

    /**
     * Create an instance of {@link CreateRestriction }
     * 
     */
    public CreateRestriction createCreateRestriction() {
        return new CreateRestriction();
    }

    /**
     * Create an instance of {@link CreateRestrictionResponse }
     * 
     */
    public CreateRestrictionResponse createCreateRestrictionResponse() {
        return new CreateRestrictionResponse();
    }

    /**
     * Create an instance of {@link DeleteRestriction }
     * 
     */
    public DeleteRestriction createDeleteRestriction() {
        return new DeleteRestriction();
    }

    /**
     * Create an instance of {@link DeleteRestrictionResponse }
     * 
     */
    public DeleteRestrictionResponse createDeleteRestrictionResponse() {
        return new DeleteRestrictionResponse();
    }

    /**
     * Create an instance of {@link ModifyRestriction }
     * 
     */
    public ModifyRestriction createModifyRestriction() {
        return new ModifyRestriction();
    }

    /**
     * Create an instance of {@link ModifyRestrictionResponse }
     * 
     */
    public ModifyRestrictionResponse createModifyRestrictionResponse() {
        return new ModifyRestrictionResponse();
    }

    /**
     * Create an instance of {@link DisplayRestriction }
     * 
     */
    public DisplayRestriction createDisplayRestriction() {
        return new DisplayRestriction();
    }

    /**
     * Create an instance of {@link DisplayRestrictionResponse }
     * 
     */
    public DisplayRestrictionResponse createDisplayRestrictionResponse() {
        return new DisplayRestrictionResponse();
    }

    /**
     * Create an instance of {@link ListRestriction }
     * 
     */
    public ListRestriction createListRestriction() {
        return new ListRestriction();
    }

    /**
     * Create an instance of {@link ListRestrictionResponse }
     * 
     */
    public ListRestrictionResponse createListRestrictionResponse() {
        return new ListRestrictionResponse();
    }

    /**
     * Create an instance of {@link CreateRestrictionUserList }
     * 
     */
    public CreateRestrictionUserList createCreateRestrictionUserList() {
        return new CreateRestrictionUserList();
    }

    /**
     * Create an instance of {@link CreateRestrictionUserListResponse }
     * 
     */
    public CreateRestrictionUserListResponse createCreateRestrictionUserListResponse() {
        return new CreateRestrictionUserListResponse();
    }

    /**
     * Create an instance of {@link DeleteRestrictionUserList }
     * 
     */
    public DeleteRestrictionUserList createDeleteRestrictionUserList() {
        return new DeleteRestrictionUserList();
    }

    /**
     * Create an instance of {@link DeleteRestrictionUserListResponse }
     * 
     */
    public DeleteRestrictionUserListResponse createDeleteRestrictionUserListResponse() {
        return new DeleteRestrictionUserListResponse();
    }

    /**
     * Create an instance of {@link ListRestrictionUserList }
     * 
     */
    public ListRestrictionUserList createListRestrictionUserList() {
        return new ListRestrictionUserList();
    }

    /**
     * Create an instance of {@link ListRestrictionUserListResponse }
     * 
     */
    public ListRestrictionUserListResponse createListRestrictionUserListResponse() {
        return new ListRestrictionUserListResponse();
    }

    /**
     * Create an instance of {@link CreateRestrictionTime }
     * 
     */
    public CreateRestrictionTime createCreateRestrictionTime() {
        return new CreateRestrictionTime();
    }

    /**
     * Create an instance of {@link CreateRestrictionTimeResponse }
     * 
     */
    public CreateRestrictionTimeResponse createCreateRestrictionTimeResponse() {
        return new CreateRestrictionTimeResponse();
    }

    /**
     * Create an instance of {@link DeleteRestrictionTime }
     * 
     */
    public DeleteRestrictionTime createDeleteRestrictionTime() {
        return new DeleteRestrictionTime();
    }

    /**
     * Create an instance of {@link DeleteRestrictionTimeResponse }
     * 
     */
    public DeleteRestrictionTimeResponse createDeleteRestrictionTimeResponse() {
        return new DeleteRestrictionTimeResponse();
    }

    /**
     * Create an instance of {@link DisplayRestrictionTime }
     * 
     */
    public DisplayRestrictionTime createDisplayRestrictionTime() {
        return new DisplayRestrictionTime();
    }

    /**
     * Create an instance of {@link DisplayRestrictionTimeResponse }
     * 
     */
    public DisplayRestrictionTimeResponse createDisplayRestrictionTimeResponse() {
        return new DisplayRestrictionTimeResponse();
    }

    /**
     * Create an instance of {@link ListRestrictionTime }
     * 
     */
    public ListRestrictionTime createListRestrictionTime() {
        return new ListRestrictionTime();
    }

    /**
     * Create an instance of {@link ListRestrictionTimeResponse }
     * 
     */
    public ListRestrictionTimeResponse createListRestrictionTimeResponse() {
        return new ListRestrictionTimeResponse();
    }

    /**
     * Create an instance of {@link DeletePersonalHunting }
     * 
     */
    public DeletePersonalHunting createDeletePersonalHunting() {
        return new DeletePersonalHunting();
    }

    /**
     * Create an instance of {@link DeletePersonalHuntingResponse }
     * 
     */
    public DeletePersonalHuntingResponse createDeletePersonalHuntingResponse() {
        return new DeletePersonalHuntingResponse();
    }

    /**
     * Create an instance of {@link ModifyPersonalHunting }
     * 
     */
    public ModifyPersonalHunting createModifyPersonalHunting() {
        return new ModifyPersonalHunting();
    }

    /**
     * Create an instance of {@link ModifyPersonalHuntingResponse }
     * 
     */
    public ModifyPersonalHuntingResponse createModifyPersonalHuntingResponse() {
        return new ModifyPersonalHuntingResponse();
    }

    /**
     * Create an instance of {@link DisplayPersonalHunting }
     * 
     */
    public DisplayPersonalHunting createDisplayPersonalHunting() {
        return new DisplayPersonalHunting();
    }

    /**
     * Create an instance of {@link DisplayPersonalHuntingResponse }
     * 
     */
    public DisplayPersonalHuntingResponse createDisplayPersonalHuntingResponse() {
        return new DisplayPersonalHuntingResponse();
    }

    /**
     * Create an instance of {@link ListPersonalHunting }
     * 
     */
    public ListPersonalHunting createListPersonalHunting() {
        return new ListPersonalHunting();
    }

    /**
     * Create an instance of {@link ListPersonalHuntingResponse }
     * 
     */
    public ListPersonalHuntingResponse createListPersonalHuntingResponse() {
        return new ListPersonalHuntingResponse();
    }

    /**
     * Create an instance of {@link CreatePersonalHuntListEntry }
     * 
     */
    public CreatePersonalHuntListEntry createCreatePersonalHuntListEntry() {
        return new CreatePersonalHuntListEntry();
    }

    /**
     * Create an instance of {@link CreatePersonalHuntListEntryResponse }
     * 
     */
    public CreatePersonalHuntListEntryResponse createCreatePersonalHuntListEntryResponse() {
        return new CreatePersonalHuntListEntryResponse();
    }

    /**
     * Create an instance of {@link ModifyPersonalHuntListEntry }
     * 
     */
    public ModifyPersonalHuntListEntry createModifyPersonalHuntListEntry() {
        return new ModifyPersonalHuntListEntry();
    }

    /**
     * Create an instance of {@link ModifyPersonalHuntListEntryResponse }
     * 
     */
    public ModifyPersonalHuntListEntryResponse createModifyPersonalHuntListEntryResponse() {
        return new ModifyPersonalHuntListEntryResponse();
    }

    /**
     * Create an instance of {@link DeletePersonalHuntListEntry }
     * 
     */
    public DeletePersonalHuntListEntry createDeletePersonalHuntListEntry() {
        return new DeletePersonalHuntListEntry();
    }

    /**
     * Create an instance of {@link DeletePersonalHuntListEntryResponse }
     * 
     */
    public DeletePersonalHuntListEntryResponse createDeletePersonalHuntListEntryResponse() {
        return new DeletePersonalHuntListEntryResponse();
    }

    /**
     * Create an instance of {@link DisplayPersonalHuntListEntry }
     * 
     */
    public DisplayPersonalHuntListEntry createDisplayPersonalHuntListEntry() {
        return new DisplayPersonalHuntListEntry();
    }

    /**
     * Create an instance of {@link DisplayPersonalHuntListEntryResponse }
     * 
     */
    public DisplayPersonalHuntListEntryResponse createDisplayPersonalHuntListEntryResponse() {
        return new DisplayPersonalHuntListEntryResponse();
    }

    /**
     * Create an instance of {@link ListPersonalHuntListEntry }
     * 
     */
    public ListPersonalHuntListEntry createListPersonalHuntListEntry() {
        return new ListPersonalHuntListEntry();
    }

    /**
     * Create an instance of {@link ListPersonalHuntListEntryResponse }
     * 
     */
    public ListPersonalHuntListEntryResponse createListPersonalHuntListEntryResponse() {
        return new ListPersonalHuntListEntryResponse();
    }

    /**
     * Create an instance of {@link CreatePersonalHuntSeqList }
     * 
     */
    public CreatePersonalHuntSeqList createCreatePersonalHuntSeqList() {
        return new CreatePersonalHuntSeqList();
    }

    /**
     * Create an instance of {@link CreatePersonalHuntSeqListResponse }
     * 
     */
    public CreatePersonalHuntSeqListResponse createCreatePersonalHuntSeqListResponse() {
        return new CreatePersonalHuntSeqListResponse();
    }

    /**
     * Create an instance of {@link ModifyPersonalHuntSeqList }
     * 
     */
    public ModifyPersonalHuntSeqList createModifyPersonalHuntSeqList() {
        return new ModifyPersonalHuntSeqList();
    }

    /**
     * Create an instance of {@link ModifyPersonalHuntSeqListResponse }
     * 
     */
    public ModifyPersonalHuntSeqListResponse createModifyPersonalHuntSeqListResponse() {
        return new ModifyPersonalHuntSeqListResponse();
    }

    /**
     * Create an instance of {@link DeletePersonalHuntSeqList }
     * 
     */
    public DeletePersonalHuntSeqList createDeletePersonalHuntSeqList() {
        return new DeletePersonalHuntSeqList();
    }

    /**
     * Create an instance of {@link DeletePersonalHuntSeqListResponse }
     * 
     */
    public DeletePersonalHuntSeqListResponse createDeletePersonalHuntSeqListResponse() {
        return new DeletePersonalHuntSeqListResponse();
    }

    /**
     * Create an instance of {@link DisplayPersonalHuntSeqList }
     * 
     */
    public DisplayPersonalHuntSeqList createDisplayPersonalHuntSeqList() {
        return new DisplayPersonalHuntSeqList();
    }

    /**
     * Create an instance of {@link DisplayPersonalHuntSeqListResponse }
     * 
     */
    public DisplayPersonalHuntSeqListResponse createDisplayPersonalHuntSeqListResponse() {
        return new DisplayPersonalHuntSeqListResponse();
    }

    /**
     * Create an instance of {@link ListPersonalHuntSeqList }
     * 
     */
    public ListPersonalHuntSeqList createListPersonalHuntSeqList() {
        return new ListPersonalHuntSeqList();
    }

    /**
     * Create an instance of {@link ListPersonalHuntSeqListResponse }
     * 
     */
    public ListPersonalHuntSeqListResponse createListPersonalHuntSeqListResponse() {
        return new ListPersonalHuntSeqListResponse();
    }

    /**
     * Create an instance of {@link CreatePersonalHuntTime }
     * 
     */
    public CreatePersonalHuntTime createCreatePersonalHuntTime() {
        return new CreatePersonalHuntTime();
    }

    /**
     * Create an instance of {@link CreatePersonalHuntTimeResponse }
     * 
     */
    public CreatePersonalHuntTimeResponse createCreatePersonalHuntTimeResponse() {
        return new CreatePersonalHuntTimeResponse();
    }

    /**
     * Create an instance of {@link ModifyPersonalHuntTime }
     * 
     */
    public ModifyPersonalHuntTime createModifyPersonalHuntTime() {
        return new ModifyPersonalHuntTime();
    }

    /**
     * Create an instance of {@link ModifyPersonalHuntTimeResponse }
     * 
     */
    public ModifyPersonalHuntTimeResponse createModifyPersonalHuntTimeResponse() {
        return new ModifyPersonalHuntTimeResponse();
    }

    /**
     * Create an instance of {@link DeletePersonalHuntTime }
     * 
     */
    public DeletePersonalHuntTime createDeletePersonalHuntTime() {
        return new DeletePersonalHuntTime();
    }

    /**
     * Create an instance of {@link DeletePersonalHuntTimeResponse }
     * 
     */
    public DeletePersonalHuntTimeResponse createDeletePersonalHuntTimeResponse() {
        return new DeletePersonalHuntTimeResponse();
    }

    /**
     * Create an instance of {@link DisplayPersonalHuntTime }
     * 
     */
    public DisplayPersonalHuntTime createDisplayPersonalHuntTime() {
        return new DisplayPersonalHuntTime();
    }

    /**
     * Create an instance of {@link DisplayPersonalHuntTimeResponse }
     * 
     */
    public DisplayPersonalHuntTimeResponse createDisplayPersonalHuntTimeResponse() {
        return new DisplayPersonalHuntTimeResponse();
    }

    /**
     * Create an instance of {@link ListPersonalHuntTime }
     * 
     */
    public ListPersonalHuntTime createListPersonalHuntTime() {
        return new ListPersonalHuntTime();
    }

    /**
     * Create an instance of {@link ListPersonalHuntTimeResponse }
     * 
     */
    public ListPersonalHuntTimeResponse createListPersonalHuntTimeResponse() {
        return new ListPersonalHuntTimeResponse();
    }

    /**
     * Create an instance of {@link CreateC2CGroup }
     * 
     */
    public CreateC2CGroup createCreateC2CGroup() {
        return new CreateC2CGroup();
    }

    /**
     * Create an instance of {@link CreateC2CGroupResponse }
     * 
     */
    public CreateC2CGroupResponse createCreateC2CGroupResponse() {
        return new CreateC2CGroupResponse();
    }

    /**
     * Create an instance of {@link ModifyC2CGroup }
     * 
     */
    public ModifyC2CGroup createModifyC2CGroup() {
        return new ModifyC2CGroup();
    }

    /**
     * Create an instance of {@link ModifyC2CGroupResponse }
     * 
     */
    public ModifyC2CGroupResponse createModifyC2CGroupResponse() {
        return new ModifyC2CGroupResponse();
    }

    /**
     * Create an instance of {@link DeleteC2CGroup }
     * 
     */
    public DeleteC2CGroup createDeleteC2CGroup() {
        return new DeleteC2CGroup();
    }

    /**
     * Create an instance of {@link DeleteC2CGroupResponse }
     * 
     */
    public DeleteC2CGroupResponse createDeleteC2CGroupResponse() {
        return new DeleteC2CGroupResponse();
    }

    /**
     * Create an instance of {@link ListC2CGroup }
     * 
     */
    public ListC2CGroup createListC2CGroup() {
        return new ListC2CGroup();
    }

    /**
     * Create an instance of {@link ListC2CGroupResponse }
     * 
     */
    public ListC2CGroupResponse createListC2CGroupResponse() {
        return new ListC2CGroupResponse();
    }

    /**
     * Create an instance of {@link CreateEnterpriseAdministrator }
     * 
     */
    public CreateEnterpriseAdministrator createCreateEnterpriseAdministrator() {
        return new CreateEnterpriseAdministrator();
    }

    /**
     * Create an instance of {@link CreateEnterpriseAdministratorResponse }
     * 
     */
    public CreateEnterpriseAdministratorResponse createCreateEnterpriseAdministratorResponse() {
        return new CreateEnterpriseAdministratorResponse();
    }

    /**
     * Create an instance of {@link ModifyEnterpriseAdministrator }
     * 
     */
    public ModifyEnterpriseAdministrator createModifyEnterpriseAdministrator() {
        return new ModifyEnterpriseAdministrator();
    }

    /**
     * Create an instance of {@link ModifyEnterpriseAdministratorResponse }
     * 
     */
    public ModifyEnterpriseAdministratorResponse createModifyEnterpriseAdministratorResponse() {
        return new ModifyEnterpriseAdministratorResponse();
    }

    /**
     * Create an instance of {@link DeleteEnterpriseAdministrator }
     * 
     */
    public DeleteEnterpriseAdministrator createDeleteEnterpriseAdministrator() {
        return new DeleteEnterpriseAdministrator();
    }

    /**
     * Create an instance of {@link DeleteEnterpriseAdministratorResponse }
     * 
     */
    public DeleteEnterpriseAdministratorResponse createDeleteEnterpriseAdministratorResponse() {
        return new DeleteEnterpriseAdministratorResponse();
    }

    /**
     * Create an instance of {@link ListEnterpriseAdministrator }
     * 
     */
    public ListEnterpriseAdministrator createListEnterpriseAdministrator() {
        return new ListEnterpriseAdministrator();
    }

    /**
     * Create an instance of {@link ListEnterpriseAdministratorResponse }
     * 
     */
    public ListEnterpriseAdministratorResponse createListEnterpriseAdministratorResponse() {
        return new ListEnterpriseAdministratorResponse();
    }

    /**
     * Create an instance of {@link CreatePBXPrevent }
     * 
     */
    public CreatePBXPrevent createCreatePBXPrevent() {
        return new CreatePBXPrevent();
    }

    /**
     * Create an instance of {@link CreatePBXPreventResponse }
     * 
     */
    public CreatePBXPreventResponse createCreatePBXPreventResponse() {
        return new CreatePBXPreventResponse();
    }

    /**
     * Create an instance of {@link DeletePBXPrevent }
     * 
     */
    public DeletePBXPrevent createDeletePBXPrevent() {
        return new DeletePBXPrevent();
    }

    /**
     * Create an instance of {@link DeletePBXPreventResponse }
     * 
     */
    public DeletePBXPreventResponse createDeletePBXPreventResponse() {
        return new DeletePBXPreventResponse();
    }

    /**
     * Create an instance of {@link ListPBXPrevent }
     * 
     */
    public ListPBXPrevent createListPBXPrevent() {
        return new ListPBXPrevent();
    }

    /**
     * Create an instance of {@link ListPBXPreventResponse }
     * 
     */
    public ListPBXPreventResponse createListPBXPreventResponse() {
        return new ListPBXPreventResponse();
    }

    /**
     * Create an instance of {@link CreatePNPPolicy }
     * 
     */
    public CreatePNPPolicy createCreatePNPPolicy() {
        return new CreatePNPPolicy();
    }

    /**
     * Create an instance of {@link CreatePNPPolicyResponse }
     * 
     */
    public CreatePNPPolicyResponse createCreatePNPPolicyResponse() {
        return new CreatePNPPolicyResponse();
    }

    /**
     * Create an instance of {@link ModifyPNPPolicy }
     * 
     */
    public ModifyPNPPolicy createModifyPNPPolicy() {
        return new ModifyPNPPolicy();
    }

    /**
     * Create an instance of {@link ModifyPNPPolicyResponse }
     * 
     */
    public ModifyPNPPolicyResponse createModifyPNPPolicyResponse() {
        return new ModifyPNPPolicyResponse();
    }

    /**
     * Create an instance of {@link DeletePNPPolicy }
     * 
     */
    public DeletePNPPolicy createDeletePNPPolicy() {
        return new DeletePNPPolicy();
    }

    /**
     * Create an instance of {@link DeletePNPPolicyResponse }
     * 
     */
    public DeletePNPPolicyResponse createDeletePNPPolicyResponse() {
        return new DeletePNPPolicyResponse();
    }

    /**
     * Create an instance of {@link DisplayPNPPolicy }
     * 
     */
    public DisplayPNPPolicy createDisplayPNPPolicy() {
        return new DisplayPNPPolicy();
    }

    /**
     * Create an instance of {@link DisplayPNPPolicyResponse }
     * 
     */
    public DisplayPNPPolicyResponse createDisplayPNPPolicyResponse() {
        return new DisplayPNPPolicyResponse();
    }

    /**
     * Create an instance of {@link ListPNPPolicy }
     * 
     */
    public ListPNPPolicy createListPNPPolicy() {
        return new ListPNPPolicy();
    }

    /**
     * Create an instance of {@link ListPNPPolicyResponse }
     * 
     */
    public ListPNPPolicyResponse createListPNPPolicyResponse() {
        return new ListPNPPolicyResponse();
    }

    /**
     * Create an instance of {@link CreateUniqueNumberList }
     * 
     */
    public CreateUniqueNumberList createCreateUniqueNumberList() {
        return new CreateUniqueNumberList();
    }

    /**
     * Create an instance of {@link CreateUniqueNumberListResponse }
     * 
     */
    public CreateUniqueNumberListResponse createCreateUniqueNumberListResponse() {
        return new CreateUniqueNumberListResponse();
    }

    /**
     * Create an instance of {@link ModifyUniqueNumberList }
     * 
     */
    public ModifyUniqueNumberList createModifyUniqueNumberList() {
        return new ModifyUniqueNumberList();
    }

    /**
     * Create an instance of {@link ModifyUniqueNumberListResponse }
     * 
     */
    public ModifyUniqueNumberListResponse createModifyUniqueNumberListResponse() {
        return new ModifyUniqueNumberListResponse();
    }

    /**
     * Create an instance of {@link DeleteUniqueNumberList }
     * 
     */
    public DeleteUniqueNumberList createDeleteUniqueNumberList() {
        return new DeleteUniqueNumberList();
    }

    /**
     * Create an instance of {@link DeleteUniqueNumberListResponse }
     * 
     */
    public DeleteUniqueNumberListResponse createDeleteUniqueNumberListResponse() {
        return new DeleteUniqueNumberListResponse();
    }

    /**
     * Create an instance of {@link DisplayUniqueNumberList }
     * 
     */
    public DisplayUniqueNumberList createDisplayUniqueNumberList() {
        return new DisplayUniqueNumberList();
    }

    /**
     * Create an instance of {@link DisplayUniqueNumberListResponse }
     * 
     */
    public DisplayUniqueNumberListResponse createDisplayUniqueNumberListResponse() {
        return new DisplayUniqueNumberListResponse();
    }

    /**
     * Create an instance of {@link ListUniqueNumberList }
     * 
     */
    public ListUniqueNumberList createListUniqueNumberList() {
        return new ListUniqueNumberList();
    }

    /**
     * Create an instance of {@link ListUniqueNumberListResponse }
     * 
     */
    public ListUniqueNumberListResponse createListUniqueNumberListResponse() {
        return new ListUniqueNumberListResponse();
    }

    /**
     * Create an instance of {@link CreateUniqueNumber }
     * 
     */
    public CreateUniqueNumber createCreateUniqueNumber() {
        return new CreateUniqueNumber();
    }

    /**
     * Create an instance of {@link CreateUniqueNumberResponse }
     * 
     */
    public CreateUniqueNumberResponse createCreateUniqueNumberResponse() {
        return new CreateUniqueNumberResponse();
    }

    /**
     * Create an instance of {@link ModifyUniqueNumber }
     * 
     */
    public ModifyUniqueNumber createModifyUniqueNumber() {
        return new ModifyUniqueNumber();
    }

    /**
     * Create an instance of {@link ModifyUniqueNumberResponse }
     * 
     */
    public ModifyUniqueNumberResponse createModifyUniqueNumberResponse() {
        return new ModifyUniqueNumberResponse();
    }

    /**
     * Create an instance of {@link DeleteUniqueNumber }
     * 
     */
    public DeleteUniqueNumber createDeleteUniqueNumber() {
        return new DeleteUniqueNumber();
    }

    /**
     * Create an instance of {@link DeleteUniqueNumberResponse }
     * 
     */
    public DeleteUniqueNumberResponse createDeleteUniqueNumberResponse() {
        return new DeleteUniqueNumberResponse();
    }

    /**
     * Create an instance of {@link DisplayUniqueNumber }
     * 
     */
    public DisplayUniqueNumber createDisplayUniqueNumber() {
        return new DisplayUniqueNumber();
    }

    /**
     * Create an instance of {@link DisplayUniqueNumberResponse }
     * 
     */
    public DisplayUniqueNumberResponse createDisplayUniqueNumberResponse() {
        return new DisplayUniqueNumberResponse();
    }

    /**
     * Create an instance of {@link ListUniqueNumber }
     * 
     */
    public ListUniqueNumber createListUniqueNumber() {
        return new ListUniqueNumber();
    }

    /**
     * Create an instance of {@link ListUniqueNumberResponse }
     * 
     */
    public ListUniqueNumberResponse createListUniqueNumberResponse() {
        return new ListUniqueNumberResponse();
    }

    /**
     * Create an instance of {@link CreatePBXMember }
     * 
     */
    public CreatePBXMember createCreatePBXMember() {
        return new CreatePBXMember();
    }

    /**
     * Create an instance of {@link CreatePBXMemberResponse }
     * 
     */
    public CreatePBXMemberResponse createCreatePBXMemberResponse() {
        return new CreatePBXMemberResponse();
    }

    /**
     * Create an instance of {@link ModifyPBXMember }
     * 
     */
    public ModifyPBXMember createModifyPBXMember() {
        return new ModifyPBXMember();
    }

    /**
     * Create an instance of {@link ModifyPBXMemberResponse }
     * 
     */
    public ModifyPBXMemberResponse createModifyPBXMemberResponse() {
        return new ModifyPBXMemberResponse();
    }

    /**
     * Create an instance of {@link DeletePBXMember }
     * 
     */
    public DeletePBXMember createDeletePBXMember() {
        return new DeletePBXMember();
    }

    /**
     * Create an instance of {@link DeletePBXMemberResponse }
     * 
     */
    public DeletePBXMemberResponse createDeletePBXMemberResponse() {
        return new DeletePBXMemberResponse();
    }

    /**
     * Create an instance of {@link DisplayPBXMember }
     * 
     */
    public DisplayPBXMember createDisplayPBXMember() {
        return new DisplayPBXMember();
    }

    /**
     * Create an instance of {@link DisplayPBXMemberResponse }
     * 
     */
    public DisplayPBXMemberResponse createDisplayPBXMemberResponse() {
        return new DisplayPBXMemberResponse();
    }

    /**
     * Create an instance of {@link ListPBXMember }
     * 
     */
    public ListPBXMember createListPBXMember() {
        return new ListPBXMember();
    }

    /**
     * Create an instance of {@link ListPBXMemberResponse }
     * 
     */
    public ListPBXMemberResponse createListPBXMemberResponse() {
        return new ListPBXMemberResponse();
    }

    /**
     * Create an instance of {@link CreateBusinessTribe }
     * 
     */
    public CreateBusinessTribe createCreateBusinessTribe() {
        return new CreateBusinessTribe();
    }

    /**
     * Create an instance of {@link CreateBusinessTribeResponse }
     * 
     */
    public CreateBusinessTribeResponse createCreateBusinessTribeResponse() {
        return new CreateBusinessTribeResponse();
    }

    /**
     * Create an instance of {@link ModifyBusinessTribe }
     * 
     */
    public ModifyBusinessTribe createModifyBusinessTribe() {
        return new ModifyBusinessTribe();
    }

    /**
     * Create an instance of {@link ModifyBusinessTribeResponse }
     * 
     */
    public ModifyBusinessTribeResponse createModifyBusinessTribeResponse() {
        return new ModifyBusinessTribeResponse();
    }

    /**
     * Create an instance of {@link DeleteBusinessTribe }
     * 
     */
    public DeleteBusinessTribe createDeleteBusinessTribe() {
        return new DeleteBusinessTribe();
    }

    /**
     * Create an instance of {@link DeleteBusinessTribeResponse }
     * 
     */
    public DeleteBusinessTribeResponse createDeleteBusinessTribeResponse() {
        return new DeleteBusinessTribeResponse();
    }

    /**
     * Create an instance of {@link ListBusinessTribe }
     * 
     */
    public ListBusinessTribe createListBusinessTribe() {
        return new ListBusinessTribe();
    }

    /**
     * Create an instance of {@link ListBusinessTribeResponse }
     * 
     */
    public ListBusinessTribeResponse createListBusinessTribeResponse() {
        return new ListBusinessTribeResponse();
    }

    /**
     * Create an instance of {@link AddEnterpriseInBT }
     * 
     */
    public AddEnterpriseInBT createAddEnterpriseInBT() {
        return new AddEnterpriseInBT();
    }

    /**
     * Create an instance of {@link AddEnterpriseInBTResponse }
     * 
     */
    public AddEnterpriseInBTResponse createAddEnterpriseInBTResponse() {
        return new AddEnterpriseInBTResponse();
    }

    /**
     * Create an instance of {@link DeleteEnterpriseInBT }
     * 
     */
    public DeleteEnterpriseInBT createDeleteEnterpriseInBT() {
        return new DeleteEnterpriseInBT();
    }

    /**
     * Create an instance of {@link DeleteEnterpriseInBTResponse }
     * 
     */
    public DeleteEnterpriseInBTResponse createDeleteEnterpriseInBTResponse() {
        return new DeleteEnterpriseInBTResponse();
    }

    /**
     * Create an instance of {@link ListEnterpriseInBT }
     * 
     */
    public ListEnterpriseInBT createListEnterpriseInBT() {
        return new ListEnterpriseInBT();
    }

    /**
     * Create an instance of {@link ListEnterpriseInBTResponse }
     * 
     */
    public ListEnterpriseInBTResponse createListEnterpriseInBTResponse() {
        return new ListEnterpriseInBTResponse();
    }

    /**
     * Create an instance of {@link ListUserGroupInEnterprise }
     * 
     */
    public ListUserGroupInEnterprise createListUserGroupInEnterprise() {
        return new ListUserGroupInEnterprise();
    }

    /**
     * Create an instance of {@link ListUserGroupInEnterpriseResponse }
     * 
     */
    public ListUserGroupInEnterpriseResponse createListUserGroupInEnterpriseResponse() {
        return new ListUserGroupInEnterpriseResponse();
    }

    /**
     * Create an instance of {@link CreateSMSTemplate }
     * 
     */
    public CreateSMSTemplate createCreateSMSTemplate() {
        return new CreateSMSTemplate();
    }

    /**
     * Create an instance of {@link CreateSMSTemplateResponse }
     * 
     */
    public CreateSMSTemplateResponse createCreateSMSTemplateResponse() {
        return new CreateSMSTemplateResponse();
    }

    /**
     * Create an instance of {@link ModifySMSTemplate }
     * 
     */
    public ModifySMSTemplate createModifySMSTemplate() {
        return new ModifySMSTemplate();
    }

    /**
     * Create an instance of {@link ModifySMSTemplateResponse }
     * 
     */
    public ModifySMSTemplateResponse createModifySMSTemplateResponse() {
        return new ModifySMSTemplateResponse();
    }

    /**
     * Create an instance of {@link DeleteSMSTemplate }
     * 
     */
    public DeleteSMSTemplate createDeleteSMSTemplate() {
        return new DeleteSMSTemplate();
    }

    /**
     * Create an instance of {@link DeleteSMSTemplateResponse }
     * 
     */
    public DeleteSMSTemplateResponse createDeleteSMSTemplateResponse() {
        return new DeleteSMSTemplateResponse();
    }

    /**
     * Create an instance of {@link DisplaySMSTemplate }
     * 
     */
    public DisplaySMSTemplate createDisplaySMSTemplate() {
        return new DisplaySMSTemplate();
    }

    /**
     * Create an instance of {@link DisplaySMSTemplateResponse }
     * 
     */
    public DisplaySMSTemplateResponse createDisplaySMSTemplateResponse() {
        return new DisplaySMSTemplateResponse();
    }

    /**
     * Create an instance of {@link ListSMSTemplate }
     * 
     */
    public ListSMSTemplate createListSMSTemplate() {
        return new ListSMSTemplate();
    }

    /**
     * Create an instance of {@link ListSMSTemplateResponse }
     * 
     */
    public ListSMSTemplateResponse createListSMSTemplateResponse() {
        return new ListSMSTemplateResponse();
    }

    /**
     * Create an instance of {@link SetVPNGrpShrdAccnt }
     * 
     */
    public SetVPNGrpShrdAccnt createSetVPNGrpShrdAccnt() {
        return new SetVPNGrpShrdAccnt();
    }

    /**
     * Create an instance of {@link SetVPNGrpShrdAccntResponse }
     * 
     */
    public SetVPNGrpShrdAccntResponse createSetVPNGrpShrdAccntResponse() {
        return new SetVPNGrpShrdAccntResponse();
    }

    /**
     * Create an instance of {@link DelVPNGrpShrdAccnt }
     * 
     */
    public DelVPNGrpShrdAccnt createDelVPNGrpShrdAccnt() {
        return new DelVPNGrpShrdAccnt();
    }

    /**
     * Create an instance of {@link DelVPNGrpShrdAccntResponse }
     * 
     */
    public DelVPNGrpShrdAccntResponse createDelVPNGrpShrdAccntResponse() {
        return new DelVPNGrpShrdAccntResponse();
    }

    /**
     * Create an instance of {@link DispVPNGrpShrdAccnt }
     * 
     */
    public DispVPNGrpShrdAccnt createDispVPNGrpShrdAccnt() {
        return new DispVPNGrpShrdAccnt();
    }

    /**
     * Create an instance of {@link DispVPNGrpShrdAccntResponse }
     * 
     */
    public DispVPNGrpShrdAccntResponse createDispVPNGrpShrdAccntResponse() {
        return new DispVPNGrpShrdAccntResponse();
    }

    /**
     * Create an instance of {@link ListVPNGrpShrdAccnt }
     * 
     */
    public ListVPNGrpShrdAccnt createListVPNGrpShrdAccnt() {
        return new ListVPNGrpShrdAccnt();
    }

    /**
     * Create an instance of {@link ListVPNGrpShrdAccntResponse }
     * 
     */
    public ListVPNGrpShrdAccntResponse createListVPNGrpShrdAccntResponse() {
        return new ListVPNGrpShrdAccntResponse();
    }

    /**
     * Create an instance of {@link SetGrpShrdMember }
     * 
     */
    public SetGrpShrdMember createSetGrpShrdMember() {
        return new SetGrpShrdMember();
    }

    /**
     * Create an instance of {@link SetGrpShrdMemberResponse }
     * 
     */
    public SetGrpShrdMemberResponse createSetGrpShrdMemberResponse() {
        return new SetGrpShrdMemberResponse();
    }

    /**
     * Create an instance of {@link DelGrpShrdMember }
     * 
     */
    public DelGrpShrdMember createDelGrpShrdMember() {
        return new DelGrpShrdMember();
    }

    /**
     * Create an instance of {@link DelGrpShrdMemberResponse }
     * 
     */
    public DelGrpShrdMemberResponse createDelGrpShrdMemberResponse() {
        return new DelGrpShrdMemberResponse();
    }

    /**
     * Create an instance of {@link DispGrpShrdMember }
     * 
     */
    public DispGrpShrdMember createDispGrpShrdMember() {
        return new DispGrpShrdMember();
    }

    /**
     * Create an instance of {@link DispGrpShrdMemberResponse }
     * 
     */
    public DispGrpShrdMemberResponse createDispGrpShrdMemberResponse() {
        return new DispGrpShrdMemberResponse();
    }

    /**
     * Create an instance of {@link ListGrpShrdMember }
     * 
     */
    public ListGrpShrdMember createListGrpShrdMember() {
        return new ListGrpShrdMember();
    }

    /**
     * Create an instance of {@link ListGrpShrdMemberResponse }
     * 
     */
    public ListGrpShrdMemberResponse createListGrpShrdMemberResponse() {
        return new ListGrpShrdMemberResponse();
    }

    /**
     * Create an instance of {@link ListtransResult }
     * 
     */
    public ListtransResult createListtransResult() {
        return new ListtransResult();
    }

    /**
     * Create an instance of {@link ListtransResultResponse }
     * 
     */
    public ListtransResultResponse createListtransResultResponse() {
        return new ListtransResultResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateEnterprise.class)
    public JAXBElement<RequestHeader> createCreateEnterpriseRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Enterprise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterprise", scope = CreateEnterprise.class)
    public JAXBElement<Enterprise> createCreateEnterpriseEnterprise(Enterprise value) {
        return new JAXBElement<Enterprise>(_CreateEnterpriseEnterprise_QNAME, Enterprise.class, CreateEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyEnterprise.class)
    public JAXBElement<RequestHeader> createModifyEnterpriseRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Enterprise1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterprise", scope = ModifyEnterprise.class)
    public JAXBElement<Enterprise1> createModifyEnterpriseEnterprise(Enterprise1 value) {
        return new JAXBElement<Enterprise1>(_CreateEnterpriseEnterprise_QNAME, Enterprise1 .class, ModifyEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteEnterprise.class)
    public JAXBElement<RequestHeader> createDeleteEnterpriseRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayEnterprise.class)
    public JAXBElement<RequestHeader> createDisplayEnterpriseRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListEnterprise.class)
    public JAXBElement<RequestHeader> createListEnterpriseRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateIntergroup.class)
    public JAXBElement<RequestHeader> createCreateIntergroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateIntergroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "interGroup", scope = CreateIntergroup.class)
    public JAXBElement<InterGroup> createCreateIntergroupInterGroup(InterGroup value) {
        return new JAXBElement<InterGroup>(_CreateIntergroupInterGroup_QNAME, InterGroup.class, CreateIntergroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteIntergroup.class)
    public JAXBElement<RequestHeader> createDeleteIntergroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteIntergroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "interGroup", scope = DeleteIntergroup.class)
    public JAXBElement<InterGroup> createDeleteIntergroupInterGroup(InterGroup value) {
        return new JAXBElement<InterGroup>(_CreateIntergroupInterGroup_QNAME, InterGroup.class, DeleteIntergroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListIntergroup.class)
    public JAXBElement<RequestHeader> createListIntergroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListIntergroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "interGroup", scope = ListIntergroup.class)
    public JAXBElement<InterGroup> createListIntergroupInterGroup(InterGroup value) {
        return new JAXBElement<InterGroup>(_CreateIntergroupInterGroup_QNAME, InterGroup.class, ListIntergroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateUserGroup.class)
    public JAXBElement<RequestHeader> createCreateUserGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userGroup", scope = CreateUserGroup.class)
    public JAXBElement<UserGroup> createCreateUserGroupUserGroup(UserGroup value) {
        return new JAXBElement<UserGroup>(_CreateUserGroupUserGroup_QNAME, UserGroup.class, CreateUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyUserGroup.class)
    public JAXBElement<RequestHeader> createModifyUserGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroup3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userGroup", scope = ModifyUserGroup.class)
    public JAXBElement<UserGroup3> createModifyUserGroupUserGroup(UserGroup3 value) {
        return new JAXBElement<UserGroup3>(_CreateUserGroupUserGroup_QNAME, UserGroup3 .class, ModifyUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteUserGroup.class)
    public JAXBElement<RequestHeader> createDeleteUserGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroup2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userGroup", scope = DeleteUserGroup.class)
    public JAXBElement<UserGroup2> createDeleteUserGroupUserGroup(UserGroup2 value) {
        return new JAXBElement<UserGroup2>(_CreateUserGroupUserGroup_QNAME, UserGroup2 .class, DeleteUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayUserGroup.class)
    public JAXBElement<RequestHeader> createDisplayUserGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroup2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userGroup", scope = DisplayUserGroup.class)
    public JAXBElement<UserGroup2> createDisplayUserGroupUserGroup(UserGroup2 value) {
        return new JAXBElement<UserGroup2>(_CreateUserGroupUserGroup_QNAME, UserGroup2 .class, DisplayUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListUserGroup.class)
    public JAXBElement<RequestHeader> createListUserGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroup4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "userGroup", scope = ListUserGroup.class)
    public JAXBElement<UserGroup4> createListUserGroupUserGroup(UserGroup4 value) {
        return new JAXBElement<UserGroup4>(_CreateUserGroupUserGroup_QNAME, UserGroup4 .class, ListUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateMember.class)
    public JAXBElement<RequestHeader> createCreateMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Member }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "member", scope = CreateMember.class)
    public JAXBElement<Member> createCreateMemberMember(Member value) {
        return new JAXBElement<Member>(_CreateMemberMember_QNAME, Member.class, CreateMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyMember.class)
    public JAXBElement<RequestHeader> createModifyMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Member1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "member", scope = ModifyMember.class)
    public JAXBElement<Member1> createModifyMemberMember(Member1 value) {
        return new JAXBElement<Member1>(_CreateMemberMember_QNAME, Member1 .class, ModifyMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteMember.class)
    public JAXBElement<RequestHeader> createDeleteMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayMember.class)
    public JAXBElement<RequestHeader> createDisplayMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListMember.class)
    public JAXBElement<RequestHeader> createListMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Member3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "member", scope = ListMember.class)
    public JAXBElement<Member3> createListMemberMember(Member3 value) {
        return new JAXBElement<Member3>(_CreateMemberMember_QNAME, Member3 .class, ListMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreatePBXLink.class)
    public JAXBElement<RequestHeader> createCreatePBXLinkRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreatePBXLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PBXLink1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pbxLink", scope = CreatePBXLink.class)
    public JAXBElement<PBXLink1> createCreatePBXLinkPbxLink(PBXLink1 value) {
        return new JAXBElement<PBXLink1>(_CreatePBXLinkPbxLink_QNAME, PBXLink1 .class, CreatePBXLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyPBXLink.class)
    public JAXBElement<RequestHeader> createModifyPBXLinkRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyPBXLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PBXLink2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pbxLink", scope = ModifyPBXLink.class)
    public JAXBElement<PBXLink2> createModifyPBXLinkPbxLink(PBXLink2 value) {
        return new JAXBElement<PBXLink2>(_CreatePBXLinkPbxLink_QNAME, PBXLink2 .class, ModifyPBXLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeletePBXLink.class)
    public JAXBElement<RequestHeader> createDeletePBXLinkRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeletePBXLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayPBXLink.class)
    public JAXBElement<RequestHeader> createDisplayPBXLinkRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayPBXLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListPBXLink.class)
    public JAXBElement<RequestHeader> createListPBXLinkRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListPBXLink.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateVIPList.class)
    public JAXBElement<RequestHeader> createCreateVIPListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateVIPList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VIPList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vipList", scope = CreateVIPList.class)
    public JAXBElement<VIPList> createCreateVIPListVipList(VIPList value) {
        return new JAXBElement<VIPList>(_CreateVIPListVipList_QNAME, VIPList.class, CreateVIPList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteVIPList.class)
    public JAXBElement<RequestHeader> createDeleteVIPListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteVIPList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VIPList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vipList", scope = DeleteVIPList.class)
    public JAXBElement<VIPList> createDeleteVIPListVipList(VIPList value) {
        return new JAXBElement<VIPList>(_CreateVIPListVipList_QNAME, VIPList.class, DeleteVIPList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListVIPList.class)
    public JAXBElement<RequestHeader> createListVIPListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListVIPList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VIPList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "vipList", scope = ListVIPList.class)
    public JAXBElement<VIPList> createListVIPListVipList(VIPList value) {
        return new JAXBElement<VIPList>(_CreateVIPListVipList_QNAME, VIPList.class, ListVIPList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateProfile.class)
    public JAXBElement<RequestHeader> createCreateProfileRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "profile", scope = CreateProfile.class)
    public JAXBElement<Profile> createCreateProfileProfile(Profile value) {
        return new JAXBElement<Profile>(_CreateProfileProfile_QNAME, Profile.class, CreateProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyProfile.class)
    public JAXBElement<RequestHeader> createModifyProfileRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "profile", scope = ModifyProfile.class)
    public JAXBElement<Profile1> createModifyProfileProfile(Profile1 value) {
        return new JAXBElement<Profile1>(_CreateProfileProfile_QNAME, Profile1 .class, ModifyProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteProfile.class)
    public JAXBElement<RequestHeader> createDeleteProfileRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "profile", scope = DeleteProfile.class)
    public JAXBElement<Profile2> createDeleteProfileProfile(Profile2 value) {
        return new JAXBElement<Profile2>(_CreateProfileProfile_QNAME, Profile2 .class, DeleteProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayProfile.class)
    public JAXBElement<RequestHeader> createDisplayProfileRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "profile", scope = DisplayProfile.class)
    public JAXBElement<Profile2> createDisplayProfileProfile(Profile2 value) {
        return new JAXBElement<Profile2>(_CreateProfileProfile_QNAME, Profile2 .class, DisplayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListProfile.class)
    public JAXBElement<RequestHeader> createListProfileRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "profile", scope = ListProfile.class)
    public JAXBElement<Profile3> createListProfileProfile(Profile3 value) {
        return new JAXBElement<Profile3>(_CreateProfileProfile_QNAME, Profile3 .class, ListProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListRestrictionTemplate.class)
    public JAXBElement<RequestHeader> createListRestrictionTemplateRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListRestrictionTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateRestriction.class)
    public JAXBElement<RequestHeader> createCreateRestrictionRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restriction", scope = CreateRestriction.class)
    public JAXBElement<Restriction> createCreateRestrictionRestriction(Restriction value) {
        return new JAXBElement<Restriction>(_CreateRestrictionRestriction_QNAME, Restriction.class, CreateRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteRestriction.class)
    public JAXBElement<RequestHeader> createDeleteRestrictionRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restriction", scope = DeleteRestriction.class)
    public JAXBElement<Restriction2> createDeleteRestrictionRestriction(Restriction2 value) {
        return new JAXBElement<Restriction2>(_CreateRestrictionRestriction_QNAME, Restriction2 .class, DeleteRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyRestriction.class)
    public JAXBElement<RequestHeader> createModifyRestrictionRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restriction", scope = ModifyRestriction.class)
    public JAXBElement<Restriction1> createModifyRestrictionRestriction(Restriction1 value) {
        return new JAXBElement<Restriction1>(_CreateRestrictionRestriction_QNAME, Restriction1 .class, ModifyRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayRestriction.class)
    public JAXBElement<RequestHeader> createDisplayRestrictionRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restriction", scope = DisplayRestriction.class)
    public JAXBElement<Restriction2> createDisplayRestrictionRestriction(Restriction2 value) {
        return new JAXBElement<Restriction2>(_CreateRestrictionRestriction_QNAME, Restriction2 .class, DisplayRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListRestriction.class)
    public JAXBElement<RequestHeader> createListRestrictionRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restriction3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restriction", scope = ListRestriction.class)
    public JAXBElement<Restriction3> createListRestrictionRestriction(Restriction3 value) {
        return new JAXBElement<Restriction3>(_CreateRestrictionRestriction_QNAME, Restriction3 .class, ListRestriction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateRestrictionUserList.class)
    public JAXBElement<RequestHeader> createCreateRestrictionUserListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateRestrictionUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteRestrictionUserList.class)
    public JAXBElement<RequestHeader> createDeleteRestrictionUserListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteRestrictionUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictionUserList1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restrictionUserList", scope = DeleteRestrictionUserList.class)
    public JAXBElement<RestrictionUserList1> createDeleteRestrictionUserListRestrictionUserList(RestrictionUserList1 value) {
        return new JAXBElement<RestrictionUserList1>(_DeleteRestrictionUserListRestrictionUserList_QNAME, RestrictionUserList1 .class, DeleteRestrictionUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListRestrictionUserList.class)
    public JAXBElement<RequestHeader> createListRestrictionUserListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListRestrictionUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictionUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restrictionUserList", scope = ListRestrictionUserList.class)
    public JAXBElement<RestrictionUserList> createListRestrictionUserListRestrictionUserList(RestrictionUserList value) {
        return new JAXBElement<RestrictionUserList>(_DeleteRestrictionUserListRestrictionUserList_QNAME, RestrictionUserList.class, ListRestrictionUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateRestrictionTime.class)
    public JAXBElement<RequestHeader> createCreateRestrictionTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateRestrictionTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteRestrictionTime.class)
    public JAXBElement<RequestHeader> createDeleteRestrictionTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteRestrictionTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictionTime1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restrictionTime", scope = DeleteRestrictionTime.class)
    public JAXBElement<RestrictionTime1> createDeleteRestrictionTimeRestrictionTime(RestrictionTime1 value) {
        return new JAXBElement<RestrictionTime1>(_DeleteRestrictionTimeRestrictionTime_QNAME, RestrictionTime1 .class, DeleteRestrictionTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayRestrictionTime.class)
    public JAXBElement<RequestHeader> createDisplayRestrictionTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayRestrictionTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictionTime4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restrictionTime", scope = DisplayRestrictionTime.class)
    public JAXBElement<RestrictionTime4> createDisplayRestrictionTimeRestrictionTime(RestrictionTime4 value) {
        return new JAXBElement<RestrictionTime4>(_DeleteRestrictionTimeRestrictionTime_QNAME, RestrictionTime4 .class, DisplayRestrictionTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListRestrictionTime.class)
    public JAXBElement<RequestHeader> createListRestrictionTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListRestrictionTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestrictionTime3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "restrictionTime", scope = ListRestrictionTime.class)
    public JAXBElement<RestrictionTime3> createListRestrictionTimeRestrictionTime(RestrictionTime3 value) {
        return new JAXBElement<RestrictionTime3>(_DeleteRestrictionTimeRestrictionTime_QNAME, RestrictionTime3 .class, ListRestrictionTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeletePersonalHunting.class)
    public JAXBElement<RequestHeader> createDeletePersonalHuntingRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeletePersonalHunting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyPersonalHunting.class)
    public JAXBElement<RequestHeader> createModifyPersonalHuntingRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyPersonalHunting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHunting3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHunting", scope = ModifyPersonalHunting.class)
    public JAXBElement<PersonalHunting3> createModifyPersonalHuntingPersonalHunting(PersonalHunting3 value) {
        return new JAXBElement<PersonalHunting3>(_ModifyPersonalHuntingPersonalHunting_QNAME, PersonalHunting3 .class, ModifyPersonalHunting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayPersonalHunting.class)
    public JAXBElement<RequestHeader> createDisplayPersonalHuntingRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayPersonalHunting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHunting1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHunting", scope = DisplayPersonalHunting.class)
    public JAXBElement<PersonalHunting1> createDisplayPersonalHuntingPersonalHunting(PersonalHunting1 value) {
        return new JAXBElement<PersonalHunting1>(_ModifyPersonalHuntingPersonalHunting_QNAME, PersonalHunting1 .class, DisplayPersonalHunting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListPersonalHunting.class)
    public JAXBElement<RequestHeader> createListPersonalHuntingRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListPersonalHunting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHunting1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHunting", scope = ListPersonalHunting.class)
    public JAXBElement<PersonalHunting1> createListPersonalHuntingPersonalHunting(PersonalHunting1 value) {
        return new JAXBElement<PersonalHunting1>(_ModifyPersonalHuntingPersonalHunting_QNAME, PersonalHunting1 .class, ListPersonalHunting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreatePersonalHuntListEntry.class)
    public JAXBElement<RequestHeader> createCreatePersonalHuntListEntryRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreatePersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuntingListEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "huntingListEntry", scope = CreatePersonalHuntListEntry.class)
    public JAXBElement<HuntingListEntry> createCreatePersonalHuntListEntryHuntingListEntry(HuntingListEntry value) {
        return new JAXBElement<HuntingListEntry>(_CreatePersonalHuntListEntryHuntingListEntry_QNAME, HuntingListEntry.class, CreatePersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyPersonalHuntListEntry.class)
    public JAXBElement<RequestHeader> createModifyPersonalHuntListEntryRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyPersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuntingListEntry1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "huntingListEntry", scope = ModifyPersonalHuntListEntry.class)
    public JAXBElement<HuntingListEntry1> createModifyPersonalHuntListEntryHuntingListEntry(HuntingListEntry1 value) {
        return new JAXBElement<HuntingListEntry1>(_CreatePersonalHuntListEntryHuntingListEntry_QNAME, HuntingListEntry1 .class, ModifyPersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeletePersonalHuntListEntry.class)
    public JAXBElement<RequestHeader> createDeletePersonalHuntListEntryRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeletePersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuntingListEntry2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "huntingListEntry", scope = DeletePersonalHuntListEntry.class)
    public JAXBElement<HuntingListEntry2> createDeletePersonalHuntListEntryHuntingListEntry(HuntingListEntry2 value) {
        return new JAXBElement<HuntingListEntry2>(_CreatePersonalHuntListEntryHuntingListEntry_QNAME, HuntingListEntry2 .class, DeletePersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayPersonalHuntListEntry.class)
    public JAXBElement<RequestHeader> createDisplayPersonalHuntListEntryRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayPersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuntingListEntry2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "huntingListEntry", scope = DisplayPersonalHuntListEntry.class)
    public JAXBElement<HuntingListEntry2> createDisplayPersonalHuntListEntryHuntingListEntry(HuntingListEntry2 value) {
        return new JAXBElement<HuntingListEntry2>(_CreatePersonalHuntListEntryHuntingListEntry_QNAME, HuntingListEntry2 .class, DisplayPersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListPersonalHuntListEntry.class)
    public JAXBElement<RequestHeader> createListPersonalHuntListEntryRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListPersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuntingListEntry2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "huntingListEntry", scope = ListPersonalHuntListEntry.class)
    public JAXBElement<HuntingListEntry2> createListPersonalHuntListEntryHuntingListEntry(HuntingListEntry2 value) {
        return new JAXBElement<HuntingListEntry2>(_CreatePersonalHuntListEntryHuntingListEntry_QNAME, HuntingListEntry2 .class, ListPersonalHuntListEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreatePersonalHuntSeqList.class)
    public JAXBElement<RequestHeader> createCreatePersonalHuntSeqListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreatePersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntSeqList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntSeqList", scope = CreatePersonalHuntSeqList.class)
    public JAXBElement<PersonalHuntSeqList> createCreatePersonalHuntSeqListPersonalHuntSeqList(PersonalHuntSeqList value) {
        return new JAXBElement<PersonalHuntSeqList>(_CreatePersonalHuntSeqListPersonalHuntSeqList_QNAME, PersonalHuntSeqList.class, CreatePersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyPersonalHuntSeqList.class)
    public JAXBElement<RequestHeader> createModifyPersonalHuntSeqListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyPersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntSeqList1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntSeqList", scope = ModifyPersonalHuntSeqList.class)
    public JAXBElement<PersonalHuntSeqList1> createModifyPersonalHuntSeqListPersonalHuntSeqList(PersonalHuntSeqList1 value) {
        return new JAXBElement<PersonalHuntSeqList1>(_CreatePersonalHuntSeqListPersonalHuntSeqList_QNAME, PersonalHuntSeqList1 .class, ModifyPersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeletePersonalHuntSeqList.class)
    public JAXBElement<RequestHeader> createDeletePersonalHuntSeqListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeletePersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntSeqList2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntSeqList", scope = DeletePersonalHuntSeqList.class)
    public JAXBElement<PersonalHuntSeqList2> createDeletePersonalHuntSeqListPersonalHuntSeqList(PersonalHuntSeqList2 value) {
        return new JAXBElement<PersonalHuntSeqList2>(_CreatePersonalHuntSeqListPersonalHuntSeqList_QNAME, PersonalHuntSeqList2 .class, DeletePersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayPersonalHuntSeqList.class)
    public JAXBElement<RequestHeader> createDisplayPersonalHuntSeqListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayPersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntSeqList2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntSeqList", scope = DisplayPersonalHuntSeqList.class)
    public JAXBElement<PersonalHuntSeqList2> createDisplayPersonalHuntSeqListPersonalHuntSeqList(PersonalHuntSeqList2 value) {
        return new JAXBElement<PersonalHuntSeqList2>(_CreatePersonalHuntSeqListPersonalHuntSeqList_QNAME, PersonalHuntSeqList2 .class, DisplayPersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListPersonalHuntSeqList.class)
    public JAXBElement<RequestHeader> createListPersonalHuntSeqListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListPersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntSeqList2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntSeqList", scope = ListPersonalHuntSeqList.class)
    public JAXBElement<PersonalHuntSeqList2> createListPersonalHuntSeqListPersonalHuntSeqList(PersonalHuntSeqList2 value) {
        return new JAXBElement<PersonalHuntSeqList2>(_CreatePersonalHuntSeqListPersonalHuntSeqList_QNAME, PersonalHuntSeqList2 .class, ListPersonalHuntSeqList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreatePersonalHuntTime.class)
    public JAXBElement<RequestHeader> createCreatePersonalHuntTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreatePersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntTime", scope = CreatePersonalHuntTime.class)
    public JAXBElement<PersonalHuntTime> createCreatePersonalHuntTimePersonalHuntTime(PersonalHuntTime value) {
        return new JAXBElement<PersonalHuntTime>(_CreatePersonalHuntTimePersonalHuntTime_QNAME, PersonalHuntTime.class, CreatePersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyPersonalHuntTime.class)
    public JAXBElement<RequestHeader> createModifyPersonalHuntTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyPersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntTime1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntTime", scope = ModifyPersonalHuntTime.class)
    public JAXBElement<PersonalHuntTime1> createModifyPersonalHuntTimePersonalHuntTime(PersonalHuntTime1 value) {
        return new JAXBElement<PersonalHuntTime1>(_CreatePersonalHuntTimePersonalHuntTime_QNAME, PersonalHuntTime1 .class, ModifyPersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeletePersonalHuntTime.class)
    public JAXBElement<RequestHeader> createDeletePersonalHuntTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeletePersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntTime2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntTime", scope = DeletePersonalHuntTime.class)
    public JAXBElement<PersonalHuntTime2> createDeletePersonalHuntTimePersonalHuntTime(PersonalHuntTime2 value) {
        return new JAXBElement<PersonalHuntTime2>(_CreatePersonalHuntTimePersonalHuntTime_QNAME, PersonalHuntTime2 .class, DeletePersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayPersonalHuntTime.class)
    public JAXBElement<RequestHeader> createDisplayPersonalHuntTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayPersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntTime2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntTime", scope = DisplayPersonalHuntTime.class)
    public JAXBElement<PersonalHuntTime2> createDisplayPersonalHuntTimePersonalHuntTime(PersonalHuntTime2 value) {
        return new JAXBElement<PersonalHuntTime2>(_CreatePersonalHuntTimePersonalHuntTime_QNAME, PersonalHuntTime2 .class, DisplayPersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListPersonalHuntTime.class)
    public JAXBElement<RequestHeader> createListPersonalHuntTimeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListPersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalHuntTime2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "personalHuntTime", scope = ListPersonalHuntTime.class)
    public JAXBElement<PersonalHuntTime2> createListPersonalHuntTimePersonalHuntTime(PersonalHuntTime2 value) {
        return new JAXBElement<PersonalHuntTime2>(_CreatePersonalHuntTimePersonalHuntTime_QNAME, PersonalHuntTime2 .class, ListPersonalHuntTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateC2CGroup.class)
    public JAXBElement<RequestHeader> createCreateC2CGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateC2CGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link C2CGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "c2CGroup", scope = CreateC2CGroup.class)
    public JAXBElement<C2CGroup> createCreateC2CGroupC2CGroup(C2CGroup value) {
        return new JAXBElement<C2CGroup>(_CreateC2CGroupC2CGroup_QNAME, C2CGroup.class, CreateC2CGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyC2CGroup.class)
    public JAXBElement<RequestHeader> createModifyC2CGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyC2CGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link C2CGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "c2CGroup", scope = ModifyC2CGroup.class)
    public JAXBElement<C2CGroup> createModifyC2CGroupC2CGroup(C2CGroup value) {
        return new JAXBElement<C2CGroup>(_CreateC2CGroupC2CGroup_QNAME, C2CGroup.class, ModifyC2CGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteC2CGroup.class)
    public JAXBElement<RequestHeader> createDeleteC2CGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteC2CGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link C2CGroup1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "c2CGroup", scope = DeleteC2CGroup.class)
    public JAXBElement<C2CGroup1> createDeleteC2CGroupC2CGroup(C2CGroup1 value) {
        return new JAXBElement<C2CGroup1>(_CreateC2CGroupC2CGroup_QNAME, C2CGroup1 .class, DeleteC2CGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListC2CGroup.class)
    public JAXBElement<RequestHeader> createListC2CGroupRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListC2CGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link C2CGroup1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "c2CGroup", scope = ListC2CGroup.class)
    public JAXBElement<C2CGroup1> createListC2CGroupC2CGroup(C2CGroup1 value) {
        return new JAXBElement<C2CGroup1>(_CreateC2CGroupC2CGroup_QNAME, C2CGroup1 .class, ListC2CGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateEnterpriseAdministrator.class)
    public JAXBElement<RequestHeader> createCreateEnterpriseAdministratorRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateEnterpriseAdministrator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterpriseAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterpriseAdmin", scope = CreateEnterpriseAdministrator.class)
    public JAXBElement<EnterpriseAdmin> createCreateEnterpriseAdministratorEnterpriseAdmin(EnterpriseAdmin value) {
        return new JAXBElement<EnterpriseAdmin>(_CreateEnterpriseAdministratorEnterpriseAdmin_QNAME, EnterpriseAdmin.class, CreateEnterpriseAdministrator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyEnterpriseAdministrator.class)
    public JAXBElement<RequestHeader> createModifyEnterpriseAdministratorRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyEnterpriseAdministrator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterpriseAdmin1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterpriseAdmin", scope = ModifyEnterpriseAdministrator.class)
    public JAXBElement<EnterpriseAdmin1> createModifyEnterpriseAdministratorEnterpriseAdmin(EnterpriseAdmin1 value) {
        return new JAXBElement<EnterpriseAdmin1>(_CreateEnterpriseAdministratorEnterpriseAdmin_QNAME, EnterpriseAdmin1 .class, ModifyEnterpriseAdministrator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteEnterpriseAdministrator.class)
    public JAXBElement<RequestHeader> createDeleteEnterpriseAdministratorRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteEnterpriseAdministrator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterpriseAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterpriseAdmin", scope = DeleteEnterpriseAdministrator.class)
    public JAXBElement<EnterpriseAdmin> createDeleteEnterpriseAdministratorEnterpriseAdmin(EnterpriseAdmin value) {
        return new JAXBElement<EnterpriseAdmin>(_CreateEnterpriseAdministratorEnterpriseAdmin_QNAME, EnterpriseAdmin.class, DeleteEnterpriseAdministrator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListEnterpriseAdministrator.class)
    public JAXBElement<RequestHeader> createListEnterpriseAdministratorRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListEnterpriseAdministrator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterpriseAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterpriseAdmin", scope = ListEnterpriseAdministrator.class)
    public JAXBElement<EnterpriseAdmin> createListEnterpriseAdministratorEnterpriseAdmin(EnterpriseAdmin value) {
        return new JAXBElement<EnterpriseAdmin>(_CreateEnterpriseAdministratorEnterpriseAdmin_QNAME, EnterpriseAdmin.class, ListEnterpriseAdministrator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreatePBXPrevent.class)
    public JAXBElement<RequestHeader> createCreatePBXPreventRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreatePBXPrevent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PBXPrevent1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pbxPrevent", scope = CreatePBXPrevent.class)
    public JAXBElement<PBXPrevent1> createCreatePBXPreventPbxPrevent(PBXPrevent1 value) {
        return new JAXBElement<PBXPrevent1>(_CreatePBXPreventPbxPrevent_QNAME, PBXPrevent1 .class, CreatePBXPrevent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeletePBXPrevent.class)
    public JAXBElement<RequestHeader> createDeletePBXPreventRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeletePBXPrevent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PBXPrevent1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pbxPrevent", scope = DeletePBXPrevent.class)
    public JAXBElement<PBXPrevent1> createDeletePBXPreventPbxPrevent(PBXPrevent1 value) {
        return new JAXBElement<PBXPrevent1>(_CreatePBXPreventPbxPrevent_QNAME, PBXPrevent1 .class, DeletePBXPrevent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListPBXPrevent.class)
    public JAXBElement<RequestHeader> createListPBXPreventRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListPBXPrevent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PBXPrevent1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pbxPrevent", scope = ListPBXPrevent.class)
    public JAXBElement<PBXPrevent1> createListPBXPreventPbxPrevent(PBXPrevent1 value) {
        return new JAXBElement<PBXPrevent1>(_CreatePBXPreventPbxPrevent_QNAME, PBXPrevent1 .class, ListPBXPrevent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreatePNPPolicy.class)
    public JAXBElement<RequestHeader> createCreatePNPPolicyRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreatePNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyPNPPolicy.class)
    public JAXBElement<RequestHeader> createModifyPNPPolicyRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyPNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNPPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pnpPolicy", scope = ModifyPNPPolicy.class)
    public JAXBElement<PNPPolicy> createModifyPNPPolicyPnpPolicy(PNPPolicy value) {
        return new JAXBElement<PNPPolicy>(_ModifyPNPPolicyPnpPolicy_QNAME, PNPPolicy.class, ModifyPNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeletePNPPolicy.class)
    public JAXBElement<RequestHeader> createDeletePNPPolicyRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeletePNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNPPolicy1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pnpPolicy", scope = DeletePNPPolicy.class)
    public JAXBElement<PNPPolicy1> createDeletePNPPolicyPnpPolicy(PNPPolicy1 value) {
        return new JAXBElement<PNPPolicy1>(_ModifyPNPPolicyPnpPolicy_QNAME, PNPPolicy1 .class, DeletePNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayPNPPolicy.class)
    public JAXBElement<RequestHeader> createDisplayPNPPolicyRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayPNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNPPolicy1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pnpPolicy", scope = DisplayPNPPolicy.class)
    public JAXBElement<PNPPolicy1> createDisplayPNPPolicyPnpPolicy(PNPPolicy1 value) {
        return new JAXBElement<PNPPolicy1>(_ModifyPNPPolicyPnpPolicy_QNAME, PNPPolicy1 .class, DisplayPNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListPNPPolicy.class)
    public JAXBElement<RequestHeader> createListPNPPolicyRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListPNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PNPPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pnpPolicy", scope = ListPNPPolicy.class)
    public JAXBElement<PNPPolicy> createListPNPPolicyPnpPolicy(PNPPolicy value) {
        return new JAXBElement<PNPPolicy>(_ModifyPNPPolicyPnpPolicy_QNAME, PNPPolicy.class, ListPNPPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateUniqueNumberList.class)
    public JAXBElement<RequestHeader> createCreateUniqueNumberListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumberlist", scope = CreateUniqueNumberList.class)
    public JAXBElement<UniqueNumberList> createCreateUniqueNumberListUniqueNumberlist(UniqueNumberList value) {
        return new JAXBElement<UniqueNumberList>(_CreateUniqueNumberListUniqueNumberlist_QNAME, UniqueNumberList.class, CreateUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyUniqueNumberList.class)
    public JAXBElement<RequestHeader> createModifyUniqueNumberListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumberList1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumberList", scope = ModifyUniqueNumberList.class)
    public JAXBElement<UniqueNumberList1> createModifyUniqueNumberListUniqueNumberList(UniqueNumberList1 value) {
        return new JAXBElement<UniqueNumberList1>(_ModifyUniqueNumberListUniqueNumberList_QNAME, UniqueNumberList1 .class, ModifyUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteUniqueNumberList.class)
    public JAXBElement<RequestHeader> createDeleteUniqueNumberListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumberList2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumberList", scope = DeleteUniqueNumberList.class)
    public JAXBElement<UniqueNumberList2> createDeleteUniqueNumberListUniqueNumberList(UniqueNumberList2 value) {
        return new JAXBElement<UniqueNumberList2>(_ModifyUniqueNumberListUniqueNumberList_QNAME, UniqueNumberList2 .class, DeleteUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayUniqueNumberList.class)
    public JAXBElement<RequestHeader> createDisplayUniqueNumberListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumberList2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumberList", scope = DisplayUniqueNumberList.class)
    public JAXBElement<UniqueNumberList2> createDisplayUniqueNumberListUniqueNumberList(UniqueNumberList2 value) {
        return new JAXBElement<UniqueNumberList2>(_ModifyUniqueNumberListUniqueNumberList_QNAME, UniqueNumberList2 .class, DisplayUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumberList1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumberList", scope = DisplayUniqueNumberListResponse.class)
    public JAXBElement<UniqueNumberList1> createDisplayUniqueNumberListResponseUniqueNumberList(UniqueNumberList1 value) {
        return new JAXBElement<UniqueNumberList1>(_ModifyUniqueNumberListUniqueNumberList_QNAME, UniqueNumberList1 .class, DisplayUniqueNumberListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListUniqueNumberList.class)
    public JAXBElement<RequestHeader> createListUniqueNumberListRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumberList2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumberList", scope = ListUniqueNumberList.class)
    public JAXBElement<UniqueNumberList2> createListUniqueNumberListUniqueNumberList(UniqueNumberList2 value) {
        return new JAXBElement<UniqueNumberList2>(_ModifyUniqueNumberListUniqueNumberList_QNAME, UniqueNumberList2 .class, ListUniqueNumberList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateUniqueNumber.class)
    public JAXBElement<RequestHeader> createCreateUniqueNumberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumber", scope = CreateUniqueNumber.class)
    public JAXBElement<UniqueNumber> createCreateUniqueNumberUniqueNumber(UniqueNumber value) {
        return new JAXBElement<UniqueNumber>(_CreateUniqueNumberUniqueNumber_QNAME, UniqueNumber.class, CreateUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyUniqueNumber.class)
    public JAXBElement<RequestHeader> createModifyUniqueNumberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumber1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumber", scope = ModifyUniqueNumber.class)
    public JAXBElement<UniqueNumber1> createModifyUniqueNumberUniqueNumber(UniqueNumber1 value) {
        return new JAXBElement<UniqueNumber1>(_CreateUniqueNumberUniqueNumber_QNAME, UniqueNumber1 .class, ModifyUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteUniqueNumber.class)
    public JAXBElement<RequestHeader> createDeleteUniqueNumberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumber2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumber", scope = DeleteUniqueNumber.class)
    public JAXBElement<UniqueNumber2> createDeleteUniqueNumberUniqueNumber(UniqueNumber2 value) {
        return new JAXBElement<UniqueNumber2>(_CreateUniqueNumberUniqueNumber_QNAME, UniqueNumber2 .class, DeleteUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayUniqueNumber.class)
    public JAXBElement<RequestHeader> createDisplayUniqueNumberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumber2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumber", scope = DisplayUniqueNumber.class)
    public JAXBElement<UniqueNumber2> createDisplayUniqueNumberUniqueNumber(UniqueNumber2 value) {
        return new JAXBElement<UniqueNumber2>(_CreateUniqueNumberUniqueNumber_QNAME, UniqueNumber2 .class, DisplayUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumber4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumber", scope = DisplayUniqueNumberResponse.class)
    public JAXBElement<UniqueNumber4> createDisplayUniqueNumberResponseUniqueNumber(UniqueNumber4 value) {
        return new JAXBElement<UniqueNumber4>(_CreateUniqueNumberUniqueNumber_QNAME, UniqueNumber4 .class, DisplayUniqueNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListUniqueNumber.class)
    public JAXBElement<RequestHeader> createListUniqueNumberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniqueNumber3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uniqueNumber", scope = ListUniqueNumber.class)
    public JAXBElement<UniqueNumber3> createListUniqueNumberUniqueNumber(UniqueNumber3 value) {
        return new JAXBElement<UniqueNumber3>(_CreateUniqueNumberUniqueNumber_QNAME, UniqueNumber3 .class, ListUniqueNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreatePBXMember.class)
    public JAXBElement<RequestHeader> createCreatePBXMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreatePBXMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PBXMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PBXMember", scope = CreatePBXMember.class)
    public JAXBElement<PBXMember> createCreatePBXMemberPBXMember(PBXMember value) {
        return new JAXBElement<PBXMember>(_CreatePBXMemberPBXMember_QNAME, PBXMember.class, CreatePBXMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyPBXMember.class)
    public JAXBElement<RequestHeader> createModifyPBXMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyPBXMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PBXMember1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PBXMember", scope = ModifyPBXMember.class)
    public JAXBElement<PBXMember1> createModifyPBXMemberPBXMember(PBXMember1 value) {
        return new JAXBElement<PBXMember1>(_CreatePBXMemberPBXMember_QNAME, PBXMember1 .class, ModifyPBXMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeletePBXMember.class)
    public JAXBElement<RequestHeader> createDeletePBXMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeletePBXMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplayPBXMember.class)
    public JAXBElement<RequestHeader> createDisplayPBXMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplayPBXMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListPBXMember.class)
    public JAXBElement<RequestHeader> createListPBXMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListPBXMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PBXMember3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PBXMember", scope = ListPBXMember.class)
    public JAXBElement<PBXMember3> createListPBXMemberPBXMember(PBXMember3 value) {
        return new JAXBElement<PBXMember3>(_CreatePBXMemberPBXMember_QNAME, PBXMember3 .class, ListPBXMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateBusinessTribe.class)
    public JAXBElement<RequestHeader> createCreateBusinessTribeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateBusinessTribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessTribe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "businessTribe", scope = CreateBusinessTribe.class)
    public JAXBElement<BusinessTribe> createCreateBusinessTribeBusinessTribe(BusinessTribe value) {
        return new JAXBElement<BusinessTribe>(_CreateBusinessTribeBusinessTribe_QNAME, BusinessTribe.class, CreateBusinessTribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifyBusinessTribe.class)
    public JAXBElement<RequestHeader> createModifyBusinessTribeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifyBusinessTribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessTribe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "businessTribe", scope = ModifyBusinessTribe.class)
    public JAXBElement<BusinessTribe> createModifyBusinessTribeBusinessTribe(BusinessTribe value) {
        return new JAXBElement<BusinessTribe>(_CreateBusinessTribeBusinessTribe_QNAME, BusinessTribe.class, ModifyBusinessTribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteBusinessTribe.class)
    public JAXBElement<RequestHeader> createDeleteBusinessTribeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteBusinessTribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessTribe1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "businessTribe", scope = DeleteBusinessTribe.class)
    public JAXBElement<BusinessTribe1> createDeleteBusinessTribeBusinessTribe(BusinessTribe1 value) {
        return new JAXBElement<BusinessTribe1>(_CreateBusinessTribeBusinessTribe_QNAME, BusinessTribe1 .class, DeleteBusinessTribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListBusinessTribe.class)
    public JAXBElement<RequestHeader> createListBusinessTribeRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListBusinessTribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessTribe1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "businessTribe", scope = ListBusinessTribe.class)
    public JAXBElement<BusinessTribe1> createListBusinessTribeBusinessTribe(BusinessTribe1 value) {
        return new JAXBElement<BusinessTribe1>(_CreateBusinessTribeBusinessTribe_QNAME, BusinessTribe1 .class, ListBusinessTribe.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = AddEnterpriseInBT.class)
    public JAXBElement<RequestHeader> createAddEnterpriseInBTRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, AddEnterpriseInBT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterpriseInBT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterpriseInbt", scope = AddEnterpriseInBT.class)
    public JAXBElement<EnterpriseInBT> createAddEnterpriseInBTEnterpriseInbt(EnterpriseInBT value) {
        return new JAXBElement<EnterpriseInBT>(_AddEnterpriseInBTEnterpriseInbt_QNAME, EnterpriseInBT.class, AddEnterpriseInBT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteEnterpriseInBT.class)
    public JAXBElement<RequestHeader> createDeleteEnterpriseInBTRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteEnterpriseInBT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterpriseInBT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterpriseInbt", scope = DeleteEnterpriseInBT.class)
    public JAXBElement<EnterpriseInBT> createDeleteEnterpriseInBTEnterpriseInbt(EnterpriseInBT value) {
        return new JAXBElement<EnterpriseInBT>(_AddEnterpriseInBTEnterpriseInbt_QNAME, EnterpriseInBT.class, DeleteEnterpriseInBT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListEnterpriseInBT.class)
    public JAXBElement<RequestHeader> createListEnterpriseInBTRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListEnterpriseInBT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterpriseInBT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterpriseInbt", scope = ListEnterpriseInBT.class)
    public JAXBElement<EnterpriseInBT> createListEnterpriseInBTEnterpriseInbt(EnterpriseInBT value) {
        return new JAXBElement<EnterpriseInBT>(_AddEnterpriseInBTEnterpriseInbt_QNAME, EnterpriseInBT.class, ListEnterpriseInBT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListUserGroupInEnterprise.class)
    public JAXBElement<RequestHeader> createListUserGroupInEnterpriseRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListUserGroupInEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnterpriseInBT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "enterpriseInbt", scope = ListUserGroupInEnterprise.class)
    public JAXBElement<EnterpriseInBT> createListUserGroupInEnterpriseEnterpriseInbt(EnterpriseInBT value) {
        return new JAXBElement<EnterpriseInBT>(_AddEnterpriseInBTEnterpriseInbt_QNAME, EnterpriseInBT.class, ListUserGroupInEnterprise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = CreateSMSTemplate.class)
    public JAXBElement<RequestHeader> createCreateSMSTemplateRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, CreateSMSTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ModifySMSTemplate.class)
    public JAXBElement<RequestHeader> createModifySMSTemplateRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ModifySMSTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DeleteSMSTemplate.class)
    public JAXBElement<RequestHeader> createDeleteSMSTemplateRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DeleteSMSTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DisplaySMSTemplate.class)
    public JAXBElement<RequestHeader> createDisplaySMSTemplateRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DisplaySMSTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListSMSTemplate.class)
    public JAXBElement<RequestHeader> createListSMSTemplateRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListSMSTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = SetVPNGrpShrdAccnt.class)
    public JAXBElement<RequestHeader> createSetVPNGrpShrdAccntRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, SetVPNGrpShrdAccnt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GPRSAccountLmt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gPRSAccountLmt", scope = SetVPNGrpShrdAccnt.class)
    public JAXBElement<GPRSAccountLmt> createSetVPNGrpShrdAccntGPRSAccountLmt(GPRSAccountLmt value) {
        return new JAXBElement<GPRSAccountLmt>(_SetVPNGrpShrdAccntGPRSAccountLmt_QNAME, GPRSAccountLmt.class, SetVPNGrpShrdAccnt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DelVPNGrpShrdAccnt.class)
    public JAXBElement<RequestHeader> createDelVPNGrpShrdAccntRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DelVPNGrpShrdAccnt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DispVPNGrpShrdAccnt.class)
    public JAXBElement<RequestHeader> createDispVPNGrpShrdAccntRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DispVPNGrpShrdAccnt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListVPNGrpShrdAccnt.class)
    public JAXBElement<RequestHeader> createListVPNGrpShrdAccntRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListVPNGrpShrdAccnt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = SetGrpShrdMember.class)
    public JAXBElement<RequestHeader> createSetGrpShrdMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, SetGrpShrdMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberAccountrLmt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "memberAccountrLmt", scope = SetGrpShrdMember.class)
    public JAXBElement<MemberAccountrLmt> createSetGrpShrdMemberMemberAccountrLmt(MemberAccountrLmt value) {
        return new JAXBElement<MemberAccountrLmt>(_SetGrpShrdMemberMemberAccountrLmt_QNAME, MemberAccountrLmt.class, SetGrpShrdMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DelGrpShrdMember.class)
    public JAXBElement<RequestHeader> createDelGrpShrdMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DelGrpShrdMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = DispGrpShrdMember.class)
    public JAXBElement<RequestHeader> createDispGrpShrdMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, DispGrpShrdMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListGrpShrdMember.class)
    public JAXBElement<RequestHeader> createListGrpShrdMemberRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListGrpShrdMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "requestHeader", scope = ListtransResult.class)
    public JAXBElement<RequestHeader> createListtransResultRequestHeader(RequestHeader value) {
        return new JAXBElement<RequestHeader>(_CreateEnterpriseRequestHeader_QNAME, RequestHeader.class, ListtransResult.class, value);
    }

}
