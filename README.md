# javaProgrammingDA
                                                                   1.	Introduction
Merkle trees are a useful data structure that we can build using hash pointers is a binary tree. Merkle tree is a tree data structure with leaf nodes and non leaf nodes. It is also known as Hash tree. The reason behind it is it only stores the hashes in its nodes instead of data. In its leaf nodes, it will store the hash of the data. Non leaf nodes contain the hash of its children. 
 
A binary tree with hash pointers is known as a Merkle tree, named after its inventor Ralph Merkle. Suppose we have a number of blocks containing data. These blocks comprise the leaves of our tree. We group these data blocks into pairs of two, and then for each pair, we build a data structure that has two hash pointers, one to each of these blocks. These data structures make the next level up of the tree. We in turn group these into groups of two, and for each pair, create a new data structure that contains the hash of each. We continue doing this until we reach a single block, the root of the tree
In a Merkle tree, data blocks are grouped in pairs and the hash of each of these blocks is stored in a parent node. The parent nodes are in turn grouped in pairs and their hashes stored one level up the tree. This continues all the way up the tree until we reach the root node. As before, we remember just the hash pointer at the head of the tree. We now have the ability traverse down through the hash pointers to any point in the list. This allows us make sure that the data hasn’t been tampered with because, just like we saw with the block chain, if an adversary tampers with some data block at the bottom of the tree, that will cause the hash pointer that’s one level up to not match, and even if he continues to tamper with this block, the change will eventually propagate to the top of the tree where he won’t be able to tamper with the hash pointer that we’ve stored. So again, any attempt to tamper with any piece of data will be detected by just remembering the hash pointer at the top.
                                                               Applications of Merkle tree

•	Apache Cassandra uses Merkle Trees to detect inconsistencies.

•	Git uses a merkle tree to store its data.

•	Ethereum uses a Merkle Patricia Trie.

•	It is a fundamental part of the blockchain.
![merkle-tree-image](https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Hash_Tree.svg/1200px-Hash_Tree.svg.png)

                                                              Why Merkle tree is used in blockchain?
A blockchain is comprised of various blocks that are linked with one another, hence the name blockchain. Merkle tree stores the blockchain data in an efficient and secure way. It can verify blockchain data very quickly. It also provides quick movement of large amounts of data from one computer node to the other blockchain network.
Every transaction that occurs on the blockchain network has a hash associated with it. These hashes are stored in the form of a tree-like structure such that each hash is linked to its parent. Since numerous transactions are stored on a particular block. All the transaction hashes that are present in the block are also hashed, which results in a Merkle root.

                                                                         2.Architecture
Another nice feature of Merkle trees is that, unlike the block chain that we built before, it allows a concise proof of membership. Say that someone wants to prove that a certain data block is a member of the Merkle Tree. As usual, we remember just the root. Then they need to show us this data block, and the blocks on the path from the data block to the root.
 
We can ignore the rest of the tree, as the blocks on this path are enough to allow us to verify the hashes all the way up to the root of the tree. If there are n nodes in the tree, only about log(n) items need to be shown. And since each step just requires computing the hash of the child block, it takes about log(n) time for us to verify it. And so even if the Merkle tree contains a very large number of blocks, we can still prove membership in a relatively short time. Verification thus runs in time and space that’s logarithmic in the number of nodes in the tree.

![mekle-tree-parts](https://www.simplilearn.com/ice9/free_resources_article_thumb/Merkle_Tree_In_Blockchain_5.png)

                                                                         3.Algorithm
It is a tree data structure where non-leaf nodes are a hash of its child nodes and leaf nodes are a hash of a block of data. It has a branching factor of 2 (it can have a maximum of 2 children). Merkel trees allow efficient and secure verification of the contents of a large data structure.
The three operations that can be performed on Merkle tree are: 
1.	Find 
2.	Add Node 
3.	Delete Node


![merkle-tree-algorithm](https://assets-global.website-files.com/60540b6d30224a7cb015203a/6087c85e1dd3ab8430844060_5bd197ef4a3567f6215b9948_84POAllbRqJMRc_WSEoyjVpUMVd5rOzpGplyZJUVtyIzoQvnhvcb6QGkdcaubKpUjqZWpm42TDeE3RAm-OzHUL0hy_GiaUdYXHlQRwi91U83O1fqCxuXK-uB1mL2TZ8OQRZshFed.jpeg)

                                                         4.Illustrate various steps of Algorithm
Algorithm of find function in Merkle tree

•	Step 1: We will take tree and key as parameters.

•	Step 2: If the tree is null then we will return null.

•	Step 3: If the tree->key is equal to the key we will return the tree.

•	Step 4: If the key is smaller than tree->key then we will return find(tree->left, key)

•	Step 5: else return find(tree->right, key)

Algorithm to add a node in Merkle tree.

•	Step 1: We will take key and value as parameters.

•	Step 2: Take the hash(key) and store it in a variable called index.

•	Step 3: store (struct node*) arr[index].head in a pointer called tree of datatype node.

•	Step 4: create a new node with its key as key and value as value and both links as null.

•	Step 5: If the tree is null then assign the new node to the head and increment the size by 1.

•	Step 6: If the tree is not null then we will check if the key is already present in the tree using the find function.

•	Step 7: If the key is already present in the tree then we will update the value.

•	Step 8: If it is not present in the tree then we will use the insert function to insert the element.

Algorithm to delete a node in Merkle tree.

•	Step 1: We will take a key as a parameter.

•	Step 2: Take the hash(key) and store it in a variable called index.

•	Step 3: store (struct node*) arr[index].head in a pointer called tree of datatype node.

•	Step 4: If the tree is null then the key is not present.

•	Step 5: If the tree is not null then we will check if the key is already present in the tree using the find function.

•	Step 6: If the find function returns null then the key is not present in the tree.

•	Step 7: If it is not null then we will use the remove function to delete the element.
