package org.cloudfoundry.identity.uaa.login.bean;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Domain {
	private String name;
	private boolean wildcard;
	private String owning_organization_guid;
	private String[] organization_guids;
	private String[] space_guids;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWildcard() {
		return wildcard;
	}

	public void setWildcard(boolean wildcard) {
		this.wildcard = wildcard;
	}

	public String getOwning_organization_guid() {
		return owning_organization_guid;
	}

	public void setOwning_organization_guid(String owning_organization_guid) {
		this.owning_organization_guid = owning_organization_guid;
	}

	public String[] getOrganization_guids() {
		return organization_guids;
	}

	public void setOrganization_guids(String[] organization_guids) {
		this.organization_guids = organization_guids;
	}

	public String[] getSpace_guids() {
		return space_guids;
	}

	public void setSpace_guids(String[] space_guids) {
		this.space_guids = space_guids;
	}

}
