package cn.chinatowercom.cams.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bstek.dorado.annotation.PropertyDef;

/**
 * 
 * 合同台账
 * 
 * @author Kevin Yang (mailto:kevin.yang@bstek.com)
 * @since 2017年3月15日
 */
@Entity
@Table(name = "CONTRACT_LEDGER")
public class ContractLedger implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_", length = 64)
	private String id;
	
	@Column(name = "PREFECTURE_LEVEL_", length = 125)
	@PropertyDef(label = "地市")
	private String prefectureLevel;
	
	@Column(name = "COUNTY_", length = 125)
	@PropertyDef(label = "区县")
	private String county;
	
	@Column(name = "SITE_CODE_", length = 64)
	@PropertyDef(label = "站址编码")
	private String siteCode;

	
	@Column(name = "PHYSICS_SITE_CODE_")
	@PropertyDef(label = "物理站址编码")
	private String physicsSiteCode;
	
	@Column(name = "SITE_NAME_")
	@PropertyDef(label = "站址名称")
	private String siteName;
	
	@Column(name = "INJECTION_TYPE_", length = 64)
	@PropertyDef(label = "注资类型")
	private String injectionType;
	
	@Column(name = "ORIGINAL_PROPERTY_UNITS_")
	@PropertyDef(label = "原产权单位")
	private String originalPropertyUnits;
	
	@Column(name = "SHARING_", length = 512)
	@PropertyDef(label = "共享情况")
	private String Sharing;
	
	@Column(name = "SITE_LEVEL_", length = 64)
	@PropertyDef(label = "站点级别")
	private String siteLevel;
	
	@Column(name = "AREA_", length = 64)
	@PropertyDef(label = "片区")
	private String area;
	
	@Column(name = "LONGITUDE_")
	@PropertyDef(label = "经度")
	private BigDecimal longitude;
	
	@Column(name = "LATITUDE_")
	@PropertyDef(label = "纬度")
	private BigDecimal latitude;

	
	@Column(name = "BASE_ADDRESS_")
	@PropertyDef(label = "基站地址")
	private String baseAddress;
	
	@Column(name = "CONSTRUCTION_SCENE_")
	@PropertyDef(label = "建设场景")
	private String constructionScene;
	
	@Column(name = "LEASING_TYPE_", length = 64)
	@PropertyDef(label = "租赁类型")
	private String leasingType;
	
	@Column(name = "FIRST_CHARGE_")
	@PropertyDef(label = "第一负责人（名字和电话）")
	private String firstCharge;
	
	@Column(name = "SECOND_CHARGE_")
	@PropertyDef(label = "第二负责人（名字和电话）")
	private String secondCharge;

	@Column(name = "KEY_ADMIN_")
	@PropertyDef(label = "钥匙管理员（名字和电话）")
	private String keyAdmin;
	
	@Column(name = "MAINTAIN_PERSONNEL_")
	@PropertyDef(label = "维系人员（名字和电话）")
	private String maintainPersonnel;
	
	@Column(name = "POWER_SUPPLY_MODE_", length = 64)
	@PropertyDef(label = "供电方式")
	private String powerSupplyMode;

	@Column(name = "POWER_SUPPLY_OWNER_")
	@PropertyDef(label = "供电业主")
	private String powerSupplyOwner;

	@Column(name = "POWER_SUPPLY_OWNER_CONTACT_")
	@PropertyDef(label = "供电业主联系方式")
	private String powerSupplyOwnerContact;
	
	@Column(name = "POWER_SUPPLY_PAY_PERIOD_")
	@PropertyDef(label = "供电结算周期")
	private String powerSupplyPayPeriod;
	
	@Column(name = "GOTO_SIGN_LETTER_CODE_")
	@PropertyDef(label = "转签函编码")
	private String gotoSignLetterCode;
	
	@Column(name = "ORIGINAL_CONTRACT_NAME_")
	@PropertyDef(label = "原合同名称")
	private String originalContractName;
	
	@Column(name = "CONTRACT_CODE_")
	@PropertyDef(label = "合同编码")
	private String contractCode;

	@Column(name = "HAS_CONTRACT_SCANNING_")
	@PropertyDef(label = "是否有合同扫描件")
	private boolean hasContractScanning;
	
	@Column(name = "CONTRACT_AGENT_")
	@PropertyDef(label = "合同经办人")
	private String contractAgent;
	
	@Column(name = "LEASING_OWNNER_")
	@PropertyDef(label = "租赁业主")
	private String leasingOwnner;
	
	

	

}
