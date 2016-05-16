package andatech.organizapp.shared.domain.trello;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@SuppressWarnings("serial")
@Generated("org.jsonschema2pojo")
public class Membership implements Serializable{

private String id;
private String idMember;
private String memberType;
private Boolean unconfirmed;
private Boolean deactivated;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The id
*/
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The idMember
*/
public String getIdMember() {
return idMember;
}

/**
* 
* @param idMember
* The idMember
*/
public void setIdMember(String idMember) {
this.idMember = idMember;
}

/**
* 
* @return
* The memberType
*/
public String getMemberType() {
return memberType;
}

/**
* 
* @param memberType
* The memberType
*/
public void setMemberType(String memberType) {
this.memberType = memberType;
}

/**
* 
* @return
* The unconfirmed
*/
public Boolean getUnconfirmed() {
return unconfirmed;
}

/**
* 
* @param unconfirmed
* The unconfirmed
*/
public void setUnconfirmed(Boolean unconfirmed) {
this.unconfirmed = unconfirmed;
}

/**
* 
* @return
* The deactivated
*/
public Boolean getDeactivated() {
return deactivated;
}

/**
* 
* @param deactivated
* The deactivated
*/
public void setDeactivated(Boolean deactivated) {
this.deactivated = deactivated;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}