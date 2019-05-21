package functions;

import java.util.*;
import java.io.IOException;
import java.math.*;

/*
 *  
 * For Distinction-level tasks only
 * 
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Security;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
*/


public class Node {


	
	
	public Node(Integer n, Integer e, Integer d, Integer K, Boolean encrypt, Boolean useBI, Map<Integer,Node> m, MessageTrackCheck t) {
		// CONSTRUCTOR: 
		//      n is node ID,
		//      e is the exponent for the function f()
		//      d is the exponent for the function g()
		//      K is the divisor in f() and g()
		//      encrypt is true if messages are encrypted, false otherwise
		//      useBI is true if BigInteger should be used for NodeTransitionFunction, false otherwise
		//      m is a non-null map of node IDs to node objects
		//      t is an instance of MessageTrackCheck

		// TODO
	}
	
	public Boolean hasMsgEncryption() {
		// PRE: -
		// POST: Returns true if messages are encrypted, false otherwise

		// TODO
		
		return null;
	}
	
	public Boolean isDestinationNode(String msg) {
		// PRE: msg is an augmented message (i.e. containing 3 characters at the end indicating destination node)
		// POST: Returns true if this is the destination node, false otherwise
		//       E.g. For node 6, will return true for "hello006"

		// TODO
		
		return null;
	}


	public Boolean transmittedMessage() {
		// PRE: -
		// POST: Return true if this node has transmitted a message, false otherwise

		// TODO
		
		return null;
	}

	public void sendMsgToNode(Node n, String msg, Integer r, NodeTransitionFunction f) {
		// PRE: n is a non-null node,
		//      msg is a message,
		//      r is the current value of r from the forward transition function.
		//      f is the forward transition function
		// POST: invokes receiveMsgFromNode on node n

		// TODO
	}
	
	public void sendMsgToNode(Node n, String msg, BigInteger r, NodeTransitionFunction f) {
		// PRE: n is a non-null node,
		//      msg is a message,
		//      r is the current value of r from the forward transition function.
		//      f is the forward transition function
		// POST: invokes receiveMsgFromNode on node n

		// TODO
	}
	
	public void receiveMsgFromNode(String msg, Integer id, Integer r, NodeTransitionFunction f) {
		// PRE: msg is a message, 
		//      id is the ID of the sending node,
		//      r is the current value of r from the forward transition function,
		//      f is the forward transition function
		// POST: If this is the destination node, stop;
		//       otherwise, send the message onwards.
		//       Add ID of current (receiving) node to local MessageTrackCheck

		// TODO
	}

	public void receiveMsgFromNode(String msg, Integer id, BigInteger r, NodeTransitionFunction f) {
		// PRE: msg is a message, 
		//      id is the ID of the sending node,
		//      r is the current value of r from the forward transition function,
		//      f is the forward transition function
		// POST: If this is the destination node, stop;
		//       otherwise, send the message onwards.
		//       Add ID of current (receiving) node to local MessageTrackCheck

		// TODO
	}
	
	public String getMsg() {
		// PRE: -
		// POST: Returns the current received (non-augmented) message, null if no received message

		// TODO

		return null;
	}

	/*
	*/
	

	/*
	 * Initiator 
	 */
	
	public NodeTransitionFunction createForwardNodeTransitionFunction() {
		// PRE: -
		// POST: Creates a NodeTransitionFunction using this node's public function f() with parameters e, K
		
		// TODO

		return null;
	}
	
	public String addDestIDToMsg(String msg, Integer v) {
		// PRE: msg is a message, v is a node ID
		// POST: Returns a string that concatenates v as a 3-character string to the end of msg.
		//       E.g. for msg="hello", v=6, returns "hello006"
		
		// TODO

		return null;
	}

	public Integer firstRForInitiatingMessage(Integer k, Integer v) {
		// PRE: v is destination node ID, k is number of steps
		// POST: Uses the trapdoor function inverse, applied to destination node v with number of steps k, to calculate the node path;
		//       returns value of r that determines first step on node path

		// TODO

		return null;
	}

	public BigInteger firstRForInitiatingMessage(Integer k, BigInteger v) {
		// PRE: v is destination node ID, k is number of steps as a BigInteger
		// POST: Uses the trapdoor function inverse, applied to destination node v with number of steps k, to calculate the node path;
		//       returns value of r that determines first step on node path

		// TODO

		return null;
	}
	

	public void initiateMessage(String msg, Integer k, Integer v) {
		// PRE: msg is an original message, v is destination node ID, k is number of steps
		// POST: Adds destination ID to msg; 
		//       sends augmented msg to the next node, as determined by firstRForInitiatingMessage(k, v), 
		//       along with forward transition function
		
		// TODO
	}
	
	public Integer getID() {
		// PRE: -
		// POST: Returns node ID

		// TODO
		
		return null;
	}
	
	public Integer getE() {
		// PRE: -
		// POST: Returns value of e in this node's function f()
		
		// TODO

		return null;
	}
	
	public Integer getK() {
		// PRE: -
		// POST: Returns value of K in this node's function f()
		
		// TODO

		return null;
	}
	

	// DISTINCTION: guess initiator
	
	public Integer guessInitiator() {
		// PRE: -
		// POST: Guesses a node to be the initiator if it can track back through corrupted nodes
		//       along two separate paths
		//      returns this node ID, or -1 if no guess

		// TODO

		return null;
	}

	public void setCorrupt() {
		// PRE: -
		// POST: Sets a node to be corrupt
		
		// TODO
	}
	
	public Integer lastSender() {
		// PRE: -
		// POST: If a node is not corrupt, returns -1;
		//       if a node is corrupt, returns ID of node that last sent it a message,
		//       -1 if it has not been sent any messages

		// TODO

		return null;
	}
	

	// DISTINCTION: encryption
	
	/*
	public String basicHashFunction (String m) {
		// PRE: -
		// POST: Sums the numeric value of each character, using Character.getNumericValue(), 
		//       takes mod 100 of the total; returns as a 3-char string
		
		// TODO
		
		return null;		
	}
	
	public Key getPublicKey() {
		// PRE:
		// POST: Returns the node's public key (null if hasMsgEncryption() is false)
		
		// TODO

		return null;
	}

	public byte[] encryptedMsg(String msg, Key chosenPubKey) {
		// PRE: msg is a message, chosenPubKey is a public key
		// POST: Returns msg encrypted with chosenPubKey (null if hasMsgEncryption() is false or chosenPubKey is null)
		
		// TODO

		return null;
	}
	
	public byte[] decryptedMsg(byte[] msg) {
		// PRE: msg is an encrypted message as a byte array
		// POST: Returns msg decrypted using node's private key (null if hasMsgEncryption() is false)

		// TODO

		return null;
	}

	public String addCheckToMsg(String msg) {
		// PRE: msg is a message
		// POST: Returns a string that concatenates the basicHashFunction of msg
		//       E.g. for msg="hello", v=6, returns "hello006"
		
		// TODO

		return null;
	}


	public Boolean isDestinationNode(byte[] msg) {
		// PRE: msg is an augmented encrypted message (i.e. containing 3 check digits at the end)
		// POST: Returns true if this is the destination node, false otherwise
		//       Determines if this is the destination by decrypting msg, 
		//       and comparing the hashed decrypted core msg (i.e. up to the last 3 characters) 
		//       against the last 3 chars of the decrypted msg 
		
		// TODO

		return null;
	}
	 */

	public static void main(String[] args) {
		
	}

}
