package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity(name = "role_perm")
public class RolePermRelationShip extends Model {
	
	public int role_id;
	
	public int perm_id;
	
	public RolePermRelationShip(int role_id, int perm_id){
		
		this.role_id = role_id;
		this.perm_id = perm_id;
		
	}
	
}
